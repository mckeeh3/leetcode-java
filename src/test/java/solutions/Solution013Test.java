package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution013.
 */
public class Solution013Test {
    @Test
    public void romanNumeral_I_is1() {
        Solution013 solution013 = new Solution013();
        assertEquals(1, solution013.romanToInt("I"));
    }

    @Test
    public void romanNumeral_II_is2() {
        Solution013 solution013 = new Solution013();
        assertEquals(2, solution013.romanToInt("II"));
    }

    @Test
    public void romanNumeral_III_is3() {
        Solution013 solution013 = new Solution013();
        assertEquals(3, solution013.romanToInt("III"));
    }

    @Test
    public void romanNumeral_IV_is4() {
        Solution013 solution013 = new Solution013();
        assertEquals(4, solution013.romanToInt("IV"));
    }

    @Test
    public void romanNumeral_V_is5() {
        Solution013 solution013 = new Solution013();
        assertEquals(5, solution013.romanToInt("V"));
    }

    @Test
    public void romanNumeral_VI_is6() {
        Solution013 solution013 = new Solution013();
        assertEquals(6, solution013.romanToInt("VI"));
    }

    @Test
    public void romanNumeral_VII_is7() {
        Solution013 solution013 = new Solution013();
        assertEquals(7, solution013.romanToInt("VII"));
    }

    @Test
    public void romanNumeral_VIII_is8() {
        Solution013 solution013 = new Solution013();
        assertEquals(8, solution013.romanToInt("VIII"));
    }

    @Test
    public void romanNumeral_IX_is9() {
        Solution013 solution013 = new Solution013();
        assertEquals(9, solution013.romanToInt("IX"));
    }

    @Test
    public void romanNumeral_X_is10() {
        Solution013 solution013 = new Solution013();
        assertEquals(10, solution013.romanToInt("X"));
    }

    @Test
    public void romanNumeral_MCMLIV_is1954() {
        Solution013 solution013 = new Solution013();
        assertEquals(1954, solution013.romanToInt("MCMLIV"));
    }

    @Test
    public void romanNumeral_MCMXC_is1990() {
        Solution013 solution013 = new Solution013();
        assertEquals(1990, solution013.romanToInt("MCMXC"));
    }

    @Test
    public void romanNumeral_MMXIV_is2014() {
        Solution013 solution013 = new Solution013();
        assertEquals(2014, solution013.romanToInt("MMXIV"));
    }
}
