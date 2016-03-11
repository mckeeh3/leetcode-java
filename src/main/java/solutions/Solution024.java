package solutions;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * @see <a href="https://leetcode.com/problems/swap-nodes-in-pairs/">24. Swap Nodes in Pairs</a>
 */
public class Solution024 {
    public ListNode swapPairs(ListNode head) {
        ListNode node = head;
        if (head != null && head.next != null) {
            head = head.next;
        }
        swapNodes(node);
        return head;
    }

    private void swapNodes(ListNode node) {
        boolean swap = true;
        ListNode previous = null;

        while (node != null) {
            if (node.next != null) {
                if (swap) {
                    node = swapNode(node, previous);
                    swap = false;
                } else {
                    previous = node;
                    swap = true;
                }
            }
            node = node.next;
        }
    }

    private ListNode swapNode(ListNode node, ListNode previous) {
        ListNode next = node.next;
        ListNode nextNext = next == null ? null : node.next.next;

        if (next != null) {
            next.next = node;
            node.next = nextNext;
        }

        if (previous != null) {
            previous.next = next;
        }
        return next == null ? node : next;
    }
}
