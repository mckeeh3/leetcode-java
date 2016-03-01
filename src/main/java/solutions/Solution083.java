package solutions;

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * @see
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list/">83. Remove Duplicates from Sorted List</a>
 */
public class Solution083 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;

        while (node != null) {
            if (node.next != null && node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }
}
