package pl.arturszejna.algorithms.binarySearch;

public class BinarySearch {

    //złożoność obliczeniowa O(log n)
    //złożoność pamięciowa O(1)
    public static int bianrySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = array[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }

}