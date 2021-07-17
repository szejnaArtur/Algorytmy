package pl.arturszejna.thread.synchronizedProblem;

public class SynchronizedCounter {

    @Override // przesłonienie motody z klasy Object
    public void finalize(){
        System.out.println("Garbage Collector is coming");
    }
    
}
