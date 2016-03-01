package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution083.
 */
public class Solution083Test {
    @Test
    public void listWith3nodesAnd2duplicates() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        Solution083 solution083 = new Solution083();
        head = solution083.deleteDuplicates(head);
        while (head.next != null) {
            assertTrue(head.val < head.next.val);
            head = head.next;
        }
    }

    @Test
    public void listWith6nodesAnd5duplicates() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(3);

        Solution083 solution083 = new Solution083();
        head = solution083.deleteDuplicates(head);
        while (head.next != null) {
            assertTrue(head.val < head.next.val);
            head = head.next;
        }
    }

    @Test
    public void listWith9nodesAnd6duplicates() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next.next.next = new ListNode(6);

        Solution083 solution083 = new Solution083();
        head = solution083.deleteDuplicates(head);
        while (head.next != null) {
            assertTrue(head.val < head.next.val);
            head = head.next;
        }
    }
}
