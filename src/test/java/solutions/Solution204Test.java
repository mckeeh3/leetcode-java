package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution204.
 */
public class Solution204Test {
    @Test
    public void primesIn2is0() {
        Solution204 solution204 = new Solution204();
        assertEquals(0, solution204.countPrimes(2));
    }

    @Test
    public void primesIn10is4() {
        Solution204 solution204 = new Solution204();
        assertEquals(4, solution204.countPrimes(10));
    }

    @Test
    public void primesIn100is4() {
        Solution204 solution204 = new Solution204();
        assertEquals(25, solution204.countPrimes(100));
    }

    @Test
    public void primesIn1000is178() {
        Solution204 solution204 = new Solution204();
        assertEquals(168, solution204.countPrimes(1000));
    }
}
