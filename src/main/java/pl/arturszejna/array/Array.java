package pl.arturszejna.array;

class Array {

    private static int[] values;

    Array(int[] array) {
        values = array;
    }

    int sumArrayElement() {
        if (values != null) {
            int sum = 0;
            for ( int i : values )
                sum += i;
            return sum;
        } else {
            return 0;
        }
    }

    int findMin(int left, int right) {
        int minimumValue;

        if (left == right) {
            minimumValue = values[left];
        } else {
            if (left == right - 1) {
                minimumValue = Math.min(values[left], values[right]);
            } else {
                int middle = (left + right) / 2;
                int temporaryMinimum = findMin(left, middle);
                minimumValue = findMin(middle + 1, right);
                if (minimumValue > temporaryMinimum) {
                    minimumValue = temporaryMinimum;
                }
            }
        }
        return minimumValue;
    }

    int findMax(int left, int right) {
        int maxValue;

        if (left == right) {
            maxValue = values[left];
        } else {
            if (left == right - 1) {
                maxValue = Math.max(values[left], values[right]);
            } else {
                int middle = (left + right) / 2;
                int temporaryMinimum = findMax(left, middle);
                maxValue = findMax(middle + 1, right);
                if (maxValue < temporaryMinimum) {
                    maxValue = temporaryMinimum;
                }
            }
        }
        return maxValue;
    }
}
