package solutions;

/**
 * Rotate an array of n elements to the right by k steps.
 * <p>For example, with <i>n</i> = 7 and <i>k</i> = 3, the array <code>[1,2,3,4,5,6,7]</code> is rotated to
 * <code>[5,6,7,1,2,3,4]</code>.</p>
 *
 * @see <a href="https://leetcode.com/problems/rotate-array/">189. Rotate Array</a>
 */
public class Solution189 {
    public void rotate(int[] nums, int k) {
        int length = nums.length;

        if (length == 0) {
            return;
        }

        k = k % length;
        int hold[] = new int[k];

        for (int i = 0; i < k; i++) {
            hold[i] = nums[length - k + i];
        }
        for (int i = length - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        for (int i = 0; i < hold.length; i++) {
            nums[i] = hold[i];
        }
    }
}
