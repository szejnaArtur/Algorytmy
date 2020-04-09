package pl.arturszejna.collections.array;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 5, 1, 2, 8, 11, 20, 11};
        Array.isDuplicateMessage(array);

        array = Array.removeAllDuplicates(array);

        System.out.println(Arrays.toString(array));
    }
}
