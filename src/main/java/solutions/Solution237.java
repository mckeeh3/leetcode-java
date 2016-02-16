package solutions;

/**
 *
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
