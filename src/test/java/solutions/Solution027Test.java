package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution027.
 */
public class Solution027Test {
    @Test
    public void emptyArrayIs0() {
        Solution027 solution027 = new Solution027();
        int[] numbers = {};
        assertEquals(0, solution027.removeElement(numbers, 0));
    }

    @Test
    public void oneEntryMatchesValue() {
        Solution027 solution027 = new Solution027();
        int[] numbers = {1};
        assertEquals(0, solution027.removeElement(numbers, 1));
    }

    @Test
    public void twoEntriesMatchesValue() {
        Solution027 solution027 = new Solution027();
        int[] numbers = {1, 1};
        assertEquals(0, solution027.removeElement(numbers, 1));
    }

    @Test
    public void twoEntriesNotMatchesValue() {
        Solution027 solution027 = new Solution027();
        int[] numbers = {2, 2};
        assertEquals(2, solution027.removeElement(numbers, 1));
    }

    @Test
    public void arrayWith2And1matchingValue() {
        Solution027 solution027 = new Solution027();
        int[] numbers = {4, 5};
        int[] expected = {5};

        assertEquals(1, solution027.removeElement(numbers, 4));
        assertTrue(resultMatchesExpected(1, numbers, expected));
    }

    @Test
    public void arrayWith9And9matchingValues() {
        Solution027 solution027 = new Solution027();
        int[] numbers = {4, 4, 4, 4, 4, 4, 4, 4, 4};

        assertEquals(0, solution027.removeElement(numbers, 4));
    }

    @Test
    public void arrayWith9And8matchingValues() {
        Solution027 solution027 = new Solution027();
        int[] numbers = {4, 4, 4, 4, 4, 4, 4, 4, 1};
        int[] expected = {1};

        assertEquals(1, solution027.removeElement(numbers, 4));
        assertTrue(resultMatchesExpected(1, numbers, expected));
    }

    @Test
    public void arrayWith10And2matchingValues() {
        Solution027 solution027 = new Solution027();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        int[] expected = {9, 2, 3, 4, 5, 6, 7, 8};

        assertEquals(8, solution027.removeElement(numbers, 1));
        assertTrue(resultMatchesExpected(8, numbers, expected));
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
