package pl.arturszejna.converter;

public class Converter {

    public static int[] generatedIntegerArray(String numbers, int length) {
        String[] newStringArray = numbers.split("\n", length);
        int[] newIntegerArray = new int[length];

        for ( int i = 0; i < length; i++ )
            newIntegerArray[i] = Integer.parseInt(newStringArray[i]);

        return newIntegerArray;
    }
}
