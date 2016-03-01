package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution169.
 */
public class Solution169Test {
    @Test
    public void arrayWithOneNumber() {
        int[] numbers = {1};
        Solution169 solution169 = new Solution169();
        assertEquals(1, solution169.majorityElement(numbers));
    }

    @Test
    public void arrayWithMultipleNumber() {
        int[] numbers = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 3, 3, 3, 3};
        Solution169 solution169 = new Solution169();
        assertEquals(3, solution169.majorityElement(numbers));
    }
}
