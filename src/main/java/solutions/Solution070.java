package solutions;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p>Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?</p>
 *
 * @see <a href="https://leetcode.com/problems/climbing-stairs/">70. Climbing Stairs</a>
 */
public class Solution070 {
    public int climbStairsSlow(int n) {
        if (n <= 1) {
            return n;
        } else {
            return climbStairsSlow(n - 1) + climbStairsSlow(n - 2);
        }
    }

    public int climbStairs(int n) {
        int[] climb = new int[n + 1];

        if (n<=1) {
            return n;
        }
        climb[0] = 1;
        climb[1] = 1;
        for (int i = 2; i <= n; i++) {
            climb[i] = climb[i - 1] + climb[i - 2];
        }
        return climb[n];
    }
}
