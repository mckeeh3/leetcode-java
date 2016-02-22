package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution190.
 */
public class Solution190Test {
    @Test
    public void reverse0is0() {
        Solution190 solution190 = new Solution190();
        assertEquals(0, solution190.reverseBits(0));
    }

    @Test
    public void reverse1isMinInteger() {
        Solution190 solution190 = new Solution190();
        assertEquals(Integer.MIN_VALUE, solution190.reverseBits(1));
    }

    @Test
    public void reverseMinIntegerIsMinInteger() {
        Solution190 solution190 = new Solution190();
        assertEquals(1, solution190.reverseBits(Integer.MIN_VALUE));
    }

    @Test
    public void reverseMinIntegerPlus1isMinInteger() {
        Solution190 solution190 = new Solution190();
        assertEquals(-2147483647, solution190.reverseBits(Integer.MIN_VALUE + 1));
    }

    @Test
    public void reverse2147483648is1() {
        Solution190 solution190 = new Solution190();
        assertEquals(1, solution190.reverseBits((int) 2147483648L));
    }

    @Test
    public void reverse43261596is964176192() {
        Solution190 solution190 = new Solution190();
        assertEquals(964176192, solution190.reverseBits(43261596));
    }
}
