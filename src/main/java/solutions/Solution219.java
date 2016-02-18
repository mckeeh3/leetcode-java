package solutions;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array
 * such that nums[i] = nums[j] and the difference between i and j is at most k.
 *
 * @see <a href="https://leetcode.com/problems/contains-duplicate-ii/">219. Contains Duplicate II</a>
 */
public class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, List<Integer>> values = loadNumbersIntoMap(nums);

        return findDuplicatesInValues(values, k);
    }

    private Map<Integer, List<Integer>> loadNumbersIntoMap(int[] numbers) {
        Map<Integer, List<Integer>> valuesFiltered = new HashMap<>();
        Map<Integer, List<Integer>> valuesUnfiltered = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            List<Integer> indexes = valuesUnfiltered.get(numbers[i]);
            if (indexes == null) {
                indexes = new ArrayList<>();
                indexes.add(i);
                valuesUnfiltered.put(numbers[i], indexes);
            } else {
                indexes.add(i);
                valuesUnfiltered.put(numbers[i], indexes);
                valuesFiltered.put(numbers[i], indexes);
            }
        }

        return valuesFiltered;
    }

    private boolean findDuplicatesInValues(Map<Integer, List<Integer>> values, int k) {
        for (int value : values.keySet()) {
            List<Integer> indexes = values.get(value);
            if (findDuplicatesInValue(indexes, k)) {
                return true;
            }
        }
        return false;
    }

    private boolean findDuplicatesInValue(List<Integer> indexes, int k) {
        for (int i = 1; i < indexes.size(); i++) {
            if (indexes.get(i) - indexes.get(i - 1) <= k) {
                return true;
            }
        }
        return false;
    }
}
