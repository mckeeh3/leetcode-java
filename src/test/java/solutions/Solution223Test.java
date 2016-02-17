package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution223.
 */
public class Solution223Test {
    @Test
    public void areaOverlapLowerRightCorner() {
        Solution223 solution223 = new Solution223();
        int area = solution223.computeArea(-3, 0, 3, 4, 0, -1, 9, 2);
        assertEquals(45, area);
    }

    @Test
    public void areaNoOverlapXOverlapY() {
        Solution223 solution223 = new Solution223();
        int area = solution223.computeArea(-3, 0, -1, 4, 0, -1, 9, 2);
        assertEquals(35, area);
    }

    @Test
    public void areaNoOverlapXNoOverlapY() {
        Solution223 solution223 = new Solution223();
        int area = solution223.computeArea(-3, 3, -1, 4, 0, -1, 9, 2);
        assertEquals(29, area);
    }

    @Test
    public void areaCompleteOverlap1() {
        Solution223 solution223 = new Solution223();
        int area = solution223.computeArea(-2, -1, 2, 2, -2, -2, 2, 2);
        assertEquals(16, area);
    }

    @Test
    public void areaCompleteOverlap2() {
        Solution223 solution223 = new Solution223();
        int area = solution223.computeArea(-2, -2, 2, 2, -1, -1, 1, 1);
        assertEquals(16, area);
    }

    @Test
    public void areaOverlapTouchingRightEdge() {
        Solution223 solution223 = new Solution223();
        int area = solution223.computeArea(-5, -2, 3, 1, -3, -3, 3, 3);
        assertEquals(42, area);
    }

    @Test
    public void areaOverlapNoContainedCorners1() {
        Solution223 solution223 = new Solution223();
        int area = solution223.computeArea(-5, -2, 5, 1, -3, -3, 3, 3);
        assertEquals(48, area);
    }

    @Test
    public void areaOverlapNoContainedCorner2() {
        Solution223 solution223 = new Solution223();
        int area = solution223.computeArea(-3, -3, 3, 3, -5, -2, 5, 1);
        assertEquals(48, area);
    }

    @Test
    public void areaLargeRectangles() {
        Solution223 solution223 = new Solution223();
        int area = solution223.computeArea(-1500000001, 0, -1500000000, 1, 1500000000, 0, 1500000001, 1);
        assertEquals(2, area);
    }
}
