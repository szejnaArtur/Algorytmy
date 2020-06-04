package pl.arturszejna.algorithms.mathematic;

import java.util.Arrays;

public class SitoEratostenesa {

    private int[] tab;
    private int sqrt;

    SitoEratostenesa(int a, int b) {
        sqrt = (int) java.lang.Math.sqrt(b);

        tab = new int[b - a + 1];
        for ( int i = 0; i < tab.length; i++ ) {
            tab[i] = a + i;
        }
        sifted();
        print();
    }


    private void sifted() {
        int index = 0;

        if (tab[index] == 1) index++;

        while (tab[index] <= sqrt) {
            for ( int i = index + 1; i < tab.length; i++ ) {
                if (tab[i] % tab[index] == 0) tab[i] = 0;
            }

            do {
                index++;
            } while (tab[index] == 0);
        }
    }

    private void print() {
        for ( int value : tab ) {
            if (value != 0) {
                System.out.print(value + ", ");
            }
        }
        System.out.println();
    }
}
