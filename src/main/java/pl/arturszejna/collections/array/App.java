package pl.arturszejna.collections.array;

public class App {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 5, 1, 2, 8, 11, 11, 8};
        Array.isDuplicateMessage(array);

        array = Array.removeAllDuplicates(array);

        for ( Integer x : array ) {
            System.out.print(x + " ");
        }

    }
}
