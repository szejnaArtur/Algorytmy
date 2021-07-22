package pl.arturszejna.algorithms.division;

public class Division {

    public static String divide(int number, int divider) {
        if (divider == 0 || number == 0)
            throw new IllegalStateException("Nie poprawna wartość argumentu.");
        int quotient = 0;
        int modulo = number;

        while (modulo >= divider) {
            quotient++;
            modulo -= divider;
        }

        if (modulo == 0){
            return String.valueOf(quotient);
        } else {
            return quotient + "." + rest(modulo, divider);
        }
    }

    public static Integer modulo(int number, int divider){
        if (divider == 0 || number == 0)
            throw new IllegalStateException("Nie poprawna wartość argumentu.");
        int modulo = number;

        while (modulo >= divider) {
            modulo -= divider;
        }

        return modulo;
    }

    private static int rest(int number, int divider){
        number *= 10;

        int quotient = 0;
        int modulo = number;


        while (modulo >= divider) {
            quotient++;
            modulo -= divider;
        }

        if (modulo == 0){
            return quotient;
        } else {
            return (quotient*10) + rest(modulo, divider);
        }

    }

}
