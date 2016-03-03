package solutions;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the
 * nodes of the first two lists.
 *
 * @see <a href="https://leetcode.com/problems/merge-two-sorted-lists/">21. Merge Two Sorted Lists</a>
 */
public class Solution021 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result;
        ListNode node;

        if (l1 == null && l2 == null) {
            result = null;
        } else if (l1 == null) {
            result = l2;
        } else if (l2 == null) {
            result = l1;
        } else {
            if (l1.val <= l2.val) {
                result = new ListNode(l1.val);
                node = result;
                l1 = l1.next;
            } else {
                result = new ListNode(l2.val);
                node = result;
                l2 = l2.next;
            }

            while (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    node.next = new ListNode(l1.val);
                    node = node.next;
                    l1 = l1.next;
                } else {
                    node.next = new ListNode(l2.val);
                    node = node.next;
                    l2 = l2.next;
                }
            }

            append(node, l1);
            append(node, l2);
        }

        return result;
    }

    private void append(ListNode tail, ListNode node) {
        while (node != null) {
            tail.next = node;
            tail = tail.next;
            node = node.next;
        }
    }
}
