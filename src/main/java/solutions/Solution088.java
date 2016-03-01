package solutions;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>Note:<br>
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements
 * from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.</p>
 *
 * @see <a href="https://leetcode.com/problems/merge-sorted-array/">88. Merge Sorted Array</a>
 */
public class Solution088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pos = m + n - 1;
        int pos1 = m - 1;
        int pos2 = n - 1;

        while (pos >= 0) {
            if (pos1 >= 0 && pos2 < 0) {
                nums1[pos--] = nums1[pos1--];
            } else if (pos1 < 0 && pos2 >= 0) {
                nums1[pos--] = nums2[pos2--];
            } else if (nums1[pos1] > nums2[pos2]) {
                nums1[pos--] = nums1[pos1--];
            } else if (nums2[pos2] > nums1[pos1]) {
                nums1[pos--] = nums2[pos2--];
            } else if (nums1[pos1] == nums2[pos2]) {
                nums1[pos--] = nums1[pos1--];
                nums1[pos--] = nums2[pos2--];
            }
        }
    }
}
