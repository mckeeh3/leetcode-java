package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution191.
 */
public class Solution191Test {
    @Test
    public void number0has0bits() {
        Solution191 solution191 = new Solution191();
        assertEquals(0, solution191.hammingWeight(0));
    }

    @Test
    public void number1has1bits() {
        Solution191 solution191 = new Solution191();
        assertEquals(1, solution191.hammingWeight(1));
    }

    @Test
    public void number2has1bits() {
        Solution191 solution191 = new Solution191();
        assertEquals(1, solution191.hammingWeight(2));
    }

    @Test
    public void number3has2bits() {
        Solution191 solution191 = new Solution191();
        assertEquals(2, solution191.hammingWeight(3));
    }

    @Test
    public void minus1has64bits() {
        Solution191 solution191 = new Solution191();
        assertEquals(32, solution191.hammingWeight(-1));
    }

    @Test
    public void minus2has63bits() {
        Solution191 solution191 = new Solution191();
        assertEquals(31, solution191.hammingWeight(-2));
    }

    @Test
    public void minus3has63bits() {
        Solution191 solution191 = new Solution191();
        assertEquals(31, solution191.hammingWeight(-3));
    }

    @Test
    public void minus1000has52bits() {
        Solution191 solution191 = new Solution191();
        assertEquals(24, solution191.hammingWeight(-1000));
    }

    @Test
    public void maxIntegerPlus1has1bits() {
        Solution191 solution191 = new Solution191();
        assertEquals(1, solution191.hammingWeight((int) 2147483648L));
    }
}
// 1000,0000,0000,0000,0000,0000,0000,0001
// 1000,0000,0000,0000,0000,0000,0000,0000
// 1111,1111,1111,1111,1111,1100,0001,1000