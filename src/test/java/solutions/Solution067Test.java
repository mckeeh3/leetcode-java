package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution067.
 */
public class Solution067Test {
    @Test
    public void add11to1is100() {
        Solution067 solution067 = new Solution067();
        assertEquals("100", solution067.addBinary("11", "1"));
    }

    @Test
    public void add1101011001to110001is1110001010() {
        Solution067 solution067 = new Solution067();
        assertEquals("1110001010", solution067.addBinary("1101011001", "110001"));
    }

    @Test
    public void add101100111000111100001111100000is101100111000111101001000010010() {
        Solution067 solution067 = new Solution067();
        assertEquals("101100111000111101001000010010", solution067.addBinary("101100111000111100001111100000", "111000110010"));
    }
}
