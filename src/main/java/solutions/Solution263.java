package solutions;

/**
 * Write a program to check whether a given number is an ugly number.
 * <p></p>Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly
 * while 14 is not ugly since it includes another prime factor 7.
 * <p></p>Note that 1 is typically treated as an ugly number.
 *
 * @see <a href="https://leetcode.com/problems/ugly-number/">263. Ugly Number</a>
 */
public class Solution263 {
    public boolean isUgly(int num) {
        if (num < 1) {
            return false;
        } else if (isUglyFactor(num)) {
            return true;
        } else if (num % 2 == 0) {
            return isUgly(num / 2);
        } else if (num % 3 == 0) {
            return isUgly(num / 3);
        } else
            return num % 5 == 0 && isUgly(num / 5);
    }

    private boolean isUglyFactor(int num) {
        return num < 6 && (num == 1 || num == 2 || num == 3 || num == 5);
    }
}
