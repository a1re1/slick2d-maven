package org.newdawn.slick;

import org.newdawn.slick.util.Log;

public class KeyPress {
    private static final Log LOG = new Log(KeyPress.class);

    public interface Action {
        void doAction(float delta);
    }

    private final boolean repeatEnabled;
    private final Action action;
    private final int ratePerSecond;
    private final long pressDelta;

    private long lastPress = 0L;

    public KeyPress(boolean repeatEnabled, int ratePerSecond, Action action) {
        this.repeatEnabled = repeatEnabled;
        this.ratePerSecond = ratePerSecond;
        this.action = action;

        // 1 second in nanos divided by rate per second
        this.pressDelta = 1000000000L / ratePerSecond;
    }

    public static KeyPress of(boolean repeatEnabled, int ratePerSecond, Action action) {
        return new KeyPress(repeatEnabled, ratePerSecond, action);
    }

    public boolean repeatEnabled() {
        return repeatEnabled;
    }

    public void pressKey() {
        this.lastPress = Time.getTime();
    }

    public boolean doAction() {
        long delta = Time.getTime() - lastPress;
        if (ratePerSecond != -1L && delta < pressDelta) {
            return false;
        }
        float keyPressD = delta / 1000000000.0f;
        action.doAction(keyPressD);
        lastPress = Time.getTime();
        return true;
    }

    private static int NOT_FOUND_KEY = -1;
    private static final KeyPress NOT_FOUND = new KeyPress(false, 60, (delta) -> LOG.info("No key found: {}", NOT_FOUND_KEY));
    public static KeyPress notFound(int key) {
        NOT_FOUND_KEY = key;
        return NOT_FOUND;
    }
}
