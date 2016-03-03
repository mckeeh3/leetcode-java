package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution019.
 */
public class Solution019Test {
    @Test
    public void nullList() {
        Solution019 solution019 = new Solution019();
        assertNull(solution019.removeNthFromEnd(null, 0));
    }

    @Test
    public void removeNisGreaterThanListSize() {
        Solution019 solution019 = new Solution019();
        assertNull(solution019.removeNthFromEnd(new ListNode(1), 2));
    }

    @Test
    public void removeLastFrom1nodeList() {
        Solution019 solution019 = new Solution019();
        assertNull(solution019.removeNthFromEnd(new ListNode(1), 1));
    }

    @Test
    public void removeFirstFrom3nodeList() {
        Solution019 solution019 = new Solution019();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        head = solution019.removeNthFromEnd(head, 3);

        assertNotNull(head);
        assertEquals(2, head.val);
        assertEquals(3, head.next.val);
    }

    @Test
    public void removeNode2from3nodeList() {
        Solution019 solution019 = new Solution019();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        head = solution019.removeNthFromEnd(head, 2);

        assertNotNull(head);
        assertEquals(1, head.val);
        assertEquals(3, head.next.val);
    }

    @Test
    public void removeNode4from5nodeList() {
        Solution019 solution019 = new Solution019();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = solution019.removeNthFromEnd(head, 2);

        assertNotNull(head);
        assertEquals(1, head.val);
        assertEquals(2, head.next.val);
        assertEquals(3, head.next.next.val);
        assertEquals(5, head.next.next.next.val);
    }
}
