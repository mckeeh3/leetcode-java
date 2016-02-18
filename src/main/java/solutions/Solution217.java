package solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, find if the array contains any duplicates. Your function should return true if any
 * value appears at least twice in the array, and it should return false if every element is distinct.
 *
 * @see <a href="https://leetcode.com/problems/contains-duplicate/">217. Contains Duplicate</a>
 */
public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();

        for (int number : nums) {
            if (numbers.contains(number)) {
                return true;
            } else {
                numbers.add(number);
            }
        }

        return false;
    }
}
