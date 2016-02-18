package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution206.
 */
public class Solution206Test {
    @Test
    public void reverse3nodes() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        Solution206 solution206 = new Solution206();
        ListNode reversed = solution206.reverseList(head);

        assertEquals(3, reversed.val);
        assertEquals(2, reversed.next.val);
        assertEquals(1, reversed.next.next.val);
    }
}
