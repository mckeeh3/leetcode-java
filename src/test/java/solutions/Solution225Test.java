package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution225.
 */
public class Solution225Test {
    @Test
    public void push1push2top2() {
        Solution225 solution225 = new Solution225();
        solution225.push(1);
        solution225.push(2);

        assertEquals(2, solution225.top());
    }

    @Test
    public void push1push2push3top3popPopTop1() {
        Solution225 solution225 = new Solution225();
        solution225.push(1);
        solution225.push(2);
        solution225.push(3);

        assertEquals(3, solution225.top());
        solution225.pop();
        solution225.pop();
        assertEquals(1, solution225.top());
    }

    @Test
    public void push1push2top2popPopEmpty() {
        Solution225 solution225 = new Solution225();
        solution225.push(1);
        solution225.push(2);

        assertEquals(2, solution225.top());
        solution225.pop();
        solution225.pop();
        assertTrue(solution225.empty());
    }
}
