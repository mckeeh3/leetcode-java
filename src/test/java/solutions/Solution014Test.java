package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution014.
 */
public class Solution014Test {
    @Test
    public void arrayOf1wordHasCommonPrefix() {
        String[] words = {"a"};
        Solution014 solution014 = new Solution014();
        assertTrue("a".equals(solution014.longestCommonPrefix(words)));
    }

    @Test
    public void arrayOf2wordsWithoutCommonPrefix() {
        String[] words = {"and_a_3", "four"};
        Solution014 solution014 = new Solution014();
        assertTrue("".equals(solution014.longestCommonPrefix(words)));
    }

    @Test
    public void arrayOf3wordsWithCommonPrefix() {
        String[] words = {"and_a_1", "and_a_2", "and_a_3", "four"};
        Solution014 solution014 = new Solution014();
        assertTrue("".equals(solution014.longestCommonPrefix(words)));
    }

    @Test
    public void arrayOf3wordWithoutCommonPrefix() {
        String[] words = {"a", "a", "b"};
        Solution014 solution014 = new Solution014();
        assertTrue("".equals(solution014.longestCommonPrefix(words)));
    }

    @Test
    public void arrayOf4wordWithoutCommonPrefix() {
        String[] words = {"a", "a", null, "b"};
        Solution014 solution014 = new Solution014();
        assertTrue("".equals(solution014.longestCommonPrefix(words)));
    }

    @Test
    public void arrayOf3wordWithCommonPrefix() {
        String[] words = {"a", "a", "ab"};
        Solution014 solution014 = new Solution014();
        assertTrue("a".equals(solution014.longestCommonPrefix(words)));
    }
}
