package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution058.
 */
public class Solution058Test {
    @Test
    public void lengthOfLastWordInSpaceCharactersIs0() {
        Solution058 solution058 = new Solution058();
        assertEquals(0, solution058.lengthOfLastWord("          "));
    }

    @Test
    public void lengthOfLastWordIn_a_is1() {
        Solution058 solution058 = new Solution058();
        assertEquals(1, solution058.lengthOfLastWord("a"));
    }

    @Test
    public void lengthOfLastWordIn___a___is1() {
        Solution058 solution058 = new Solution058();
        assertEquals(1, solution058.lengthOfLastWord("  a  "));
    }

    @Test
    public void lengthOfLastWordIn_Hello_World_is5() {
        Solution058 solution058 = new Solution058();
        assertEquals(5, solution058.lengthOfLastWord("Hello World"));
    }

    @Test
    public void lengthOfLastWordIn_last_word_in_the_string_is6() {
        Solution058 solution058 = new Solution058();
        assertEquals(6, solution058.lengthOfLastWord("last word in the string"));
    }
}
