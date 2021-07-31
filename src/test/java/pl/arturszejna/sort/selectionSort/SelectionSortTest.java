package pl.arturszejna.sort.selectionSort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SelectionSortTest {

    @Test
    public void givenWordWithCapitalLetterWhoIsCyclicWhenCheckedThenIsTrue() {
        //Given
        int[] array = {12, 2, 10, 4, 8, 6};
        //When
        int[] newArray = SelectionSort.sort(array);
        //Then
        Assertions.assertEquals("[2, 4, 6, 8, 10, 12]", Arrays.toString(newArray));
    }
}