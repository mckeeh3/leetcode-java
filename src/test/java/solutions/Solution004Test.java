package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution004.
 */
public class Solution004Test {
    @Test
    public void values3() {
        int[] numbers1 = {3, 12};
        int[] numbers2 = {5};
        Solution004 solution004 = new Solution004();
        assertEquals(5.0, solution004.findMedianSortedArrays(numbers1, numbers2), 0.0);
    }

    @Test
    public void values4() {
        int[] numbers1 = {3, 6, 12, 99};
        int[] numbers2 = {};
        Solution004 solution004 = new Solution004();
        assertEquals(9.0, solution004.findMedianSortedArrays(numbers1, numbers2), 0.0);
    }

    @Test
    public void values5() {
        int[] numbers1 = {1, 3, 6, 12, 99};
        int[] numbers2 = {};
        Solution004 solution004 = new Solution004();
        assertEquals(6.0, solution004.findMedianSortedArrays(numbers1, numbers2), 0.0);
    }

    @Test
    public void values14() {
        int[] numbers1 = {3, 5, 12, 23, 23, 23, 29, 56};
        int[] numbers2 = {7, 13, 14, 21, 23, 40};
        Solution004 solution004 = new Solution004();
        assertEquals(22.0, solution004.findMedianSortedArrays(numbers1, numbers2), 0.0);
    }
}
