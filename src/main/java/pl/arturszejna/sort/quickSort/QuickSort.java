package pl.arturszejna.sort.quickSort;

class QuickSort {

    static void sort(int[] array, int start, int end) {

        int partition = partition(array, start, end);

        if (partition - 1 > start) {
            sort(array, start, partition - 1);
        }
        if (partition + 1 < end) {
            sort(array, partition + 1, end);
        }
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];

        for ( int i = start; i < end; i++ ) {
            if (array[i] < pivot) {
                int temp = array[start];
                array[start] = array[i];
                array[i] = temp;
                start++;
            }
        }

        int temp = array[start];
        array[start] = pivot;
        array[end] = temp;

        return start;
    }
}
