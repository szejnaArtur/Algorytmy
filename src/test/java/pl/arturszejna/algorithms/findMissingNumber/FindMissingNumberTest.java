package pl.arturszejna.algorithms.findMissingNumber;

import org.junit.Assert;
import org.junit.Test;

public class FindMissingNumberTest {

    @Test
    public void nativeFindMissingTest() {
        //Given
        int[] array = {0, 2, 1, 4, 3, 5, 6, 7, 8, 9, 11};
        //Then
        int missingNumber = FindMissingNumber.nativeFindMissing(array);
        //When
        Assert.assertEquals(10, missingNumber);
    }

    @Test
    public void memoryGreedyFindMissingTest() {
        //Given
        int[] array = {0, 2, 1, 4, 3, 5, 6, 7, 8, 9, 11};
        //Then
        int missingNumber = FindMissingNumber.memoryGreedyFindMissing(array);
        //When
        Assert.assertEquals(10, missingNumber);
    }

    @Test
    public void optimalFindMissingTest() {
        //Given
        int[] array = {0, 2, 1, 4, 3, 5, 6, 7, 8, 9, 11};
        //Then
        int missingNumber = FindMissingNumber.optimalFindMissing(array);
        //When
        Assert.assertEquals(10, missingNumber);
    }

}