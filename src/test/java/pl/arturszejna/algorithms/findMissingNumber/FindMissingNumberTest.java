package pl.arturszejna.algorithms.findMissingNumber;

import org.junit.Assert;
import org.junit.Test;

public class FindMissingNumberTest {

    @Test
    public void givenArrayWhenFindMissingNumberThenNumberIsCorrect_native() {
        //Given
        int[] array = {0, 2, 1, 4, 3, 5, 6, 7, 8, 9, 11};
        //When
        int missingNumber = FindMissingNumber.nativeFindMissing(array);
        //Then
        Assert.assertEquals(10, missingNumber);
    }

    @Test
    public void givenArrayWhenFindMissingNumberThenNumberIsCorrect_memoryGreedy() {
        //Given
        int[] array = {0, 2, 1, 4, 3, 5, 6, 7, 8, 9, 11};
        //When
        int missingNumber = FindMissingNumber.memoryGreedyFindMissing(array);
        //Then
        Assert.assertEquals(10, missingNumber);
    }

    @Test
    public void givenArrayWhenFindMissingNumberThenNumberIsCorrect_optimal() {
        //Given
        int[] array = {0, 2, 1, 4, 3, 5, 6, 7, 8, 9, 11};
        //When
        int missingNumber = FindMissingNumber.optimalFindMissing(array);
        //Then
        Assert.assertEquals(10, missingNumber);
    }

}