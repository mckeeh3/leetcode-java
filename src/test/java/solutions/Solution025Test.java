package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution025.
 */
public class Solution025Test {
    @Test
    public void nodes1k2() {
        ListNode head = new ListNode(1);

        Solution025 solution025 = new Solution025();
        head = solution025.reverseKGroup(head, 2);

        assertEquals(1, head.val);
        assertNull(head.next);
    }

    @Test
    public void nodes4k2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        Solution025 solution025 = new Solution025();
        head = solution025.reverseKGroup(head, 2);

        assertEquals(2, head.val);
        assertEquals(1, head.next.val);
        assertEquals(4, head.next.next.val);
        assertEquals(3, head.next.next.next.val);
        assertNull(head.next.next.next.next);
    }

    @Test
    public void nodes4k3() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        Solution025 solution025 = new Solution025();
        head = solution025.reverseKGroup(head, 3);

        assertEquals(3, head.val);
        assertEquals(2, head.next.val);
        assertEquals(1, head.next.next.val);
        assertEquals(4, head.next.next.next.val);
        assertNull(head.next.next.next.next);
    }

    @Test
    public void nodes4k4() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        Solution025 solution025 = new Solution025();
        head = solution025.reverseKGroup(head, 4);

        assertEquals(4, head.val);
        assertEquals(3, head.next.val);
        assertEquals(2, head.next.next.val);
        assertEquals(1, head.next.next.next.val);
        assertNull(head.next.next.next.next);
    }

    @Test
    public void nodes5k2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution025 solution025 = new Solution025();
        head = solution025.reverseKGroup(head, 2);

        assertEquals(2, head.val);
        assertEquals(1, head.next.val);
        assertEquals(4, head.next.next.val);
        assertEquals(3, head.next.next.next.val);
        assertEquals(5, head.next.next.next.next.val);
        assertNull(head.next.next.next.next.next);
    }

    @Test
    public void nodes5k3() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution025 solution025 = new Solution025();
        head = solution025.reverseKGroup(head, 3);

        assertEquals(3, head.val);
        assertEquals(2, head.next.val);
        assertEquals(1, head.next.next.val);
        assertEquals(4, head.next.next.next.val);
        assertEquals(5, head.next.next.next.next.val);
        assertNull(head.next.next.next.next.next);
    }
}
