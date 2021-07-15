package pl.arturszejna.thread;

public class CustomThread extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            System.out.println("CustomThread loop: " + i);
        }
    }
}
