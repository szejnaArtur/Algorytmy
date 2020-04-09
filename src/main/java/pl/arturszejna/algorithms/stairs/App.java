package pl.arturszejna.algorithms.stairs;

public class App {
    public static void main(String[] args) {
        int value = 8;
        try {
            System.out.println("Rekurencyjnie:");
            System.out.println(Staris.calculateStepWays(value));
            System.out.println("Bez rekurencji:");
            System.out.println(Staris.calculateStepWaysNonRecursive(value));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
