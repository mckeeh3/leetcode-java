package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution026.
 */
public class Solution026Test {
    @Test
    public void arrayWit3And2duplicatesIs2() {
        Solution026 solution026 = new Solution026();
        int[] numbers = {1, 1, 2};
        int[] expected = {1, 2};
        assertEquals(2, solution026.removeDuplicates(numbers));
        assertTrue(resultMatchesExpected(2, numbers, expected));
    }

    @Test
    public void arrayWit5And2duplicatesIs4() {
        Solution026 solution026 = new Solution026();
        int[] numbers = {0, 1, 1, 2, 4};
        int[] expected = {0, 1, 2, 4};
        assertEquals(4, solution026.removeDuplicates(numbers));
        assertTrue(resultMatchesExpected(4, numbers, expected));
    }

    @Test
    public void arrayWit7And4duplicatesIs5() {
        Solution026 solution026 = new Solution026();
        int[] numbers = {1, 1, 2, 3, 4, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertEquals(5, solution026.removeDuplicates(numbers));
        assertTrue(resultMatchesExpected(5, numbers, expected));
    }

    private boolean resultMatchesExpected(int length, int[] result, int[] expected) {
        for (int i = 0; i < length; i++) {
            if (result[i] != expected[i]) {
                return false;
            }
        }
        return true;
    }
}
