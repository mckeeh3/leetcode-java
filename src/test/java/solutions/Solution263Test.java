package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution263.
 */
public class Solution263Test {
    @Test
    public void isNotUgly0() {
        Solution263 solution263 = new Solution263();
        assertFalse(solution263.isUgly(0));
    }

    @Test
    public void isUgly1() {
        Solution263 solution263 = new Solution263();
        assertTrue(solution263.isUgly(1));
    }

    @Test
    public void isUgly6() {
        Solution263 solution263 = new Solution263();
        assertTrue(solution263.isUgly(6));
    }

    @Test
    public void isNotUgly7() {
        Solution263 solution263 = new Solution263();
        assertFalse(solution263.isUgly(7));
    }

    @Test
    public void isUgly8() {
        Solution263 solution263 = new Solution263();
        assertTrue(solution263.isUgly(8));
    }

    @Test
    public void isUgly9() {
        Solution263 solution263 = new Solution263();
        assertTrue(solution263.isUgly(9));
    }

    @Test
    public void isUgly10() {
        Solution263 solution263 = new Solution263();
        assertTrue(solution263.isUgly(10));
    }

    @Test
    public void isNotUgly11() {
        Solution263 solution263 = new Solution263();
        assertFalse(solution263.isUgly(11));
    }

    @Test
    public void isNotUgly14() {
        Solution263 solution263 = new Solution263();
        assertFalse(solution263.isUgly(14));
    }

    @Test
    public void isUgly15() {
        Solution263 solution263 = new Solution263();
        assertTrue(solution263.isUgly(15));
    }

    @Test
    public void isUgly20() {
        Solution263 solution263 = new Solution263();
        assertTrue(solution263.isUgly(20));
    }

    @Test
    public void isNotUgly62() {
        Solution263 solution263 = new Solution263();
        assertFalse(solution263.isUgly(62));
    }

    @Test
    public void isNotUgly937351770() {
        Solution263 solution263 = new Solution263();
        assertFalse(solution263.isUgly(937351770));
    }

    @Test
    public void isNotUgly905391974() {
        Solution263 solution263 = new Solution263();
        assertFalse(solution263.isUgly(905391974));
    }

    @Test
    public void isNotUgly1332185066() {
        Solution263 solution263 = new Solution263();
        assertFalse(solution263.isUgly(1332185066));
    }
}
