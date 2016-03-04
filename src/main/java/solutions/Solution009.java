package solutions;

/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 *
 * @see <a href="https://leetcode.com/problems/palindrome-number/">9. Palindrome Number</a>
 */
public class Solution009 {
    public boolean isPalindrome(int x) {
        if (x >= 0 && x < 10) {
            return true;
        } else {
            if (x < 0) {
                return false;
            }
            int digitsCount = digitsCount(x);
            int digitsToScan = digitsCount / 2;
            int digitsPos = 1;

            while (digitsPos <= digitsToScan) {
                if (!digitsMatch(x, digitsPos, digitsCount)) {
                    return false;
                } else {
                    digitsPos++;
                }
            }

            return true;
        }
    }

    private int digitsCount(int x) {
        int count = 1;
        while (x / 10 > 0) {
            count++;
            x /= 10;
        }
        return count;
    }

    private boolean digitsMatch(int x, int pos, int digitsCount) {
        int digitRight = (int) (x / Math.pow(10, pos - 1) % 10);
        int digitLeft = (int) (x / Math.pow(10, digitsCount - pos) % 10);

        return digitRight == digitLeft;
    }
}
