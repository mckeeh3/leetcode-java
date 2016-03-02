package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution070.
 */
public class Solution070Test {
    @Test
    public void climb0stairs() {
        Solution070 solution070 = new Solution070();
        assertEquals(0, solution070.climbStairs(0));
    }

    @Test
    public void climb1stair() {
        Solution070 solution070 = new Solution070();
        assertEquals(1, solution070.climbStairs(1));
    }

    @Test
    public void climb2stairs() {
        Solution070 solution070 = new Solution070();
        assertEquals(2, solution070.climbStairs(2));
    }

    @Test
    public void climb3stairs() {
        Solution070 solution070 = new Solution070();
        assertEquals(3, solution070.climbStairs(3));
    }

    @Test
    public void climb4stairs() {
        Solution070 solution070 = new Solution070();
        assertEquals(5, solution070.climbStairs(4));
    }

    @Test
    public void climb5stairs() {
        Solution070 solution070 = new Solution070();
        assertEquals(8, solution070.climbStairs(5));
    }

    @Test
    public void climb6stairs() {
        Solution070 solution070 = new Solution070();
        assertEquals(13, solution070.climbStairs(6));
    }

    @Test
    public void climb7stairs() {
        Solution070 solution070 = new Solution070();
        assertEquals(21, solution070.climbStairs(7));
    }

    @Test
    public void climb10stairs() {
        Solution070 solution070 = new Solution070();
        assertEquals(89, solution070.climbStairs(10));
    }

    @Test
    public void climb20stairs() {
        Solution070 solution070 = new Solution070();
        assertEquals(10946, solution070.climbStairs(20));
    }

    @Test
    public void climb44stairs() {
        Solution070 solution070 = new Solution070();
        assertEquals(1134903170, solution070.climbStairs(44));
    }
}
