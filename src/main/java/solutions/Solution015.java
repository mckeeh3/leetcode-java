package solutions;

import java.util.*;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets
 * in the array which gives the sum of zero.
 *
 * @see <a href="https://leetcode.com/problems/3sum/">15. 3Sum</a>
 */
public class Solution015 {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }

        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);

        for (int indexI = 0; indexI < nums.length - 2; indexI++) {
            if (indexI == 0 || nums[indexI] > nums[indexI - 1]) {
                int targetGap = -nums[indexI];
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

    public List<List<Integer>> threeSumBruteForce(int[] nums) {
        Set<List<Integer>> answer = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (j != i && k != i && k != j) {
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            List<Integer> threeSum = new ArrayList<>();
                            threeSum.add(nums[i]);
                            threeSum.add(nums[j]);
                            threeSum.add(nums[k]);
                            Collections.sort(threeSum);
                            answer.add(threeSum);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(answer);
    }
}
