package pl.arturszejna.algorithms.mathematic;

import org.junit.Assert;
import org.junit.Test;

public class MathTest {
    @Test
    public void countFactorialTest(){
        int factorialNumber = 5;
        int expected = 120;

        Assert.assertEquals(expected, Math.countFactorial(factorialNumber));
    }
}
