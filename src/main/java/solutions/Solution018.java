package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all
 * unique quadruplets in the array which gives the sum of target.
 * <p><b>Note:</b>
 * <ul>
 * <li>Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d)</li>
 * <li>The solution set must not contain duplicate quadruplets.</li>
 * </ul>
 * </p>
 *
 * @see <a href="https://leetcode.com/problems/4sum/">18. 4Sum</a>
 */
public class Solution018 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) {
            return new ArrayList<>();
        }

        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i == 0 || nums[i] > nums[i - 1]) {
                List<List<Integer>> threeSums = threeSum(nums, target - nums[i], i + 1);
                for (List<Integer> threeSum : threeSums) {
                    List<Integer> fourSum = new ArrayList<>(4);
                    fourSum.add(nums[i]);
                    fourSum.addAll(threeSum);
                    answer.add(fourSum);
                }
            }
        }
        return answer;
    }

    private List<List<Integer>> threeSum(int[] nums, int target, int scanFrom) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }

        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);

        for (int indexI = scanFrom; indexI < nums.length - 2; indexI++) {
            if (indexI == scanFrom || nums[indexI] > nums[indexI - 1]) {
                int targetGap = target - nums[indexI];
                int left = indexI + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int gap = nums[left] + nums[right];
                    if (targetGap == gap) {
                        List<Integer> threeSum = new ArrayList<>();
                        threeSum.add(nums[indexI]);
                        threeSum.add(nums[left]);
                        threeSum.add(nums[right]);
                        answer.add(threeSum);
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    } else if (gap < targetGap) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return answer;
    }
}
