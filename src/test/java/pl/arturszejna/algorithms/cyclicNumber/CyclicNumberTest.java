package pl.arturszejna.algorithms.cyclicNumber;

import org.junit.Assert;
import org.junit.Test;

public class CyclicNumberTest {

    @Test
    public void givenNumberWhoIsCyclicWhenCheckedThenIsTrue() {
        //Given
        String number = "142857";
        //When
        Boolean isCyclic = CyclicNumber.isCyclic(number);
        //Then
        Assert.assertTrue(isCyclic);
    }

    @Test
    public void givenNumberWhoIsNotCyclicWhenCheckedThenIsFalse() {
        //Given
        String number = "012233";
        //When
        Boolean isCyclic = CyclicNumber.isCyclic(number);
        //Then
        Assert.assertFalse(isCyclic);
    }

}