package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution066.
 */
public class Solution066Test {
    @Test
    public void add1to0is1() {
        int[] digits = {0};
        int[] expected = {1};

        Solution066 solution066 = new Solution066();
        assertTrue(compareDigits(expected, solution066.plusOne(digits)));
    }

    @Test
    public void add1to1is2() {
        int[] digits = {1};
        int[] expected = {2};

        Solution066 solution066 = new Solution066();
        assertTrue(compareDigits(expected, solution066.plusOne(digits)));
    }

    @Test
    public void add1to8is9() {
        int[] digits = {8};
        int[] expected = {9};

        Solution066 solution066 = new Solution066();
        assertTrue(compareDigits(expected, solution066.plusOne(digits)));
    }

    @Test
    public void add1to9is10() {
        int[] digits = {9};
        int[] expected = {1, 0};

        Solution066 solution066 = new Solution066();
        assertTrue(compareDigits(expected, solution066.plusOne(digits)));
    }

    @Test
    public void add1to19is20() {
        int[] digits = {1, 9};
        int[] expected = {2, 0};

        Solution066 solution066 = new Solution066();
        assertTrue(compareDigits(expected, solution066.plusOne(digits)));
    }

    @Test
    public void add1to999is1000() {
        int[] digits = {9, 9, 9};
        int[] expected = {1, 0, 0, 0};

        Solution066 solution066 = new Solution066();
        assertTrue(compareDigits(expected, solution066.plusOne(digits)));
    }

    @Test
    public void add1to9876543210is9876543211() {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        int[] expected = {9,8,7,6,5,4,3,2,1,1};

        Solution066 solution066 = new Solution066();
        assertTrue(compareDigits(expected, solution066.plusOne(digits)));
    }

    private boolean compareDigits(int[] expected, int[] result) {
        if (expected.length == result.length) {
            for (int pos = 0; pos < expected.length; pos++) {
                if (expected[pos] != result[pos]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
