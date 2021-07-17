package pl.arturszejna.algorithms.palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeTest {

    @Test
    public void givenSentenceWhoIsCyclicWhenCheckedThenIsTrue() {
        //Given
        String palindrome = "łoi nas anioł";
        //When
        boolean isPalindrome = Palindrome.isPalindrome(palindrome);
        //Then
        Assertions.assertTrue(isPalindrome);
    }

    @Test
    public void givenWordWhoIsCyclicWhenCheckedThenIsTrue() {
        //Given
        String palindrome = "potop";
        //When
        boolean isPalindrome = Palindrome.isPalindrome(palindrome);
        //Then
        Assertions.assertTrue(isPalindrome);
    }

    @Test
    public void givenSentenceWithCapitalLetterWhoIsCyclicWhenCheckedThenIsTrue() {
        //Given
        String palindrome = "Jadzi W gęBę gWIZdaj";
        //When
        boolean isPalindrome = Palindrome.isPalindrome(palindrome);
        //Then
        Assertions.assertTrue(isPalindrome);
    }

    @Test
    public void givenWordWithCapitalLetterWhoIsCyclicWhenCheckedThenIsTrue() {
        //Given
        String palindrome = "Anilina";
        //When
        boolean isPalindrome = Palindrome.isPalindrome(palindrome);
        //Then
        Assertions.assertTrue(isPalindrome);
    }

    @Test
    public void givenSentenceWithCapitalLetterWhoIsNotCyclicWhenCheckedThenIsFalse() {
        //Given
        String palindrome = "Zakopane i cel wieczoru urocze i w lecie na pokaz";
        //When
        boolean isPalindrome = Palindrome.isPalindrome(palindrome);
        //Then
        Assertions.assertFalse(isPalindrome);
    }

}