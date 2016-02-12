package solutions;

/**
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version
 * of your product fails the quality check. Since each version is developed based on the previous version, all the
 * versions after a bad version are also bad.
 * <p>Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the
 * following ones to be bad.</p>
 * <p>You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a
 * function to find the first bad version. You should minimize the number of calls to the API.</p>
 *
 * @see <a href="https://leetcode.com/problems/first-bad-version/">278. First Bad Version</a>
 */
public class Solution278 extends VersionControl {
    Solution278(int version) {
        super(version);
    }

    public int firstBadVersion(int n) {
        if (n > 1) {
            return firstBadVersion(1, n);
        } else {
            return isBadVersion(n) ? 1 : 0;
        }
    }

    private int firstBadVersion(int versionMin, int versionMax) {
        int versionMiddle = middleOf(versionMin, versionMax);
        int versionBad;

        if (versionMax - versionMin < 5) {
            versionBad = versionMax;
            while (isBadVersion(versionBad)) {
                versionBad--;
            }
            return versionBad + 1;
        } else if (isBadVersion(versionMiddle)) {
            return firstBadVersion(versionMin, versionMiddle - 1);
        } else {
            return firstBadVersion(versionMiddle + 1, versionMax);
        }
    }

    private int middleOf(int versionMin, int versionMax) {
        int span = versionMax - versionMin;
        if (span > 2) {
            return (int) (Math.round((versionMax - versionMin) / 2.0) + versionMin - 1);
        } else if (span == 2) {
            return versionMax - 1;
        } else {
            return versionMin;
        }
    }
}
