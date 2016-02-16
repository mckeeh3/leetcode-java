package solutions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution237.
 */
public class Solution237Test {
    private ListNode node1;
    private ListNode node2;
    private ListNode node3;
    private ListNode node4;

    @Test
    public void deleteNode1Of4Works() {
        Solution237 solution237 = new Solution237();
        solution237.deleteNode(node1);

        assertTrue(node1.val == 2);
        assertTrue(node1.next.val == 3);
        assertTrue(node2.next.val == 4);
    }

    @Test
    public void deleteNode2Of4Works() {
        Solution237 solution237 = new Solution237();
        solution237.deleteNode(node2);

        assertTrue(node1.val == 1);
        assertTrue(node1.next.val == 3);
        assertTrue(node2.next.val == 4);
    }

    @Test
    public void deleteNode3Of4Works() {
        Solution237 solution237 = new Solution237();
        solution237.deleteNode(node3);

        assertTrue(node1.val == 1);
        assertTrue(node1.next.val == 2);
        assertTrue(node2.next.val == 4);
    }

    @Test
    public void deleteNode4Of4Works() {
        Solution237 solution237 = new Solution237();
        solution237.deleteNode(node4);

        assertTrue(node1.val == 1);
        assertTrue(node1.next.val == 2);
        assertTrue(node2.next.val == 3);
        assertTrue(node3.next.val == 4);
    }

    @Before
    public void setup() {
        node1 = new ListNode(1);
        node2 = new ListNode(2);
        node3 = new ListNode(3);
        node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
    }
}
