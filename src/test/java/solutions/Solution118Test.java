package solutions;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Tests Solution118.
 */
public class Solution118Test {
    @Test
    public void rowsOne() {
        Solution118 solution118 = new Solution118();
        List<List<Integer>> solution = solution118.generate(1);

        assertNotNull(solution);
        assertTrue(solution.size() == 1);
        assertTrue(solution.get(0).size() == 1);
        assertTrue(solution.get(0).get(0) == 1);
    }

    @Test
    public void rowsTwo() {
        Solution118 solution118 = new Solution118();
        List<List<Integer>> solution = solution118.generate(2);

        assertNotNull(solution);
        assertTrue(solution.size() == 2);
        assertTrue(solution.get(1).size() == 2);
        assertTrue(solution.get(1).get(0) == 1);
        assertTrue(solution.get(1).get(1) == 1);
    }

    @Test
    public void rowsThree() {
        Solution118 solution118 = new Solution118();
        List<List<Integer>> solution = solution118.generate(3);

        assertNotNull(solution);
        assertTrue(solution.size() == 3);
        assertTrue(solution.get(2).size() == 3);
        assertTrue(solution.get(2).get(0) == 1);
        assertTrue(solution.get(2).get(1) == 2);
        assertTrue(solution.get(2).get(2) == 1);
    }

    @Test
    public void rowsFour() {
        Solution118 solution118 = new Solution118();
        List<List<Integer>> solution = solution118.generate(4);

        assertNotNull(solution);
        assertTrue(solution.size() == 4);
        assertTrue(solution.get(3).size() == 4);
        assertTrue(solution.get(3).get(0) == 1);
        assertTrue(solution.get(3).get(1) == 3);
        assertTrue(solution.get(3).get(2) == 3);
        assertTrue(solution.get(3).get(3) == 1);
    }

    @Test
    public void rowsFive() {
        Solution118 solution118 = new Solution118();
        List<List<Integer>> solution = solution118.generate(5);

        assertNotNull(solution);
        assertTrue(solution.size() == 5);
        assertTrue(solution.get(4).size() == 5);
        assertTrue(solution.get(4).get(0) == 1);
        assertTrue(solution.get(4).get(1) == 4);
        assertTrue(solution.get(4).get(2) == 6);
        assertTrue(solution.get(4).get(3) == 4);
        assertTrue(solution.get(4).get(4) == 1);
    }

    @Test
    public void rowsSix() {
        Solution118 solution118 = new Solution118();
        List<List<Integer>> solution = solution118.generate(6);

        assertNotNull(solution);
        assertTrue(solution.size() == 6);
        assertTrue(solution.get(5).size() == 6);
        assertTrue(solution.get(5).get(0) == 1);
        assertTrue(solution.get(5).get(1) == 5);
        assertTrue(solution.get(5).get(2) == 10);
        assertTrue(solution.get(5).get(3) == 10);
        assertTrue(solution.get(5).get(4) == 5);
        assertTrue(solution.get(5).get(5) == 1);
    }
}
