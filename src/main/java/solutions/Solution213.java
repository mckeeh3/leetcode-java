package solutions;

/**
 * <b>Note:</b> This is an extension of <a href="https://leetcode.com/problems/house-robber/">House Robber</a>.
 * <p>After robbing those houses on that street, the thief has found himself a new place for his thievery so that he
 * will not get too much attention. This time, all houses at this place are <b>arranged in a circle</b>. That means the
 * first house is the neighbor of the last one. Meanwhile, the security system for these houses remain the same as
 * for those in the prev street.</p>
 * <p>Given a list of non-negative integers representing the amount of money of each house, determine the maximum
 * amount of money you can rob tonight <b>without alerting the police</b>.</p>
 *
 * @see <a href="https://leetcode.com/problems/house-robber-ii/">213. House Robber II</a>
 */
public class Solution213 {
    public int rob(int[] nums) {
        int length = nums.length;

        if (length == 0) {
            return 0;
        } else {
            int sum1 = nums[0] + rob(nums, 2, length - 2);
            int sum2 = rob(nums, 1, length - 1);

            return Math.max(sum1, sum2);
        }
    }

    private int rob(int[] nums, int from, int to) {
        int[] d = new int[nums.length];

        for (int i = from; i <= to; i++) {
            if (i == from) {
                d[i] = nums[i];
            } else if (i == from + 1) {
                d[i] = Math.max(d[i - 1], nums[i]);
            } else {
                d[i] = Math.max(d[i - 1], d[i - 2] + nums[i]);
            }
        }

        return from > to ? 0 : d[to];
    }
}
