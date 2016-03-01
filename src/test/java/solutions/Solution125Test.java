package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Teses Solution125.
 */
public class Solution125Test {
    @Test
    public void nullStringIsFalse() {
        Solution125 solution125 = new Solution125();
        assertFalse(solution125.isPalindrome(null));
    }

    @Test
    public void emptyStringIsTrue() {
        Solution125 solution125 = new Solution125();
        assertTrue(solution125.isPalindrome(""));
    }

    @Test
    public void palindrome1IsTrue() {
        Solution125 solution125 = new Solution125();
        assertTrue(solution125.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void notPalindrome1IsFalse() {
        Solution125 solution125 = new Solution125();
        assertFalse(solution125.isPalindrome("race a car"));
    }
}
