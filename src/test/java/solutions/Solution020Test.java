package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution020.
 */
public class Solution020Test {
    @Test
    public void nullString() {
        Solution020 solution020 = new Solution020();
        assertTrue(solution020.isValid(null));
    }

    @Test
    public void emptyString() {
        Solution020 solution020 = new Solution020();
        assertTrue(solution020.isValid(""));
    }

    @Test
    public void expressionWithNoParentheses() {
        Solution020 solution020 = new Solution020();
        assertTrue(solution020.isValid("2 + 2"));
    }

    @Test
    public void expressionWithOneSetOfParentheses() {
        Solution020 solution020 = new Solution020();
        assertTrue(solution020.isValid("(2 + 2)"));
    }

    @Test
    public void expressionWithOneUnbalancedOpenParentheses() {
        Solution020 solution020 = new Solution020();
        assertFalse(solution020.isValid("[2 + 2"));
    }

    @Test
    public void expressionWithOneUnbalancedCloseParentheses() {
        Solution020 solution020 = new Solution020();
        assertFalse(solution020.isValid("2 + 2}"));
    }

    @Test
    public void expressionWithNested2deep() {
        Solution020 solution020 = new Solution020();
        assertTrue(solution020.isValid("1 * {2 + [3 + 4] + 5} + 6"));
    }

    @Test
    public void expressionWithNested3deep() {
        Solution020 solution020 = new Solution020();
        assertTrue(solution020.isValid("(1 * {2 + [3 + 4] + 5} + 6)"));
    }

    @Test
    public void expressionWithNested3deepUnbalanced() {
        Solution020 solution020 = new Solution020();
        assertFalse(solution020.isValid("(1 * {2 + [3 + 4] + 5 + 6)"));
    }
}
