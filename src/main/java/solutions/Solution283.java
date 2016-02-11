package solutions;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the
 * non-zero elements.
 * <p>For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].</p>
 *
 * @see <a href="https://leetcode.com/problems/move-zeroes/">283. Move Zeroes</a>
 */
public class Solution283 {
    public void moveZeroes(int[] nums) {
        int posFront = 0;
        int posBack = nums.length - 1;
        int zeros = howManyZeros(nums, posFront, posBack);

        while (zeros <= posBack - posFront && posFront < posBack) {
            if (zeros > 0) {
                moveLeft(nums, posFront, posBack, zeros);
                posBack -= zeros;
            } else {
                posFront++;
            }
            zeros = howManyZeros(nums, posFront, posBack);
        }
    }

    private int howManyZeros(int[] nums, int posFront, int posBack) {
        int countZeros = 0;
        while (posFront <= posBack && nums[posFront] == 0) {
            countZeros++;
            posFront++;
        }
        return countZeros;
    }

    private void moveLeft(int[] nums, int posFront, int posBack, int howManyZeros) {
        System.arraycopy(nums, posFront + howManyZeros, nums, posFront, posBack + 1 - (posFront + howManyZeros));
        for (int i = posBack + 1 - howManyZeros; i <= posBack; i++) {
            nums[i] = 0;
        }
    }
}
