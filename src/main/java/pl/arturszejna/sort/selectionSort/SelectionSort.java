package pl.arturszejna.sort.selectionSort;

public class SelectionSort {

    //złożoność obliczeniowa O(n^2)
    public static int[] sort(int[] array) {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i; j < length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = min;
        }

        return array;
    }

}
