package org.newdawn.slick;

import org.newdawn.slick.util.Log;

public class KeyPress {
    private static final Log LOG = new Log(KeyPress.class);

    public interface Action { void doAction(float delta);}
    public interface KeyPressDelta { int getDelta(); }

    // todo rename the delta variables to something that makes sense
    private final boolean repeatEnabled;
    private final Action action;
    private final int ratePerSecond;
    private final boolean variableDelta;
    private final KeyPressDelta keyPressDelta;

    private long pressDelta;
    private long lastPress = 0L;

    private KeyPress(boolean repeatEnabled, KeyPressDelta delta, Action action, boolean enabledVariableDelta) {
        this.repeatEnabled = repeatEnabled;
        this.variableDelta = enabledVariableDelta;
        this.ratePerSecond = delta.getDelta();
        this.keyPressDelta = delta;
        this.action = action;

        // 1 second in nanos divided by rate per second
        this.pressDelta = pressDelta(ratePerSecond);
    }

    private static long pressDelta(int rps) {
        return 1000000000L / rps;
    }

    public static KeyPress of(boolean repeatEnabled, int ratePerSecond, Action action) {
        return new KeyPress(repeatEnabled, () -> ratePerSecond, action, false);
    }

    public static KeyPress of(boolean repeatEnabled, KeyPressDelta variableRatePerSecond, Action action) {
        return new KeyPress(repeatEnabled, variableRatePerSecond, action, true);
    }

    public boolean repeatEnabled() {
        return repeatEnabled;
    }

    public void pressKey() {
        this.lastPress = Time.getTime();
    }

    public void changePressDelta(int ratePerSecond) {
        pressDelta = pressDelta(ratePerSecond);
    }

    public boolean doAction() {
        long delta = Time.getTime() - lastPress;
        if (ratePerSecond != -1L && delta < (variableDelta ? pressDelta(keyPressDelta.getDelta()) : pressDelta)) {
            return false;
        }
        float keyPressD = delta / 1000000000.0f;
        action.doAction(keyPressD);
        lastPress = Time.getTime();
        return true;
    }

    private static int NOT_FOUND_KEY = -1;
    private static final KeyPress NOT_FOUND = new KeyPress(false, () -> 60, (delta) -> LOG.info("No key found: {}", NOT_FOUND_KEY), false);
    public static KeyPress notFound(int key) {
        NOT_FOUND_KEY = key;
        return NOT_FOUND;
    }
}
