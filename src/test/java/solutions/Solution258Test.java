package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution258.
 */
public class Solution258Test {
    @Test
    public void addDigitsOf38Is2() {
        Solution258 solution258 = new Solution258();
        assertTrue(solution258.addDigits(38) == 2);
    }

    @Test
    public void addDigitsOf1853Is8() {
        Solution258 solution258 = new Solution258();
        assertTrue(solution258.addDigits(1853) == 8);
    }

    @Test
    public void addDigitsOf65536Is7() {
        Solution258 solution258 = new Solution258();
        assertTrue(solution258.addDigits(65536) == 7);
    }
}
