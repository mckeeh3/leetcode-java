package solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊
 * n/2 ⌋ times.
 * <p>You may assume that the array is non-empty and the majority element always exist in the array.</p>
 *
 * @see <a href="https://leetcode.com/problems/majority-element/">169. Majority Element</a>
 */
public class Solution169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> track = new HashMap<>(nums.length / 2);
        int majorityKey = 0;
        int majorityCount = 0;

        for (int n : nums) {
            if (track.containsKey(n)) {
                track.put(n, track.get(n) + 1);
            } else {
                track.put(n, 1);
            }
        }
        for (int key : track.keySet()) {
            int count = track.get(key);
            if (count > majorityCount) {
                majorityKey = key;
                majorityCount = count;
            }
        }
        return majorityKey;
    }
}
