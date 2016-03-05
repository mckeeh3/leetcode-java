package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>You may assume that each input would have exactly one solution.</p>
 *
 * @see <a href="https://leetcode.com/problems/two-sum/">1. Two Sum</a>
 */
public class Solution001 {
    public int[] twoSum(int[] nums, int target) {
        int index1 = 0;
        int index2 = 0;
        int[] answer = new int[2];
        Map<Integer, List<Integer>> numbers = sort(nums);

        while (index1 < nums.length) {
            index2 = search(numbers, target - nums[index1], index1);
            if (index2 >= 0) {
                answer[0] = index1;
                answer[1] = index2;
                index1 = nums.length;
            }
            index1++;
        }

        return answer;
    }

    private int search(Map<Integer, List<Integer>> numbers, int target, int index1) {
        if (numbers.containsKey(target)) {
            List<Integer> indexes = numbers.get(target);
            for (int index : indexes) {
                if (index != index1) {
                    return index;
                }
            }
            return -1;
        } else {
            return -1;
        }
    }

    private Map<Integer, List<Integer>> sort(int[] nums) {
        int key;
        Map<Integer, List<Integer>> numbers = new TreeMap<>();
        List<Integer> indexes;

        for (int i = 0; i < nums.length; i++) {
            key = nums[i];
            if (numbers.containsKey(key)) {
                indexes = numbers.get(key);
            } else {
                indexes = new ArrayList<>();
            }
            indexes.add(i);
            numbers.put(key, indexes);
        }
        return numbers;
    }
}
