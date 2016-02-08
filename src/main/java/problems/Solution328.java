package problems;

import java.util.List;

/**
 * Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking
 * about the node number and not the value in the nodes.
 */
public class Solution328 {
    public ListNode oddEvenList(ListNode head) {
        ListNode oddNode = null;
        ListNode oddHead = null;
        ListNode evenNode = null;
        ListNode evenHead = null;
        ListNode node = head;

        while (node != null) {
            oddNode = addNode(node, oddNode);
            node = tail(node);

            evenNode = addNode(node, evenNode);
            node = tail(node);

            if (oddHead == null) {
                oddHead = oddNode;
            }
            if (evenHead == null) {
                evenHead = evenNode;
            }
        }

        if (oddNode != null && evenNode != null) {
            oddNode.next = evenHead;
        }

        return oddHead;
    }

    private ListNode addNode(ListNode fromNode, ListNode toNode) {
        if (fromNode != null) {
            if (toNode == null) {
                toNode = new ListNode(fromNode.val);
            } else {
                toNode.next = new ListNode(fromNode.val);
            }
        }

        return toNode == null ? null : toNode.next == null ? toNode : toNode.next;
    }

    private ListNode tail(ListNode node) {
        return node == null ? null : node.next;
    }
}
