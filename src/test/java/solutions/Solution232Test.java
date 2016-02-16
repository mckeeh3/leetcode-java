package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution232.
 */
public class Solution232Test {
    @Test
    public void push1push2peek() {
        Solution232 solution232 = new Solution232();
        solution232.push(1);
        solution232.push(2);

        assertEquals(1, solution232.peek());
    }

    @Test
    public void push1push2popPeek() {
        Solution232 solution232 = new Solution232();
        solution232.push(1);
        solution232.push(2);
        solution232.pop();

        assertEquals(2, solution232.peek());
    }

    @Test
    public void push1push2push3popPeek() {
        Solution232 solution232 = new Solution232();
        solution232.push(1);
        solution232.push(2);
        solution232.push(3);
        solution232.pop();

        assertEquals(2, solution232.peek());
    }

    @Test
    public void push1push2push3push4popPopPeek() {
        Solution232 solution232 = new Solution232();
        solution232.push(1);
        solution232.push(2);
        solution232.push(3);
        solution232.push(4);
        solution232.pop();
        solution232.pop();

        assertEquals(3, solution232.peek());
    }
}
