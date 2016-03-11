package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution024.
 */
public class Solution024Test {
    @Test
    public void nodes4() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        Solution024 solution024 = new Solution024();
        head = solution024.swapPairs(head);

        assertEquals(2, head.val);
        assertEquals(1, head.next.val);
        assertEquals(4, head.next.next.val);
        assertEquals(3, head.next.next.next.val);
        assertNull(head.next.next.next.next);
    }

    @Test
    public void nodes5() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution024 solution024 = new Solution024();
        head = solution024.swapPairs(head);

        assertEquals(2, head.val);
        assertEquals(1, head.next.val);
        assertEquals(4, head.next.next.val);
        assertEquals(3, head.next.next.next.val);
        assertEquals(5, head.next.next.next.next.val);
        assertNull(head.next.next.next.next.next);
    }
}
