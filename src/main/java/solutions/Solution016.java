package solutions;

import java.util.Arrays;

/**
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target.
 * Return the sum of the three integers. You may assume that each input would have exactly one solution.
 *
 * @see <a href="https://leetcode.com/problems/3sum-closest/">16. 3Sum Closest</a>
 */
public class Solution016 {
    public int threeSumClosest(int[] nums, int target) {
        int closest = Integer.MAX_VALUE;
        int distance, distanceClosest = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for (int indexI = 0; indexI < nums.length - 2; indexI++) {
            if (indexI == 0 || nums[indexI] > nums[indexI - 1]) {
                int leftGap = target - nums[indexI];
                int left = indexI + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int rightGap = nums[left] + nums[right];
                    int sum = nums[indexI] + rightGap;
                    distance = Math.abs(target - sum);

                    if (leftGap == rightGap) {
                        return sum;
                    } else if (rightGap < leftGap) {
                        left++;
                    } else {
                        right--;
                    }

                    if (distance < distanceClosest) {
                        distanceClosest = distance;
                        closest = sum;
                    }
                }
            }
        }
        return closest;
    }
}
