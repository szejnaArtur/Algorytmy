package pl.arturszejna.algorithms.sumOfNumbersInRange;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfNumbersInRangeTest {

    @Test
    public void givenRangeOfNumbersWhenStartNumberIsNegativThenSumIsCorrect() {
        //Given
        int start = -5;
        int end = 10;
        //When
        Double sum = SumOfNumbersInRange.sumOfRange(start, end);
        //Then
        Assertions.assertEquals(40.0, sum);
    }

    @Test
    public void givenRangeOfNumbersWhenStartNumberIsZeroThenSumIsCorrect() {
        //Given
        int start = 0;
        int end = 10;
        //When
        Double sum = SumOfNumbersInRange.sumOfRange(start, end);
        //Then
        Assertions.assertEquals(55.0, sum);
    }









    @Test
    public void givenRangeOfNumbersWhenStartNumberIsPositiveThenSumIsCorrect() {
        //Given
        int start = 5;
        int end = 10;
        //When
        Double sum = SumOfNumbersInRange.sumOfRange(start, end);
        //Then
        Assertions.assertEquals(45.0, sum);
    }

}