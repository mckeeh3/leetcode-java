package solutions;

/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 *
 * @see <a href="">160. Intersection of Two Linked Lists</a>
 */
public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = length(headA);
        int lengthB = length(headB);
        int length = Math.max(lengthA, lengthB);

        while (length-- > 0) {
            if (lengthA < lengthB) {
                headB = headB.next;
                lengthB--;
            } else if (lengthA > lengthB) {
                headA = headA.next;
                lengthA--;
            } else if (headA.equals(headB)) {
                return headA;
            } else {
                headA = headA.next;
                headB = headB.next;
                lengthA--;
                lengthB--;
            }
        }
        return null;
    }

    private int length(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}
