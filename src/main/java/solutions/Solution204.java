package solutions;

/**
 * Count the number of prime numbers less than a non-negative number, n.
 * <p>Using the
 * <a href="https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes">Sieve of Eratosthenes</a> to find the prime numbers.</p>
 *
 * @see <a href="https://leetcode.com/problems/count-primes/">204. Count Primes</a>
 */
public class Solution204 {
    public int countPrimes(int n) {
        int[] range = range(n);
        sieve(range);
        return countPrimes(range);
    }

    private int[] range(int n) {
        int[] range = new int[n];
        for (int i = 2; i < n; i++) {
            range[i] = i;
        }
        return range;
    }

    private void sieve(int[] range) {
        for (int i = 2; i < Math.sqrt(range.length); i++) {
            if (range[i] > 0) {
                int iSquared = (int) Math.pow(i, 2);
                int j = iSquared;
                int count = 1;
                while (j < range.length) {
                    range[j] = 0;
                    j = iSquared + i * count++;
                }
            }
        }
    }

    private int countPrimes(int[] range) {
        int count = 0;
        for (int r : range) {
            if (r > 0) {
                count++;
            }
        }
        return count;
    }
}
