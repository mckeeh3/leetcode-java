package solutions;

/**
 * Divide two integers without using multiplication, division and mod operator.
 * <p>If it is overflow, return MAX_INT.</p>
 *
 * @see <a href="https://leetcode.com/problems/divide-two-integers/">29. Divide Two Integers</a>
 */
public class Solution029 {
    public int divide(int dividend, int divisor) {
        boolean negative = false;
        long dividendL = dividend;
        long divisorL = divisor;

        if (divisor == 1) {
            return dividend;
        } else if (dividendL < 0 && divisorL > 0) {
            negative = true;
            dividendL = -dividendL;
        } else if (divisorL < 0 && dividendL > 0) {
            negative = true;
            divisorL = -divisorL;
            divisor = -divisor;
        } else if (dividendL < 0 && divisorL < 0) {
            dividendL = -dividendL;
            divisorL = -divisorL;
            divisor = -divisor;
        }

        if (dividendL == divisorL) {
            return negative ? -1 : 1;
        } else if (dividendL < divisorL) {
            return 0;
        } else {
            long quotient = 1;
            do {
                divisorL <<= 1;
                quotient <<= 1;
            } while (divisorL <= dividendL);
            if (divisorL > dividendL) {
                divisorL >>= 1;
                quotient >>= 1;
            }

            quotient = quotient + divide((int) (dividendL - divisorL), divisor);
            if (negative) {
                if (quotient > Integer.MAX_VALUE) {
                    quotient = Integer.MAX_VALUE;
                } else {
                    quotient = -quotient;
                }
            } else if (quotient > Integer.MAX_VALUE) {
                quotient = Integer.MAX_VALUE;
            }
            return (int) quotient;
        }
    }
}
