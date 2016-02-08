package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution328.
 */
public class Solution328Test {

    @Test
    public void testOddEvenList() throws Exception {
        ListNode head = new ListNode(1);
        ListNode node = head;
        node = addNode(node, 2);
        node = addNode(node, 3);
        node = addNode(node, 4);
        addNode(node, 5);

        Solution328 solution328 = new Solution328();

        ListNode solution = solution328.oddEvenList(head);

        assertNode(solution, 1, true);
        solution = solution.next;

        assertNode(solution, 3, true);
        solution = solution.next;

        assertNode(solution, 5, true);
        solution = solution.next;

        assertNode(solution, 2, true);
        solution = solution.next;

        assertNode(solution, 4, false);
    }

    @Test
    public void emptyListWorks() {
        Solution328 solution328 = new Solution328();
        ListNode solution = solution328.oddEvenList(null);
        assertNull(solution);
    }

    @Test
    public void singleNodeWorks() {
        Solution328 solution328 = new Solution328();
        ListNode solution = solution328.oddEvenList(new ListNode(123));
        assertNode(solution, 123, false);
    }

    private void assertNode(ListNode node, int value, boolean mustHaveNext) {
        assertNotNull(node);
        assertNotNull(node.val);
        assertEquals(node.val, value);
        if (mustHaveNext) {
            assertNotNull(node.next);
        } else {
            assertNull(node.next);
        }
    }

    private ListNode addNode(ListNode node, int value) {
        if (node == null) {
            return new ListNode(value);
        } else {
            node.next = new ListNode(value);
            return node.next;
        }
    }
}