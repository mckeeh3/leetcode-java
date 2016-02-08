package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution326.
 */
public class Solution326Test {
    @Test
    public void threeWorks() {
        Solution326 solution326 = new Solution326();
        boolean solution = solution326.isPowerOfThree(3);

        assertTrue(solution);
    }

    @Test
    public void fiveWorks() {
        Solution326 solution326 = new Solution326();
        boolean solution = solution326.isPowerOfThree(5);

        assertFalse(solution);
    }

    @Test
    public void sixWorks() {
        Solution326 solution326 = new Solution326();
        boolean solution = solution326.isPowerOfThree(6);

        assertFalse(solution);
    }

    @Test
    public void nineWorks() {
        Solution326 solution326 = new Solution326();
        boolean solution = solution326.isPowerOfThree(9);

        assertTrue(solution);
    }

    @Test
    public void tenWorks() {
        Solution326 solution326 = new Solution326();
        boolean solution = solution326.isPowerOfThree(10);

        assertFalse(solution);
    }

    @Test
    public void maxIntegerWorks() {
        Solution326 solution326 = new Solution326();
        boolean solution = solution326.isPowerOfThree(Integer.MAX_VALUE);

        assertFalse(solution);
    }

    @Test
    public void maxIntegerMinusOneWorks() {
        Solution326 solution326 = new Solution326();
        boolean solution = solution326.isPowerOfThree(1024 * 1024 * 1024);

        assertTrue(solution);
    }
}
