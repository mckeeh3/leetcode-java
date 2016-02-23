package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution172.
 */
public class Solution172Test {
    @Test
    public void trailingZerosInFactorial0Is0() {
        Solution172 solution172 = new Solution172();
        assertEquals(0, solution172.trailingZeroes(0));
    }

    @Test
    public void trailingZerosInFactorial1Is0() {
        Solution172 solution172 = new Solution172();
        assertEquals(0, solution172.trailingZeroes(1));
    }

    @Test
    public void trailingZerosInFactorial2Is0() {
        Solution172 solution172 = new Solution172();
        assertEquals(0, solution172.trailingZeroes(2));
    }

    @Test
    public void trailingZerosInFactorial5Is1() {
        Solution172 solution172 = new Solution172();
        assertEquals(1, solution172.trailingZeroes(5));
    }

    @Test
    public void trailingZerosInFactorial10Is2() {
        Solution172 solution172 = new Solution172();
        assertEquals(2, solution172.trailingZeroes(10));
    }

    @Test
    public void trailingZerosInFactorial15Is3() {
        Solution172 solution172 = new Solution172();
        assertEquals(3, solution172.trailingZeroes(15));
    }

    @Test
    public void trailingZerosInFactorial70Is3() {
        Solution172 solution172 = new Solution172();
        assertEquals(16, solution172.trailingZeroes(70));
    }

    @Test
    public void trailingZerosInFactorial1008Is250() {
        Solution172 solution172 = new Solution172();
        assertEquals(250, solution172.trailingZeroes(1008));
    }

    @Test
    public void trailingZerosInFactorial2031Is506() {
        Solution172 solution172 = new Solution172();
        assertEquals(506, solution172.trailingZeroes(2031));
    }

    @Test
    public void trailingZerosInFactorial2065Is514() {
        Solution172 solution172 = new Solution172();
        assertEquals(514, solution172.trailingZeroes(2065));
    }
}
