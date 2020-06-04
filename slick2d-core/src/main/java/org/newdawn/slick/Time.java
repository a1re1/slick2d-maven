package org.newdawn.slick;

public abstract class Time {
    private static int delta;
    private static long lastFrame = 0L;

    // Nano second time
    public static long getTime() {
        return System.nanoTime();
    }

    // Nano second time
    public static long getTimeMillis() {
        return System.nanoTime() / 1000000;
    }

    public static void updateDelta() {
        long time = getTime();
        delta = (int) (time - lastFrame);
        lastFrame = time;
    }

    public static long getLastFrame() {
        return lastFrame;
    }

    // Nano Delta
    public static int getDelta() {
        return delta;
    }

    // Time in seconds it took to complete last frame
    public static float deltaTime() {
        return ((float)getDelta()) / 1000000000.0f;
    }

    // Nano Delta
    public static int getDeltaMillis() {
        return getDelta() / 100000;
    }
}
