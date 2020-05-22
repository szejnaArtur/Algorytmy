package pl.arturszejna.sort.insertionSort;

import org.junit.Assert;
import org.junit.Test;

public class insertionSortTest {

    @Test
    public void sortTest() {
        int[] actuals = {5, 30, 1, 2, 99, 5, 3, 1, 25, 4, 5, 3, 50, 21, 4, 5, 72, 1, 2, 45, 3, 1, 2, 45, 3, 22, 2, 4};
        int[] expected = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 21, 22, 25, 30, 45, 45, 50, 72, 99};
        InsertionSort.sort(actuals);
        Assert.assertArrayEquals(expected, actuals);
    }

    @Test
    public void sortTestEasy() {
        int[] actuals = {5, 3, 1, 2, 4, 5, 3, 1, 2, 4};
        int[] expected = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        InsertionSort.sort(actuals);
        Assert.assertArrayEquals(expected, actuals);
    }

}
