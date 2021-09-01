package pl.arturszejna.algorithms.binarySearch;

public class App {
    public static void main(String[] args) {
        int[] array = new int[1000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println("Indeks: " + BinarySearch.bianrySearch(array, 10));
    }
}
