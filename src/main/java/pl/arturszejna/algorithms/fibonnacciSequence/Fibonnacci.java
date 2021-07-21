package pl.arturszejna.algorithms.fibonnacciSequence;

//Write a function to find the nth number in a fibonnacci sequence.

class Fibonnacci {
    static int displayRecursively(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("numbers below 1 not allowed");
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return displayRecursively(n - 1) + displayRecursively(n - 2);
        }
    }

    static int displayNonRecursively(int n) {
        if (n < 1) throw new IllegalArgumentException("numbers below 1 not allowed");
        if (n <= 2) return 1;

        int first = 1;
        int second = 1;
        int nth = 2;

        for (int i = 3; i <= n; i++) {
            nth = first + second;
            first = second;
            second = nth;
        }

        return nth;
    }
}
