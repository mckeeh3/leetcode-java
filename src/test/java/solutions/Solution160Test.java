package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution160.
 */
public class Solution160Test {
    @Test
    public void intersectionAtValue3() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node3;
        node2.next = node3;
        node3.next = new ListNode(4);

        Solution160 solution160 = new Solution160();
        assertEquals(3, solution160.getIntersectionNode(node1, node2).val);
    }

    @Test
    public void intersectionAtValue6() {
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(5);
        headA.next.next = new ListNode(6);
        headA.next.next.next = new ListNode(7);
        headA.next.next.next.next = new ListNode(8);

        ListNode headB = new ListNode(1);
        headB.next = new ListNode(2);
        headB.next.next = new ListNode(3);
        headB.next.next.next = headA.next.next;

        Solution160 solution160 = new Solution160();
        assertEquals(6, solution160.getIntersectionNode(headA, headB).val);
    }

    @Test
    public void noIntersectionEvenLists() {
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);
        headA.next.next.next = new ListNode(4);

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(7);
        headB.next.next.next = new ListNode(8);

        Solution160 solution160 = new Solution160();
        assertNull(solution160.getIntersectionNode(headA, headB));
    }

    @Test
    public void noIntersectionUnevenLists() {
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);
        headA.next.next.next = new ListNode(4);

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(7);
        headB.next.next.next = new ListNode(8);
        headB.next.next.next.next = new ListNode(9);
        headB.next.next.next.next.next = new ListNode(10);

        Solution160 solution160 = new Solution160();
        assertNull(solution160.getIntersectionNode(headA, headB));
    }
}
