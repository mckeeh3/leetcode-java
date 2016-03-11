package solutions;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Tests Solution022.
 */
public class Solution022Test {
    @Test
    public void given1generate1() {
        Solution022 solution022 = new Solution022();
        List<String> answer = solution022.generateParenthesis(1);
        assertEquals(1, answer.size());
        assertTrue(answer.contains("()"));
    }

    @Test
    public void given2generate2() {
        Solution022 solution022 = new Solution022();
        List<String> answer = solution022.generateParenthesis(2);
        assertEquals(2, answer.size());
        assertTrue(answer.contains("(())"));
        assertTrue(answer.contains("()()"));
    }

    @Test
    public void given3generate5() {
        Solution022 solution022 = new Solution022();
        List<String> answer = solution022.generateParenthesis(3);
        assertEquals(5, answer.size());
        assertTrue(answer.contains("((()))"));
        assertTrue(answer.contains("(()())"));
        assertTrue(answer.contains("(())()"));
        assertTrue(answer.contains("()(())"));
        assertTrue(answer.contains("()()()"));
    }
}
