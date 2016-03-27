package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution029.
 */
public class Solution029Test {
    @Test
    public void divide8by2() {
        Solution029 solution029 = new Solution029();
        assertEquals(8 / 2, solution029.divide(8, 2));
    }

    @Test
    public void divide9by2() {
        Solution029 solution029 = new Solution029();
        assertEquals(9 / 2, solution029.divide(9, 2));
    }

    @Test
    public void divideNegative1By1() {
        Solution029 solution029 = new Solution029();
        assertEquals(-1, solution029.divide(-1, 1));
    }

    @Test
    public void divideNegative9ByNegative2() {
        Solution029 solution029 = new Solution029();
        assertEquals(-9 / -2, solution029.divide(-9, -2));
    }

    @Test
    public void divide9ByNegative2() {
        Solution029 solution029 = new Solution029();
        assertEquals(9 / -2, solution029.divide(9, -2));
    }

    @Test
    public void divideNegative9By2() {
        Solution029 solution029 = new Solution029();
        assertEquals(-9 / 2, solution029.divide(-9, 2));
    }

    @Test
    public void divideNegative2147483648ByNegative1() {
        Solution029 solution029 = new Solution029();
        assertEquals(Integer.MAX_VALUE, solution029.divide(-2147483648, -1));
    }

    @Test
    public void divideNegative2147483648By1() {
        Solution029 solution029 = new Solution029();
        assertEquals(Integer.MIN_VALUE, solution029.divide(Integer.MIN_VALUE, 1));
    }

    @Test
    public void divideNegative2147483648ByNegative2() {
        Solution029 solution029 = new Solution029();
        assertEquals(Integer.MIN_VALUE / -2, solution029.divide(-2147483648, -2));
    }

    @Test
    public void divide1036963541ByNegative24409858() {
        Solution029 solution029 = new Solution029();
        assertEquals(1036963541 / -24409858, solution029.divide(1036963541, -24409858));
    }
}
