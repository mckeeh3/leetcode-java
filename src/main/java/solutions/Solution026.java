package solutions;

/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new
 * length.
 * <p>Do not allocate extra space for another array, you must do this in place with constant memory.</p>
 *
 * @see
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">26. Remove Duplicates from Sorted Array</a>
 */
public class Solution026 {
    public int removeDuplicates(int[] nums) {
        int pos1 = 0;
        int pos2 = 0;

        while (pos2 < nums.length) {
            pos2 = skipDuplicates(nums, pos2);
            nums[pos1++] = nums[pos2++];
        }
        return nums.length > 1 ? pos1 : nums.length;
    }

    private int skipDuplicates(int[] nums, int pos) {
        while (pos + 1 < nums.length && nums[pos] == nums[pos + 1]) {
            pos++;
        }
        return pos;
    }
}
