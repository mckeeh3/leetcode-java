package solutions;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Tests Solution017.
 */
public class Solution017Test {
    @Test
    public void digitsNull() {
        Solution017 solution017 = new Solution017();
        List<String> answer = solution017.letterCombinations(null);
        assertEquals(0, answer.size());
    }

    @Test
    public void digitsEmpty() {
        Solution017 solution017 = new Solution017();
        List<String> answer = solution017.letterCombinations("  ");
        assertEquals(0, answer.size());
    }

    @Test
    public void digits23() {
        Solution017 solution017 = new Solution017();
        List<String> answer = solution017.letterCombinations("23");
        assertEquals(9, answer.size());
        assertTrue(answer.contains("ad"));
        assertTrue(answer.contains("ae"));
        assertTrue(answer.contains("af"));
        assertTrue(answer.contains("bd"));
        assertTrue(answer.contains("be"));
        assertTrue(answer.contains("bf"));
        assertTrue(answer.contains("cd"));
        assertTrue(answer.contains("ce"));
        assertTrue(answer.contains("cf"));
    }

    @Test
    public void digits123() {
        Solution017 solution017 = new Solution017();
        List<String> answer = solution017.letterCombinations("123");
        assertEquals(0, answer.size());
    }

    @Test
    public void digits2397() {
        Solution017 solution017 = new Solution017();
        List<String> answer = solution017.letterCombinations("2397");
        assertEquals(144, answer.size());
        assertTrue(answer.contains("adwp"));
        assertTrue(answer.contains("cfzs"));
    }
}
