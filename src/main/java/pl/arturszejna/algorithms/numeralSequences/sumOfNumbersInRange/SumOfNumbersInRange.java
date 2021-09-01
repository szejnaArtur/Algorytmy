package pl.arturszejna.algorithms.numeralSequences.sumOfNumbersInRange;

//Oblicz sumę liczb całkowitych z przedziału <x, y>

public class SumOfNumbersInRange {
    public static void main(String[] args) {
        System.out.println("Suma ciągu wynosi: " + sumOfRangeWithLoop(-5,10));
        System.out.println("Suma ciągu wynosi: " + sumOfRange(-5,10));
    }

    //złozoność obliczeniowa - O(n)
    //złozoność pamięciowa - O(1)
    public static double sumOfRangeWithLoop(int start, int end){
        long sum = 0L;
        for (int i = start; i <= end; i++){
            sum = sum + i;
        }
        return (double) sum;
    }

    //złozoność obliczeniowa - O(1)
    //złozoność pamięciowa - O(1)
    public static double sumOfRange(int start, int end){
        double startDouble = start;
        double endDouble = end;
        return ((startDouble + endDouble) / 2) * (endDouble - startDouble + 1);
    }
}
