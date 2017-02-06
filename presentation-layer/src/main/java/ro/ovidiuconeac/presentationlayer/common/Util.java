package ro.ovidiuconeac.presentationlayer.common;

/**
 * Created by ovidiu on 12/29/16.
 *
 * A utility class whose purpose it only to simulate
 * a network latency. What is does it to delay the
 * running thread by the specified number of milliseconds.
 */

public abstract class Util {

    public static void simulateNetworkLatency(int millis) {
        // Pause current thread
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
