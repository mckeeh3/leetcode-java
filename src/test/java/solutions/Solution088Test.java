package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution088.
 */
public class Solution088Test {
    @Test
    public void merge15numbers10and5() {
        int m = 10;
        int n = 5;
        int[] numbers1 = new int[m + n];
        int[] numbers2 = new int[n];

        for (int i = 0; i < m; i++) {
            numbers1[i] = i;
        }
        for (int i = 0; i < n; i++) {
            numbers2[i] = i * 2;
        }

        Solution088 solution088 = new Solution088();
        solution088.merge(numbers1, m, numbers2, n);

        for (int i = 1; i < m + n; i++) {
            assertTrue(numbers1[i] >= numbers1[i - 1]);
        }
    }

    @Test
    public void merge20numbers10and10() {
        int m = 10;
        int n = 10;
        int[] numbers1 = new int[m + n];
        int[] numbers2 = new int[n];

        for (int i = 0; i < m; i++) {
            numbers1[i] = i;
        }
        for (int i = 0; i < n; i++) {
            numbers2[i] = i * 2;
        }

        Solution088 solution088 = new Solution088();
        solution088.merge(numbers1, m, numbers2, n);

        for (int i = 1; i < m + n; i++) {
            assertTrue(numbers1[i] >= numbers1[i - 1]);
        }
    }
}
