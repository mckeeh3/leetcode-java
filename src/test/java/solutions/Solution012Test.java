package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution012.
 */
public class Solution012Test {
    @Test
    public void value9isIX() {
        Solution012 solution012 = new Solution012();
        assertEquals("IX", solution012.intToRoman(9));
    }

    @Test
    public void value99isXCIX() {
        Solution012 solution012 = new Solution012();
        assertEquals("XCIX", solution012.intToRoman(99));
    }

    @Test
    public void value999isCMXCIX() {
        Solution012 solution012 = new Solution012();
        assertEquals("CMXCIX", solution012.intToRoman(999));
    }

    @Test
    public void value3999isMMMCMXCIX() {
        Solution012 solution012 = new Solution012();
        assertEquals("MMMCMXCIX", solution012.intToRoman(3999));
    }

    @Test
    public void value8isVIII() {
        Solution012 solution012 = new Solution012();
        assertEquals("VIII", solution012.intToRoman(8));
    }

    @Test
    public void value88isLXXXVIII() {
        Solution012 solution012 = new Solution012();
        assertEquals("LXXXVIII", solution012.intToRoman(88));
    }

    @Test
    public void value888isDCCCLXXXVIII() {
        Solution012 solution012 = new Solution012();
        assertEquals("DCCCLXXXVIII", solution012.intToRoman(888));
    }

    @Test
    public void value3888isMMMDCCCLXXXVIII() {
        Solution012 solution012 = new Solution012();
        assertEquals("MMMDCCCLXXXVIII", solution012.intToRoman(3888));
    }

    @Test
    public void value1952isMCMLII() {
        Solution012 solution012 = new Solution012();
        assertEquals("MCMLII", solution012.intToRoman(1952));
    }

    @Test
    public void value1990isMCMXC() {
        Solution012 solution012 = new Solution012();
        assertEquals("MCMXC", solution012.intToRoman(1990));
    }

    @Test
    public void value2016isMMXVI() {
        Solution012 solution012 = new Solution012();
        assertEquals("MMXVI", solution012.intToRoman(2016));
    }
}
