package solutions;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Tests Solution015.
 */
public class Solution015Test {
    @Test
    public void numbers6has2threeSums() {
        int[] numbers = {-1, 0, 1, 2, -1, -4};
        Solution015 solution015 = new Solution015();
        List<List<Integer>> answer = solution015.threeSum(numbers);
        assertEquals(2, answer.size());

        assertEquals(Integer.valueOf(-1), answer.get(0).get(0));
        assertEquals(Integer.valueOf(-1), answer.get(0).get(1));
        assertEquals(Integer.valueOf(2), answer.get(0).get(2));

        assertEquals(Integer.valueOf(-1), answer.get(1).get(0));
        assertEquals(Integer.valueOf(0), answer.get(1).get(1));
        assertEquals(Integer.valueOf(1), answer.get(1).get(2));
    }

    @Test
    public void numbers3has0threeSums() {
        int[] numbers = {0, 0, 0};
        Solution015 solution015 = new Solution015();
        List<List<Integer>> answer = solution015.threeSum(numbers);
        assertEquals(1, answer.size());

        assertEquals(Integer.valueOf(0), answer.get(0).get(0));
        assertEquals(Integer.valueOf(0), answer.get(0).get(1));
        assertEquals(Integer.valueOf(0), answer.get(0).get(2));
    }

    @Test
    public void numbers121_1_has117threeSums() {
        int[] numbers = {7, -1, 14, -12, -8, 7, 2, -15, 8, 8, -8, -14, -4, -5, 7, 9, 11, -4, -15, -6, 1, -14, 4, 3,
                10, -5, 2, 1, 6, 11, 2, -2, -5, -7, -6, 2, -15, 11, -6, 8, -4, 2, 1, -1, 4, -6, -15, 1, 5, -15, 10,
                14, 9, -8, -6, 4, -6, 11, 12, -15, 7, -1, -9, 9, -1, 0, -4, -1, -12, -2, 14, -9, 7, 0, -3, -4, 1, -2,
                12, 14, -10, 0, 5, 14, -1, 14, 3, 8, 10, -8, 8, -5, -2, 6, -11, 12, 13, -7, -12, 8, 6, -13, 14, -2,
                -5, -11, 1, 3, -6};
        Solution015 solution015 = new Solution015();
        List<List<Integer>> answer = solution015.threeSum(numbers);
        assertEquals(119, answer.size());
    }

    @Test
    public void numbers121_2_has117threeSums() {
        int[] numbers = {-11, -3, -6, 12, -15, -13, -7, -3, 13, -2, -10, 3, 12, -12, 6, -6, 12, 9, -2, -12, 14, 11,
                -4, 11, -8, 8, 0, -12, 4, -5, 10, 8, 7, 11, -3, 7, 5, -3, -11, 3, 11, -13, 14, 8, 12, 5, -12, 10, -8,
                -7, 5, -9, -11, -14, 9, -12, 1, -6, -8, -10, 4, 9, 6, -3, -3, -12, 11, 9, 1, 8, -10, -3, 2, -11, -10,
                -1, 1, -15, -6, 8, -7, 6, 6, -10, 7, 0, -7, -7, 9, -8, -9, -9, -14, 12, -5, -10, -15, -9, -15, -7, 6,
                -10, 5, -7, -14, 3, 8, 2, 3, 9, -12, 4, 1, 9, 1, -15, -13, 9, -14, 11, 9};
        Solution015 solution015 = new Solution015();
        List<List<Integer>> answer = solution015.threeSum(numbers);
        assertEquals(117, answer.size());
    }

    @Test
    public void numbers112has108threeSums() {
        int[] numbers = {0, -6, 0, -14, 2, 0, -9, 5, -9, -8, -7, 12, -4, 14, -6, 6, 0, 5, -2, 6, -7, 1, 10, -10, -5,
                3, -2, -3, -13, -6, 1, -6, 3, 9, -5, 12, -6, -7, 2, 0, 1, 11, -11, 4, 2, -2, -5, -13, 11, 0, 9, 11,
                -13, -4, -13, -11, 14, -8, 1, 8, 1, 9, -13, -11, 3, -11, 9, 12, -2, -4, -11, 6, 14, -7, -5, 1, -1,
                -3, -4, -5, 12, 12, 13, 6, -7, -15, 10, 14, 14, -12, 8, 0, 13, 2, -3, 1, -1, -9, -9, 12, -6, -5, -5,
                -6, 4, 5, 2, 10, -13, 13, 12, 6};
        Solution015 solution015 = new Solution015();
        List<List<Integer>> answer = solution015.threeSum(numbers);
        assertEquals(108, answer.size());
    }

    @Test
    public void numbers106has103threeSums() {
        int[] numbers = {12, -14, -5, 12, -2, 9, 0, 9, -3, -3, -14, -6, -4, 13, -11, -8, 0, 5, -7, -6, -10, -13, -7,
                -14, -3, 0, 12, 5, -8, 7, 3, -11, 0, 6, 9, 13, -8, -6, 7, 4, 6, 0, 13, -13, -1, 9, -13, 6, -1, -13,
                -15, -4, -11, -15, -11, -7, 1, -14, 13, 8, 0, 2, 4, -15, -15, -2, 5, -8, 7, -11, 11, -10, 4, 1, -15,
                10, -5, -13, 2, 1, 11, -6, 4, -15, -5, 8, -7, 3, 1, -9, -4, -14, 0, -15, 8, 0, -1, -2, 7, 13, 2, -5,
                11, 13, 11, 11};
        Solution015 solution015 = new Solution015();
        List<List<Integer>> answer = solution015.threeSum(numbers);
        assertEquals(103, answer.size());
    }
}
