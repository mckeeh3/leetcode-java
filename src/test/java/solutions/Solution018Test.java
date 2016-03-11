package solutions;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Tests Solution018.
 */
public class Solution018Test {
    @Test
    public void values4sums1() {
        Solution018 solution018 = new Solution018();
        int[] numbers = {0, 0, 0, 0};
        List<List<Integer>> answer = solution018.fourSum(numbers, 0);
        assertEquals(1, answer.size());
    }

    @Test
    public void values6sums3() {
        Solution018 solution018 = new Solution018();
        int[] numbers = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> answer = solution018.fourSum(numbers, 0);
        assertEquals(3, answer.size());
    }
}
