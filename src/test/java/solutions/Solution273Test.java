package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution273.
 */
public class Solution273Test {
    @Test
    public void value0() {
        Solution273 solution273 = new Solution273();
        String answer = "Zero";
        assertEquals(answer, solution273.numberToWords(0));
    }

    @Test
    public void value1() {
        Solution273 solution273 = new Solution273();
        String answer = "One";
        assertEquals(answer, solution273.numberToWords(1));
    }

    @Test
    public void value10() {
        Solution273 solution273 = new Solution273();
        String answer = "Ten";
        assertEquals(answer, solution273.numberToWords(10));
    }

    @Test
    public void value12() {
        Solution273 solution273 = new Solution273();
        String answer = "Twelve";
        assertEquals(answer, solution273.numberToWords(12));
    }

    @Test
    public void value17() {
        Solution273 solution273 = new Solution273();
        String answer = "Seventeen";
        assertEquals(answer, solution273.numberToWords(17));
    }

    @Test
    public void value20() {
        Solution273 solution273 = new Solution273();
        String answer = "Twenty";
        assertEquals(answer, solution273.numberToWords(20));
    }

    @Test
    public void value27() {
        Solution273 solution273 = new Solution273();
        String answer = "Twenty Seven";
        assertEquals(answer, solution273.numberToWords(27));
    }

    @Test
    public void value90() {
        Solution273 solution273 = new Solution273();
        String answer = "Ninety";
        assertEquals(answer, solution273.numberToWords(90));
    }

    @Test
    public void value99() {
        Solution273 solution273 = new Solution273();
        String answer = "Ninety Nine";
        assertEquals(answer, solution273.numberToWords(99));
    }

    @Test
    public void value100() {
        Solution273 solution273 = new Solution273();
        String answer = "One Hundred";
        assertEquals(answer, solution273.numberToWords(100));
    }

    @Test
    public void value109() {
        Solution273 solution273 = new Solution273();
        String answer = "One Hundred Nine";
        assertEquals(answer, solution273.numberToWords(109));
    }

    @Test
    public void value199() {
        Solution273 solution273 = new Solution273();
        String answer = "One Hundred Ninety Nine";
        assertEquals(answer, solution273.numberToWords(199));
    }

    @Test
    public void value1000() {
        Solution273 solution273 = new Solution273();
        String answer = "One Thousand";
        assertEquals(answer, solution273.numberToWords(1000));
    }

    @Test
    public void value1001() {
        Solution273 solution273 = new Solution273();
        String answer = "One Thousand One";
        assertEquals(answer, solution273.numberToWords(1001));
    }

    @Test
    public void value1012() {
        Solution273 solution273 = new Solution273();
        String answer = "One Thousand Twelve";
        assertEquals(answer, solution273.numberToWords(1012));
    }

    @Test
    public void value1023() {
        Solution273 solution273 = new Solution273();
        String answer = "One Thousand Twenty Three";
        assertEquals(answer, solution273.numberToWords(1023));
    }

    @Test
    public void value2147483647() {
        Solution273 solution273 = new Solution273();
        String answer = "Two Billion " + "" +
                "One Hundred Forty Seven Million " + "" +
                "Four Hundred Eighty Three Thousand " + "" +
                "Six Hundred Forty Seven";
        assertEquals(answer, solution273.numberToWords(Integer.MAX_VALUE));
    }
}
