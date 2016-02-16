package solutions;

/**
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 *
 * @see <a href="https://leetcode.com/problems/delete-node-in-a-linked-list/">237. Delete Node in a Linked List</a>
 */
public class Solution237 {
    public void deleteNode(ListNode node) {
        if (node != null && node.next != null) {
            node.val = node.next.val;
            if (node.next.next == null) {
                node.next = null;
            } else {
                deleteNode(node.next);
            }
        }
    }
}
