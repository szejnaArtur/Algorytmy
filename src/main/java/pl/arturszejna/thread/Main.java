package pl.arturszejna.thread;

public class Main {
    public static void main(String[] args) {

        Thread thread01 = new Thread(new CustomRunnable());
        thread01.start();

        Thread thread02 = new CustomThread();
        thread02.start();
    }

    private static void mainThread() {
        System.out.println("Starting loop in thread: " + Thread.currentThread().getName());
//        for (int i = 1; i <= 10000; i++) {
//            System.out.println("main thread loop: " + i);
//        }
    }

    private static void secondThread() {
        System.out.println("Starting loop in thread: " + Thread.currentThread().getName());
//        for (int x = 1; x <= 10000; x++) {
//            System.out.println("second loop: " + x);
//        }
    }
}
