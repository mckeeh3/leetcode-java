package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution009.
 */
public class Solution009Test {
    @Test
    public void value11isPalindrome() {
        Solution009 solution009 = new Solution009();
        assertTrue(solution009.isPalindrome(11));
    }

    @Test
    public void value101isPalindrome() {
        Solution009 solution009 = new Solution009();
        assertTrue(solution009.isPalindrome(101));
    }

    @Test
    public void value1231isNotPalindrome() {
        Solution009 solution009 = new Solution009();
        assertFalse(solution009.isPalindrome(1231));
    }

    @Test
    public void value1221isPalindrome() {
        Solution009 solution009 = new Solution009();
        assertTrue(solution009.isPalindrome(1221));
    }

    @Test
    public void value12321isPalindrome() {
        Solution009 solution009 = new Solution009();
        assertTrue(solution009.isPalindrome(12321));
    }

    @Test
    public void value9876789isPalindrome() {
        Solution009 solution009 = new Solution009();
        assertTrue(solution009.isPalindrome(9876789));
    }

    @Test
    public void value9806789isNotPalindrome() {
        Solution009 solution009 = new Solution009();
        assertFalse(solution009.isPalindrome(9806789));
    }

    @Test
    public void valueMinus2147483648isNotPalindrome() {
        Solution009 solution009 = new Solution009();
        assertFalse(solution009.isPalindrome(-2147483648));
    }

    @Test
    public void valueMinus2147447412isNotPalindrome() {
        Solution009 solution009 = new Solution009();
        assertFalse(solution009.isPalindrome(-2147447412));
    }
}
