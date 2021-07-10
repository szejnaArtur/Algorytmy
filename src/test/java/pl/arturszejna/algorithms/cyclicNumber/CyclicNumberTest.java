package pl.arturszejna.algorithms.cyclicNumber;

import org.junit.Assert;
import org.junit.Test;

public class CyclicNumberTest {

    @Test
    public void isCyclicIsTrueTest() {
        Assert.assertTrue(CyclicNumber.isCyclic("142857"));
    }

    @Test
    public void isCyclicIsFalseTest() {
        Assert.assertFalse(CyclicNumber.isCyclic("012233"));
    }

}