package pl.arturszejna.sort.insertionSort;

class InsertionSort {

    static int[] sort(int[] array) {

        for (int i=0;i<array.length;i++) {
            int j=i;
            int v=array[i];

            while ((j>0) && (array[j-1]>v)) {
                array[j]=array[j-1];
                j--;
            }
            array[j]=v;
        }
        return array;
    }
}
