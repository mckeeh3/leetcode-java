package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution290.
 */
public class Solution290Test {
    @Test
    public void wordPatternWorks() {
        Solution290 solution290 = new Solution290();

        assertTrue(solution290.wordPattern("abba", "dog cat cat dog"));
        assertFalse(solution290.wordPattern("abba", "dog cat cat fish"));
        assertFalse(solution290.wordPattern("aaaa", "dog cat cat dog"));
        assertFalse(solution290.wordPattern("abba", "dog dog dog dog"));
        assertTrue(solution290.wordPattern("abcdefghijklmnnmlkjihgfedcba",
                "aa bb cc dd ee ff gg hh ii jj kk ll mm nn nn mm ll kk jj ii hh gg ff ee dd cc bb aa"));
        assertTrue(solution290.wordPattern("e", "eukera"));
        assertTrue(solution290.wordPattern("deadbeef", "d e a d b e e f"));
        assertTrue(solution290.wordPattern("syys", "a abc abc a"));
    }
}
