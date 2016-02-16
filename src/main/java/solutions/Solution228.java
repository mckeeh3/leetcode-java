package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a sorted integer array without duplicates, return the summary of its ranges.
 *
 * @see <a href="https://leetcode.com/problems/summary-ranges/">228. Summary Ranges</a>
 */
public class Solution228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        int pos = 0;
        while (pos < nums.length) {
            int end = findEndOfRange(nums, pos);
            String range = end > pos ? String.format("%d->%d", nums[pos], nums[end]) : String.format("%d", nums[pos]);
            ranges.add(range);
            pos = end + 1;
        }
        return ranges;
    }

    private int findEndOfRange(int[] nums, int pos) {
        int end = pos;
        int value = pos >= nums.length ? -1 : nums[pos++];

        while (pos < nums.length) {
            if (nums[pos] - value == 1) {
                end = pos;
                value = nums[pos++];
            } else {
                break;
            }
        }
        return end;
    }
}
