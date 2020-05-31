package pl.arturszejna.array;

class Array {

    private int[] values;


    Array(int[] array) {
        values = array;
    }

    public int[] getValues() {
        return values;
    }

    public void setValues(int[] values) {
        this.values = values;
    }

    int countNumberOfArrayElement(int value){
        if(values!=null){
            int sum = 0;
            for(int i:values){
                if(i == value) sum++;
            }
            return sum;
        } else return 0;
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

    int sumNegativeArrayElements() {
        if (values != null) {
            int sum = 0;
            for ( int i : values ) {
                if (i < 0)
                    sum += i;
            }
            return sum;
        } else {
            return 0;
        }
    }

    int countNegativeArrayElements() {
        if (values != null) {
            int count = 0;
            for ( int i : values ) {
                if (i < 0)
                    count++;
            }
            return count;
        } else {
            return 0;
        }
    }

    int sumPositiveArrayElements() {
        if (values != null) {
            int sum = 0;
            for ( int i : values ) {
                if (i > 0)
                    sum += i;
            }
            return sum;
        } else {
            return 0;
        }
    }

    int countPositiveArrayElements() {
        if (values != null) {
            int count = 0;
            for ( int i : values ) {
                if (i > 0)
                    count++;
            }
            return count;
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
