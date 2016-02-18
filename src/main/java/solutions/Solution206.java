package solutions;

/**
 * Reverse a singly linked list.
 *
 * @see <a href="https://leetcode.com/problems/reverse-linked-list/">206. Reverse Linked List</a>
 */
public class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode next;
        ListNode previous = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}
