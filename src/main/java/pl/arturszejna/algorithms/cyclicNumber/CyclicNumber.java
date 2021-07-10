package pl.arturszejna.algorithms.cyclicNumber;


//        Napisz funkcję isCyclic , która jako argument dostaje dowolnie dużą dodatnią liczbę całkowitą w
//        postaci łańcucha znaków. Liczba może być poprzedzona zerami, więc "0123" jest poprawnym
//        wejściem programu. Zadaniem jest napisanie funkcji isCyclic , która sprawdzi czy dana liczba
//        jest liczbą cykliczną.


import java.math.BigInteger;

public class CyclicNumber {

    public static Boolean isCyclic(String number) {

        String[] permutations = createPermutations(number);

        BigInteger value = new BigInteger(number);
        String formatString = "%0" + number.length() + "d";

        outerLoop:
        for (int multiplicator = 2; multiplicator <= number.length(); multiplicator++) {
            BigInteger multiplication = value.multiply(BigInteger.valueOf(multiplicator));
            String formattedResult = String.format(formatString, multiplication);
            for (String permutation : permutations) {
                if (formattedResult.equals(permutation)) {
                    continue outerLoop;
                }
            }
            return false;
        }
        return true;
    }

    private static String[] createPermutations(String number) {
        String[] permutations = new String[number.length()];

        for (int index = 0; index < permutations.length; index++) {
            permutations[index] = number.substring(index) + number.substring(0, index);
        }
        return permutations;
    }


}
