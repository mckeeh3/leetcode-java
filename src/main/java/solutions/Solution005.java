package solutions;

/**
 * Given a string S, find the longest palindromic substring in S. You may assume that the maximum length of S is
 * 1000, and there exists one unique longest palindromic substring.
 *
 * @see <a href="https://leetcode.com/problems/longest-palindromic-substring/">5. Longest Palindromic Substring</a>
 */
public class Solution005 {
    public String longestPalindrome(String s) {
        if (s == null || s.trim().isEmpty()) {
            return "";
        } else if (s.length() == 1) {
            return s;
        }

        return longestPalindrome(s.toCharArray());
    }

    private String longestPalindrome(char[] text) {
        int pos = 0;
        String longestPalindrome = "";

        while (pos < text.length - longestPalindrome.length()) {
            String palindrome = palindromeScan(pos, longestPalindrome.length(), text);
            if (palindrome.length() > longestPalindrome.length()) {
                longestPalindrome = palindrome;
            } else {
                pos++;
            }
        }
        return longestPalindrome;
    }

    private String palindromeScan(int pos, int currentPalindromeLength, char[] text) {
        int posRight = text.length - 1;
        boolean palindromeFound = false;

        while (!palindromeFound && posRight + 1 - pos > currentPalindromeLength) {
            palindromeFound = isPalindrome(pos, posRight, text);
            if (!palindromeFound) {
                posRight--;
            }
        }
        return palindromeFound ? new String(text, pos, posRight + 1 - pos) : "";
    }

    private boolean isPalindrome(int posLeftStart, int posRightStart, char[] text) {
        int posLeft = posLeftStart;
        int posRight = posRightStart;

        while (posRight >= posLeftStart && text[posLeft] == text[posRight]) {
            posLeft++;
            posRight--;
        }
        return posLeftStart == posRight + 1 && posRightStart == posLeft - 1;
    }
}
