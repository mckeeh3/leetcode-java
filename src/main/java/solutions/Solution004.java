package solutions;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively. Find the median of the two sorted arrays
 * . The overall run time complexity should be O(log (m+n)).
 *
 * @see <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">4. Median of Two Sorted Arrays</a>
 */
public class Solution004 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (isOddLength(nums1, nums2)) {
            return medianOdd(nums1, nums2);
        } else {
            return medianEven(nums1, nums2);
        }
    }

    private boolean isOddLength(int[] nums1, int[] nums2) {
        return (nums1.length + nums2.length) % 2 != 0;
    }

    private double medianOdd(int[] nums1, int[] nums2) {
        int value = 0;
        int pos = 0;
        int pos1 = 0;
        int pos2 = 0;
        int medianPos = (nums1.length + nums2.length) / 2;

        while (pos <= medianPos) {
            if (pos1 >= nums1.length) {
                value = nums2[pos2];
                pos2++;
            } else if (pos2 >= nums2.length) {
                value = nums1[pos1];
                pos1++;
            } else if (nums1[pos1] <= nums2[pos2]) {
                value = nums1[pos1];
                pos1++;
            } else {
                value = nums2[pos2];
                pos2++;
            }
            pos++;
        }

        return value;
    }

    private double medianEven(int[] nums1, int[] nums2) {
        int value = 0;
        int value1 = 0;
        int value2 = 0;
        int pos = 0;
        int pos1 = 0;
        int pos2 = 0;
        int medianPos2 = (nums1.length + nums2.length) / 2;
        int medianPos1 = medianPos2 - 1;

        while (pos <= medianPos2) {
            if (pos1 >= nums1.length) {
                value = nums2[pos2];
                pos2++;
            } else if (pos2 >= nums2.length) {
                value = nums1[pos1];
                pos1++;
            } else if (nums1[pos1] <= nums2[pos2]) {
                value = nums1[pos1];
                pos1++;
            } else {
                value = nums2[pos2];
                pos2++;
            }

            value1 = pos == medianPos1 ? value : value1;
            value2 = pos == medianPos2 ? value : value2;
            pos++;
        }

        return (value1 + value2) / 2.0;
    }
}
