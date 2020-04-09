package pl.arturszejna.algorithms.stairs;

/* -- How many step combinations to get up x number of steps? -- */

class Staris {
    static int calculateStepWays(int numberOfStairs) {
        if (numberOfStairs <= 2 && numberOfStairs > 0)
            return numberOfStairs;
        else if (numberOfStairs > 2)
            return calculateStepWays(numberOfStairs - 1) + calculateStepWays(numberOfStairs - 2);
        else
            throw new IllegalArgumentException("Please, enter a value greater than 0.");
    }

    static int calculateStepWaysNonRecursive(int numberOfStairs) {
        if (numberOfStairs <= 2 && numberOfStairs > 0)
            return numberOfStairs;
        else if (numberOfStairs > 2) {
            int first = 1;
            int second = 2;
            int nth = 2;
            for ( int i = 3; i <= numberOfStairs; i++ ) {
                nth = first + second;
                first = second;
                second = nth;
            }
            return nth;
        } else
            throw new IllegalArgumentException("Please, enter a value greater than 0.");
    }

}
