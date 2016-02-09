package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
 *
 * @see <a href=https://leetcode.com/problems/range-sum-query-immutable/>303. Range Sum Query - Immutable</a>
 */
public class Solution303 {
    private final List<Integer> numbers;

    public Solution303(int[] nums) {
        numbers = new ArrayList<>(nums.length);
        for (int n : nums) {
            numbers.add(n);
        }
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for (int n : numbers.subList(i, j + 1)) {
            sum += n;
        }
        return sum;
    }
}
