package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution217.
 */
public class Solution217Test {
    @Test
    public void listOf5withNoDuplicates() {
        Solution217 solution217 = new Solution217();
        int[] numbers = {0, 1, 2, 3, 4};
        assertFalse(solution217.containsDuplicate(numbers));
    }

    @Test
    public void listOf5withDuplicates() {
        Solution217 solution217 = new Solution217();
        int[] numbers = {3, 1, 2, 3, 4};
        assertTrue(solution217.containsDuplicate(numbers));
    }
}
