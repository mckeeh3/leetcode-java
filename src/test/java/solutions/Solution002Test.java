package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution002.
 */
public class Solution002Test {
    @Test
    public void input1node() {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);

        Solution002 solution002 = new Solution002();
        ListNode answer = solution002.addTwoNumbers(l1, l2);
        assertEquals(0, answer.val);
        assertEquals(1, answer.next.val);
        assertNull(answer.next.next);
    }

    @Test
    public void input3nodes() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Solution002 solution002 = new Solution002();
        ListNode answer = solution002.addTwoNumbers(l1, l2);
        assertEquals(7, answer.val);
        assertEquals(0, answer.next.val);
        assertEquals(8, answer.next.next.val);
        assertNull(answer.next.next.next);
    }

    @Test
    public void l12nodesL21node() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(8);
        ListNode l2 = new ListNode(0);

        Solution002 solution002 = new Solution002();
        ListNode answer = solution002.addTwoNumbers(l1, l2);
        assertEquals(1, answer.val);
        assertEquals(8, answer.next.val);
        assertNull(answer.next.next);
    }

    @Test
    public void l11nodesL22node() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);

        Solution002 solution002 = new Solution002();
        ListNode answer = solution002.addTwoNumbers(l1, l2);
        assertEquals(0, answer.val);
        assertEquals(0, answer.next.val);
        assertEquals(1, answer.next.next.val);
        assertNull(answer.next.next.next);
    }
}
