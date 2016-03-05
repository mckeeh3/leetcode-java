package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution001.
 */
public class Solution001Test {
    @Test
    public void target6() {
        int[] numbers = {3, 2, 4};
        Solution001 solution001 = new Solution001();
        int[] answer = solution001.twoSum(numbers, 6);
        assertEquals(1, answer[0]);
        assertEquals(2, answer[1]);
    }

    @Test
    public void target8() {
        int[] numbers = {2, 11, 15, 6};
        Solution001 solution001 = new Solution001();
        int[] answer = solution001.twoSum(numbers, 8);
        assertEquals(0, answer[0]);
        assertEquals(3, answer[1]);
    }

    @Test
    public void target9() {
        int[] numbers = {2, 7, 11, 15};
        Solution001 solution001 = new Solution001();
        int[] answer = solution001.twoSum(numbers, 9);
        assertEquals(0, answer[0]);
        assertEquals(1, answer[1]);
    }
}
