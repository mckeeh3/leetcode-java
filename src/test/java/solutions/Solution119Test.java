package solutions;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Tests Solution119.
 */
public class Solution119Test {
    @Test
    public void rowZero() {
        Solution119 solution119 = new Solution119();
        List<Integer> solution = solution119.getRow(0);

        assertNotNull(solution);
        assertTrue(solution.size() == 1);
        assertTrue(solution.get(0) == 1);
    }

    @Test
    public void rowOne() {
        Solution119 solution119 = new Solution119();
        List<Integer> solution = solution119.getRow(1);

        assertNotNull(solution);
        assertTrue(solution.size() == 2);
        assertTrue(solution.get(0) == 1);
        assertTrue(solution.get(1) == 1);
    }

    @Test
    public void rowTwo() {
        Solution119 solution119 = new Solution119();
        List<Integer> solution = solution119.getRow(2);

        assertNotNull(solution);
        assertTrue(solution.size() == 3);
        assertTrue(solution.get(0) == 1);
        assertTrue(solution.get(1) == 2);
        assertTrue(solution.get(2) == 1);
    }

    @Test
    public void rowThree() {
        Solution119 solution119 = new Solution119();
        List<Integer> solution = solution119.getRow(3);

        assertNotNull(solution);
        assertTrue(solution.size() == 4);
        assertTrue(solution.get(0) == 1);
        assertTrue(solution.get(1) == 3);
        assertTrue(solution.get(2) == 3);
        assertTrue(solution.get(3) == 1);
    }

    @Test
    public void rowFour() {
        Solution119 solution119 = new Solution119();
        List<Integer> solution = solution119.getRow(4);

        assertNotNull(solution);
        assertTrue(solution.size() == 5);
        assertTrue(solution.get(0) == 1);
        assertTrue(solution.get(1) == 4);
        assertTrue(solution.get(2) == 6);
        assertTrue(solution.get(3) == 4);
        assertTrue(solution.get(4) == 1);
    }

    @Test
    public void rowFive() {
        Solution119 solution119 = new Solution119();
        List<Integer> solution = solution119.getRow(5);

        assertNotNull(solution);
        assertTrue(solution.size() == 6);
        assertTrue(solution.get(0) == 1);
        assertTrue(solution.get(1) == 5);
        assertTrue(solution.get(2) == 10);
        assertTrue(solution.get(3) == 10);
        assertTrue(solution.get(4) == 5);
        assertTrue(solution.get(5) == 1);
    }
}
