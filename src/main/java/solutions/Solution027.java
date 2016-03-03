package solutions;

/**
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * <p>The order of elements can be changed. It doesn't matter what you leave beyond the new length.</p>
 *
 * @see <a href="https://leetcode.com/problems/remove-element/">27. Remove Element</a>
 */
public class Solution027 {
    public int removeElement(int[] nums, int val) {
        int pos = 0;
        int swap = nums.length - 1;

        while (pos <= swap) {
            if (nums[pos] == val) {
                nums[pos] = nums[swap--];
            } else {
                pos++;
            }
        }

        return swap + 1;
    }
}
