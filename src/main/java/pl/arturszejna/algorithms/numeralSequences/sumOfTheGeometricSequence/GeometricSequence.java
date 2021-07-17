package pl.arturszejna.algorithms.numeralSequences.sumOfTheGeometricSequence;

public class GeometricSequence {

    public static void main(String[] args) {
        double[] array = {3, 6, 12, 24};
        double sum = sum(array, 10);
        System.out.println(sum);
    }

    //złozoność obliczeniowa - O(1)
    //złozoność pamięciowa - O(1)
    private static double quotient(double first, double second) {
        return second / first;
    }

    //złozoność obliczeniowa - O(1)
    //złozoność pamięciowa - O(1)
    public static double sum(double[] array, int lenght) {
        double quotient = quotient(array[0], array[1]); // 1 operacja
        return array[0] * ((1 - Math.pow(quotient, lenght)) / (1 - quotient)); // 5 operacji
        // cały algorytm niezalerznie od długości ciągu wykonuje 6 operacji jest to złozoność stała.
    }

}
