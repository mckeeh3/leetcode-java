package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution155.
 */
public class Solution155Test {
    @Test
    public void push3TopGetMinPop2GetMin() {
        Solution155 solution155 = new Solution155();
        solution155.push(2);
        solution155.push(1);
        solution155.push(3);
        assertEquals(3, solution155.top());
        assertEquals(1, solution155.getMin());
        solution155.pop();
        solution155.pop();
        assertEquals(2, solution155.getMin());
    }

    @Test
    public void push10AscendingGetMin() {
        Solution155 solution155 = new Solution155();
        for (int x = 1; x <= 10; x++) {
            solution155.push(x);
        }
        assertEquals(1, solution155.getMin());
    }

    @Test
    public void push10DescendingGetMin() {
        Solution155 solution155 = new Solution155();
        for (int x = 10; x > 0; x--) {
            solution155.push(x);
        }
        assertEquals(1, solution155.getMin());
    }

    @Test
    public void push10AscendingDeleteAll() {
        Solution155 solution155 = new Solution155();
        for (int x = 1; x <= 10; x++) {
            solution155.push(x);
        }
        for (int x = 1; x <= 10; x++) {
            assertEquals(1, solution155.getMin());
            solution155.pop();
        }
    }

    @Test
    public void push10DescendingDeleteAll() {
        Solution155 solution155 = new Solution155();
        for (int x = 10; x > 0; x--) {
            solution155.push(x);
        }
        for (int i = 1; i <= 10; i++) {
            assertEquals(i, solution155.getMin());
            solution155.pop();
        }
    }

    @Test
    public void push15000getMinPopUntilEmpty() {
        Solution155 solution155 = new Solution155();
        for (int i = -10000; i <= 5000; i++) {
            solution155.push(i);
        }
        assertEquals(-10000, solution155.getMin());
    }

    @Test
    public void pushDuplicateValueAndPopEachValue() {
        Solution155 solution155 = new Solution155();
        solution155.push(512);
        solution155.push(-1024);
        solution155.push(-1024);
        solution155.push(512);
        solution155.pop();
        assertEquals(-1024, solution155.getMin());
        solution155.pop();
        assertEquals(-1024, solution155.getMin());
        solution155.pop();
        assertEquals(512, solution155.getMin());
    }
}
