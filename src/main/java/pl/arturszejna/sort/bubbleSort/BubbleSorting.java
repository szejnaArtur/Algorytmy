package pl.arturszejna.sort.bubbleSort;

class BubbleSorting {

    static int[] sort(int[] actuals) {
        int lenght = actuals.length - 1;
        boolean isSorted = false;
        for ( int i = 0; i < lenght; i++ ) {
            if (isSorted) {
                break;
            } else {
                isSorted = true;
                for ( int j = 0; j < lenght - i; j++ ) {
                    if (actuals[j] > actuals[j + 1]) {
                        isSorted = false;
                        int n = actuals[j + 1];

                        actuals[j + 1] = actuals[j];
                        actuals[j] = n;
                    }
                }
            }
        }
        return actuals;
    }
}
