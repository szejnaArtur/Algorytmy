package pl.arturszejna.algorithms.division;

public class App {

    public static void main(String[] args) {

        System.out.println(Division.divide(10, 5));
        System.out.println((double) 10/5);
        System.out.println(10%5);
        System.out.println(Division.modulo(10, 5));
        System.out.println();
        System.out.println(Division.divide(20, 2));
        System.out.println((double) 20/2);
        System.out.println(20%2);
        System.out.println(Division.modulo(20, 2));
        System.out.println();
        System.out.println(Division.divide(5, 2));
        System.out.println((double) 5/2);
        System.out.println(5%2);
        System.out.println(Division.modulo(5, 2));
        System.out.println();
        System.out.println(Division.divide(8, 10));
        System.out.println((double) 8/10);
        System.out.println(8%10);
        System.out.println(Division.modulo(8, 10));
        System.out.println();

        System.out.println(Division.divide(14, 8));
        System.out.println((double) 14/8);
        System.out.println(14%8);
        System.out.println(Division.modulo(14, 8));
//        System.out.println("Reszta dziesiętna: " + Division.rest(6, 8));
        System.out.println();
        System.out.println(Division.divide(10, 0));


    }

}
