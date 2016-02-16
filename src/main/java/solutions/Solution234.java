package solutions;

/**
 * Given a singly linked list, determine if it is a palindrome.
 *
 * @see <a href="https://leetcode.com/problems/palindrome-linked-list/">234. Palindrome Linked List</a>
 */
public class Solution234 {
    public boolean isPalindrome(ListNode head) {
        return isPalindrome(head, reverse(head));
    }

    private boolean isPalindrome(ListNode forward, ListNode reverse) {
        while (forward != null) {
            if (forward.val != reverse.val) {
                return false;
            } else {
                forward = forward.next;
                reverse = reverse.next;
            }
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode node = head;
        ListNode reverse = null;

        while (node != null) {
            ListNode tail = reverse;
            reverse = new ListNode(node.val);
            reverse.next = tail;
            node = node.next;
        }
        return reverse;
    }
}
