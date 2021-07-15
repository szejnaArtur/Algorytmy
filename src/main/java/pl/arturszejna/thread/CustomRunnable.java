package pl.arturszejna.thread;

public class CustomRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            System.out.println("CustomRunnable loop: " + i);
        }
    }
}
