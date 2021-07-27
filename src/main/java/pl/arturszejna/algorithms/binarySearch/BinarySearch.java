package pl.arturszejna.algorithms.binarySearch;

public class BinarySearch {

    //złożoność obliczeniowa O(log n)
    public static int search(int[] sortedList, int item) {
        int low = 0;
        int high = sortedList.length - 1;

        while (low <= high) {
            int mid = (low + high)/2;
            System.out.println(mid);
            int guess = sortedList[mid];
            if (guess == item) {
                return mid;
            } else {
                if (guess > item) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

}
