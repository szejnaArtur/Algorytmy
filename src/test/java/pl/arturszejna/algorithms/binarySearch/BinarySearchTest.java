package pl.arturszejna.algorithms.binarySearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    public void givenSortedArrayWhenLookingNumberIsInArrayThenIndexIsCorrect() {
        //Given
        int[] tab = {-3, -1, 0, 2, 8, 12, 15, 17, 20, 27, 29, 35, 36, 37, 45};
        //When
        int findedIndex = BinarySearch.bianrySearch(tab, 12);
        //Then
        Assertions.assertEquals(5, findedIndex);
    }

    @Test
    public void givenSortedArrayWhenLookingNumberIsNotInArrayThenIndexIsNegative() {
        //Given
        int[] tab = {-3, -1, 0, 2, 8, 12, 15, 17, 20, 27, 29, 35, 36, 37, 45};
        //When
        int findedIndex = BinarySearch.bianrySearch(tab, 30);
        //Then
        Assertions.assertTrue(isNagative(findedIndex));
    }

    @Test
    public void givenSortedArrayWhenLookingNumberIsFirstInArrayThenIndexIsCorrect() {
        //Given
        int[] tab = {-3, -1, 0, 2, 8, 12, 15, 17, 20, 27, 29, 35, 36, 37, 45, 50, 55, 60};
        //When
        int findedIndex = BinarySearch.bianrySearch(tab, -3);
        //Then
        Assertions.assertEquals(0, findedIndex);
    }

    @Test
    public void givenSortedArrayWhenLookingNumberIsLastInArrayThenIndexIsCorrect() {
        //Given
        int[] tab = {-3, -1, 0, 2, 8, 12, 15, 17, 20, 27, 29, 35, 36, 37, 45};
        //When
        int findedIndex = BinarySearch.bianrySearch(tab, 45);
        //Then
        Assertions.assertEquals(14, findedIndex);
    }

    private boolean isNagative(int number){
        return number < 0;
    }

}