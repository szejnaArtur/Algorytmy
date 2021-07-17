package pl.arturszejna.algorithms.palindrome;

public class Palindrome {

    public static boolean isPalindrome(String string) {
        String palindrome = string.toLowerCase();
        boolean isPalindrome = true;

        int begin = 0;
        int end = palindrome.length() - 1;

        while (begin < end) {
            if (palindrome.charAt(begin) == ' '){
                begin++;
            }

            if (palindrome.charAt(end) == ' '){
                end--;
            }

            if (palindrome.charAt(begin) != palindrome.charAt(end)) {
                isPalindrome = false;
                break;
            }

            begin++;
            end--;
        }
        return isPalindrome;
    }

}
