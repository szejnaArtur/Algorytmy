package pl.arturszejna.algorithms.mathematic;

class Math {
    static int countFactorial(int factorialNumber) {
        if (factorialNumber == 0) {
            return 1;
        } else {
            return countFactorial(factorialNumber - 1) * factorialNumber;
        }
    }
}
