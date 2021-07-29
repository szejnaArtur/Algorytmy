package pl.arturszejna.algorithms.math.writtenAddition;

public class WrittenAddition {

    public static int[] sum(int[] firstArray, int[] secondArray) {
        int[] finalArray;
        int rest = 0;
        int arrayLength = Math.max(firstArray.length, secondArray.length);

        finalArray = new int[arrayLength + 1];

        for (int i = arrayLength - 1; i >= 0; i--) {
            if (rest != 0) {
                finalArray[i+1] += rest;
                rest = 0;
            }
            int sum = firstArray[i] + secondArray[i];
            if (sum >= 10) {
                rest++;
                finalArray[i+1] += sum - 10;
            } else {
                finalArray[i+1] += sum;
            }
        }
        finalArray[0] = rest;

        return finalArray;
    }
}
