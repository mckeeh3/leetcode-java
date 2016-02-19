package solutions;

/**
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money
 * stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system
 * connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * <p>Given a list of non-negative integers representing the amount of money of each house, determine the maximum
 * amount of money you can rob tonight without alerting the police.</p>
 *
 * @see <a href="https://leetcode.com/problems/house-robber/">198. House Robber</a>
 */
public class Solution198 {
    public int rob(int[] nums) {
        int[] d = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                d[i] = nums[i];
            } else if (i == 1) {
                d[i] = Math.max(d[i - 1], nums[i]);
            } else {
                d[i] = Math.max(d[i - 1], d[i - 2] + nums[i]);
            }
        }

        return nums.length == 0 ? 0 : d[nums.length - 1];
    }
}
