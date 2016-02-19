package solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * Write an algorithm to determine if a number is "happy".
 * <p>
 * <p>A happy number is a number defined by the following process: Starting with any positive integer, replace the
 * number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will
 * stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1
 * are happy numbers.</p>
 *
 * @see <a href="https://leetcode.com/problems/happy-number/">202. Happy Number</a>
 */
public class Solution202 {
    private Set<Integer> seen = new HashSet<>();

    public boolean isHappy(int n) {
        while (n > 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumDigitsSquares(n);
        }

        return n == 1;
    }

    private int sumDigitsSquares(int n) {
        int sum = 0;
        for (int d : String.valueOf(n).toCharArray()) {
            sum += Math.pow(d - '0', 2);
        }
        return sum;
    }
}
