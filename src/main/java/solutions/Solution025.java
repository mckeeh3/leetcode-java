package solutions;

/**
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 *
 * @see <a href="https://leetcode.com/problems/reverse-nodes-in-k-group/">25. Reverse Nodes in k-Group</a>
 */
public class Solution025 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode node = head;

        if (k > 1) {
            head = replaceHead(head, k);
            swapNodes(node, k);
        }
        return head;
    }

    private ListNode replaceHead(ListNode head, int k) {
        ListNode node = groupLastNode(head, k);
        if (node != null) {
            head = node;
        }
        return head;
    }

    private void swapNodes(ListNode node, int k) {
        ListNode previous = null;

        while (isFullGroup(node, k)) {
            node = swapNodes(node, previous, k);
            previous = groupLastNode(node, k);
            node = previous.next;
        }
    }

    private ListNode swapNodes(ListNode node, ListNode previous, int k) {
        ListNode left = node;
        ListNode right = groupLastNode(node, k);
        ListNode nodeSwap = null;

        while (k > 1) {
            if (left.next == right) {
                node = swapNode(left, previous);
            } else {
                node = swapNode(left, right, previous);
            }
            if (nodeSwap == null) {
                nodeSwap = node;
            }
            previous = node;
            left = node.next;
            right = groupLastNode(left, k - 2);
            k -= 2;
        }

        return nodeSwap;
    }

    private ListNode swapNode(ListNode left, ListNode right, ListNode previous) {
        ListNode leftNext = right.next;
        ListNode rightNext = left.next;
        ListNode rightPrevious = left;
        while (rightPrevious.next != right) {
            rightPrevious = rightPrevious.next;
        }
        if (previous != null) {
            previous.next = right;
        }
        right.next = rightNext;
        rightPrevious.next = left;
        left.next = leftNext;

        return right;
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

    private boolean isFullGroup(ListNode node, int k) {
        ListNode previous = null;
        while (node != null && k-- > 0) {
            previous = node;
            node = node.next;
        }
        return previous != null && k <= 0;
    }

    private ListNode groupLastNode(ListNode node, int k) {
        if (isFullGroup(node, k)) {
            for (int i = 1; i < k; i++) {
                node = node.next;
            }
        } else {
            node = null;
        }

        return node;
    }
}
