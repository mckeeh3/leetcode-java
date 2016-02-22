package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution189.
 */
public class Solution189Test {
    @Test
    public void rotate0numbersBy0() {
        Solution189 solution189 = new Solution189();
        int[] numbers = {};
        solution189.rotate(numbers, 0);

        assertEquals(0, numbers.length);
    }

    @Test
    public void rotate0numbersBy1() {
        Solution189 solution189 = new Solution189();
        int[] numbers = {};
        solution189.rotate(numbers, 1);

        assertEquals(0, numbers.length);
    }

    @Test
    public void rotate7numbersBy3() {
        Solution189 solution189 = new Solution189();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        solution189.rotate(numbers, 3);

        assertEquals(5, numbers[0]);
        assertEquals(6, numbers[1]);
        assertEquals(7, numbers[2]);
        assertEquals(1, numbers[3]);
        assertEquals(2, numbers[4]);
        assertEquals(3, numbers[5]);
        assertEquals(4, numbers[6]);
    }

    @Test
    public void rotate7numbersBy4() {
        Solution189 solution189 = new Solution189();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        solution189.rotate(numbers, 4);

        assertEquals(4, numbers[0]);
        assertEquals(5, numbers[1]);
        assertEquals(6, numbers[2]);
        assertEquals(7, numbers[3]);
        assertEquals(1, numbers[4]);
        assertEquals(2, numbers[5]);
        assertEquals(3, numbers[6]);
    }

    @Test
    public void rotate7numbersBy6() {
        Solution189 solution189 = new Solution189();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        solution189.rotate(numbers, 6);

        assertEquals(2, numbers[0]);
        assertEquals(3, numbers[1]);
        assertEquals(4, numbers[2]);
        assertEquals(5, numbers[3]);
        assertEquals(6, numbers[4]);
        assertEquals(7, numbers[5]);
        assertEquals(1, numbers[6]);
    }

    @Test
    public void rotate7numbersBy7() {
        Solution189 solution189 = new Solution189();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        solution189.rotate(numbers, 7);

        assertEquals(1, numbers[0]);
        assertEquals(2, numbers[1]);
        assertEquals(3, numbers[2]);
        assertEquals(4, numbers[3]);
        assertEquals(5, numbers[4]);
        assertEquals(6, numbers[5]);
        assertEquals(7, numbers[6]);
    }

    @Test
    public void rotate7numbersBy8() {
        Solution189 solution189 = new Solution189();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        solution189.rotate(numbers, 8);

        assertEquals(7, numbers[0]);
        assertEquals(1, numbers[1]);
        assertEquals(2, numbers[2]);
        assertEquals(3, numbers[3]);
        assertEquals(4, numbers[4]);
        assertEquals(5, numbers[5]);
        assertEquals(6, numbers[6]);
    }

    @Test
    public void rotate2numbersBy3() {
        Solution189 solution189 = new Solution189();
        int[] numbers = {1, 2};
        solution189.rotate(numbers, 3);

        assertEquals(2, numbers[0]);
        assertEquals(1, numbers[1]);
    }
}
