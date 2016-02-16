package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution231.
 */
public class Solution231Test {
    @Test
    public void isNotPowerOfTwo0() {
        Solution231 solution231 = new Solution231();
        assertFalse(solution231.isPowerOfTwo(0));
    }

    @Test
    public void isPowerOfTwo1() {
        Solution231 solution231 = new Solution231();
        assertTrue(solution231.isPowerOfTwo(1));
    }

    @Test
    public void isPowerOfTwo2() {
        Solution231 solution231 = new Solution231();
        assertTrue(solution231.isPowerOfTwo(2));
    }

    @Test
    public void isNotPowerOfTwo3() {
        Solution231 solution231 = new Solution231();
        assertFalse(solution231.isPowerOfTwo(3));
    }

    @Test
    public void isPowerOfTwo4() {
        Solution231 solution231 = new Solution231();
        assertTrue(solution231.isPowerOfTwo(4));
    }

    @Test
    public void isNotPowerOfTwoNegative2147483648() {
        Solution231 solution231 = new Solution231();
        assertFalse(solution231.isPowerOfTwo(-2147483648));
    }
}
