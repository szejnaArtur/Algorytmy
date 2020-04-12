package pl.arturszejna.algorithms.fibonnacciSequence;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class FibonnacciTest {

    @Ignore
    @Test
    public void example() {

    }

    @Test
    public void givenTheTenthNumberOfFibonacciSequence() {
        int fib = Fibonnacci.displayRecursively(10);
        Assert.assertEquals(55, fib);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenANumberLessThan0() {
        int fib = Fibonnacci.displayRecursively(-2);

    }
}
