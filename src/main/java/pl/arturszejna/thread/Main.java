package pl.arturszejna.thread;

import pl.arturszejna.thread.incrementingvolatileproblem.IncrementingRunnable;
import pl.arturszejna.thread.incrementingvolatileproblem.ReadingRunnable;
import pl.arturszejna.thread.incrementingvolatileproblem.SharedCounter;

public class Main {
    public static void main(String[] args) {

        SharedCounter counter = new SharedCounter();
        Thread counterThread = new Thread(new IncrementingRunnable(counter));
        Thread readingThread = new Thread(new ReadingRunnable(counter));

        counterThread.start();
        readingThread.start();

    }
}
