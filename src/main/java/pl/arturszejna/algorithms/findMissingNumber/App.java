package pl.arturszejna.algorithms.findMissingNumber;

public class App {
    public static void main(String[] args) {

        int[] array = {0, 2, 1, 4, 3, 5, 6, 7, 8, 9, 11};

        int missingNumber = FindMissingNumber.nativeFindMissing(array);
        System.out.println(missingNumber);

        int missingNumber2 = FindMissingNumber.memoryGreedyFindMissing(array);
        System.out.println(missingNumber2);

        int missingNumber3 = FindMissingNumber.optimalFindMissing(array);
        System.out.println(missingNumber3);

    }
}
