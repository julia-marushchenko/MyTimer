/**
 *  Java program to implement timer.
 */

package com.myclock;

/**
 *  Timer class.
 */
public class Timer {

    private int seconds;
    private int limit;

    // Constructor with limit of time.
    public Timer(int limit) {
        this.limit = limit;
        this.seconds = 0;
    }

    // Method count() to add 1 second.
    public void count() {
        this.seconds = this.seconds + 1;

        if (this.seconds >= this.limit) {
            this.seconds = 0;
        }
    }

    // Method value() to return time.
    public int value() {
        return this.seconds;
    }

    // Method toString() to visualize time.
    public String toString() {
        if (this.seconds < 10) {
            return "0" + this.seconds;
        }

        return "" + this.value();
    }

    // JVM entry point.
    public static void main(String[] args) throws InterruptedException {

        // Time in seconds.
        int time = 55;

        // Creating Timer instance.
        Timer timer = new Timer(time);
        while (timer.value() <= time) {
            timer.count();
            System.out.println(timer);
            Thread.sleep(1000);
        }
    }
}