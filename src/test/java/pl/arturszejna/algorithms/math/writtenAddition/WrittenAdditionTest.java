package pl.arturszejna.algorithms.math.writtenAddition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class WrittenAdditionTest {

    @Test
    public void givenTwoEasyArrayWhenSumThemThenIsEquals() {
        //Given
        int[] firstArray = {1, 2, 3, 4};
        int[] secondArray = {1, 2, 3, 4};
        //When
        String sum = Arrays.toString(WrittenAddition.sum(firstArray, secondArray));
        //Then
        Assertions.assertEquals("[0, 2, 4, 6, 8]", sum);
    }

    @Test
    public void givenTwoNormalArrayWhenSumThemThenIsEquals() {
        //Given
        int[] firstArray = {1, 2, 3, 4, 5, 6, 7};
        int[] secondArray = {1, 2, 3, 4, 5, 6, 7};
        //When
        String sum = Arrays.toString(WrittenAddition.sum(firstArray, secondArray));
        //Then
        Assertions.assertEquals("[0, 2, 4, 6, 9, 1, 3, 4]", sum);
    }

    @Test
    public void givenTwoHardArrayWhenSumThemThenIsEquals() {
        //Given
        int[] firstArray = {9, 9, 9, 9, 9, 9, 9};
        int[] secondArray = {9, 9, 9, 9, 9, 9, 9};
        //When
        String sum = Arrays.toString(WrittenAddition.sum(firstArray, secondArray));
        //Then
        Assertions.assertEquals("[1, 9, 9, 9, 9, 9, 9, 8]", sum);
    }

}