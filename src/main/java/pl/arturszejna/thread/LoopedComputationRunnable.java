package pl.arturszejna.thread;

public class LoopedComputationRunnable implements Runnable{

    @Override
    public void run() {
        int i =0;
        while (i<2){
            if (Thread.currentThread().isInterrupted()){
                System.out.println("Colsing Thread running LoopedComputationRunnable");
                return;
            }
            i++;
            i--;
        }
    }
}
