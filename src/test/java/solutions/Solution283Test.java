package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution283.
 */
public class Solution283Test {
    @Test
    public void moveZerosWorks() {
        int[] numbers1 = {0, 1, 0, 3, 12};
        int[] numbers2 = {1, 3, 12, 0, 0};

        Solution283 solution283 = new Solution283();
        solution283.moveZeroes(numbers1);

        assertTrue(compareArrays(numbers1, numbers2));
    }

    @Test
    public void moveZerosWithLastElementZeroWorks() {
        int[] numbers1 = {0, 1, 0, 3, 0};
        int[] numbers2 = {1, 3, 0, 0, 0};

        Solution283 solution283 = new Solution283();
        solution283.moveZeroes(numbers1);

        assertTrue(compareArrays(numbers1, numbers2));
    }

    @Test
    public void moveZerosWithLastElementsZeroWorks() {
        int[] numbers1 = {0, 1, 3, 0, 0};
        int[] numbers2 = {1, 3, 0, 0, 0};

        Solution283 solution283 = new Solution283();
        solution283.moveZeroes(numbers1);

        assertTrue(compareArrays(numbers1, numbers2));
    }

    @Test
    public void moveZerosWithNoZerosWorks() {
        int[] numbers1 = {4, 1, 5, 3, 2};
        int[] numbers2 = {4, 1, 5, 3, 2};

        Solution283 solution283 = new Solution283();
        solution283.moveZeroes(numbers1);

        assertTrue(compareArrays(numbers1, numbers2));
    }

    @Test
    public void moveZerosWithFirstLastZeroWorks() {
        int[] numbers1 = {0, 0, 5, 6, 7};
        int[] numbers2 = {5, 6, 7, 0, 0};

        Solution283 solution283 = new Solution283();
        solution283.moveZeroes(numbers1);

        assertTrue(compareArrays(numbers1, numbers2));
    }

    @Test
    public void moveZerosWithMultipleGroupsOfZerosWorks() {
        int[] numbers1 = {0, 0, 5, 0, 0, 0, 6, 0, 7};
        int[] numbers2 = {5, 6, 7, 0, 0, 0, 0, 0, 0};

        Solution283 solution283 = new Solution283();
        solution283.moveZeroes(numbers1);

        assertTrue(compareArrays(numbers1, numbers2));
    }

    @Test
    public void moveZerosWithAllZerosWorks() {
        int[] numbers1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] numbers2 = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        Solution283 solution283 = new Solution283();
        solution283.moveZeroes(numbers1);

        assertTrue(compareArrays(numbers1, numbers2));
    }

    @Test
    public void moveZerosWithAllZerosExceptFirstWorks() {
        int[] numbers1 = {1, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] numbers2 = {1, 0, 0, 0, 0, 0, 0, 0, 0};

        Solution283 solution283 = new Solution283();
        solution283.moveZeroes(numbers1);

        assertTrue(compareArrays(numbers1, numbers2));
    }

    @Test
    public void moveZerosWithAllZerosExceptLastWorks() {
        int[] numbers1 = {0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] numbers2 = {1, 0, 0, 0, 0, 0, 0, 0, 0};

        Solution283 solution283 = new Solution283();
        solution283.moveZeroes(numbers1);

        assertTrue(compareArrays(numbers1, numbers2));
    }

    private boolean compareArrays(int[] numbers1, int[] numbers2) {
        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] != numbers2[i]) {
                return false;
            }
        }
        return true;
    }
}
