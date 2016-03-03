package solutions;

/**
 * Given a linked list, remove the nth node from the end of list and return its head.
 *
 * @see
 * <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/">19. Remove Nth Node From End of List</a>
 */
public class Solution019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n <= 0 || head == null) {
            return head;
        } else {
            int size = size(head);
            if (size - n >= 0) {
                return removeNode(head, size + 1 - n);
            }
            return null;
        }
    }

    private int size(ListNode node) {
        int size = 0;
        while (node != null) {
            node = node.next;
            size++;
        }
        return size;
    }

    private ListNode removeNode(ListNode head, int pos) {
        if (pos == 0) {
            return head.next;
        } if (pos == 1) {
            return head.next;
        } else {
            int count = 1;
            ListNode previous = head;
            ListNode next = head.next;

            while (next != null && count < pos - 1) {
                previous = next;
                next = next.next;
                count++;
            }

            if (next == null) {
                previous.next = null;
            } else {
                previous.next = next.next;
            }

            return head;
        }
    }
}
