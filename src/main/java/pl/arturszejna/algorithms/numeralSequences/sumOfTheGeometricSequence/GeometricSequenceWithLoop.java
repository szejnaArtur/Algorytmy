package pl.arturszejna.algorithms.numeralSequences.sumOfTheGeometricSequence;

import java.util.Arrays;

public class GeometricSequenceWithLoop {

    public static void main(String[] args) {
        double[] array = createGeometricSequence(3, 2, 10);
        System.out.println(Arrays.toString(array));
        System.out.println(sum(array));
    }

    //złozoność obliczeniowa - O(n)
    //złozoność pamięciowa - O(n)
    public static double[] createGeometricSequence(double first, double quotient, int lenght){
        double[] array = new double[lenght];
        array[0] = first;
        for (int i = 1; i < lenght; i++){
            array[i] = array[i-1] * quotient;
        }
        return array;
    }

    //złozoność obliczeniowa - O(n)
    //złozoność pamięciowa - O(1)
    public static double sum(double[] array){
        double sum = 0;
        for (double element : array){
            sum += element;
        }
        return sum;
    }
}
