package solutions;

/**
 * Remove all elements from a linked list of integers that have value val.
 *
 * @see <a href="https://leetcode.com/problems/remove-linked-list-elements/">203. Remove Linked List Elements</a>
 */
public class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        ListNode previous = null;

        while (current != null) {
            if (current.val == val) {
                if (previous != null) {
                    previous.next = current.next;
                }
            } else {
                previous = current;
            }
            current = current.next;
        }

        while (head != null && head.val == val) {
            head = head.next;
        }

        return head;
    }
}
