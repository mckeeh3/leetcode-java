package solutions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution203.
 */
public class Solution203Test {
    private ListNode head;

    @Test
    public void removeValueFromNullList() {
        head = null;
        Solution203 solution203 = new Solution203();
        head = solution203.removeElements(head, 6);

        assertTrue(head == null);
    }

    @Test
    public void removeValueFromListWithSameValue() {
        head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        Solution203 solution203 = new Solution203();
        head = solution203.removeElements(head, 1);

        assertTrue(head == null);
    }

    @Test
    public void removeValue6elements() {
        Solution203 solution203 = new Solution203();
        head = solution203.removeElements(head, 6);

        assertEquals(1, head.val);
        assertEquals(2, head.next.val);
        assertEquals(3, head.next.next.val);
        assertEquals(4, head.next.next.next.val);
        assertEquals(5, head.next.next.next.next.val);
        assertTrue(head.next.next.next.next.next == null);
    }

    @Test
    public void removeValue1elements() {
        Solution203 solution203 = new Solution203();
        head = solution203.removeElements(head, 1);

        assertEquals(2, head.val);
        assertEquals(6, head.next.val);
        assertEquals(3, head.next.next.val);
        assertEquals(4, head.next.next.next.val);
        assertEquals(5, head.next.next.next.next.val);
        assertEquals(6, head.next.next.next.next.next.val);
        assertTrue(head.next.next.next.next.next.next == null);
    }

    @Test
    public void removeAllElements() {
        Solution203 solution203 = new Solution203();
        head = solution203.removeElements(head, 6);
        head = solution203.removeElements(head, 5);
        head = solution203.removeElements(head, 1);
        head = solution203.removeElements(head, 2);
        head = solution203.removeElements(head, 4);
        head = solution203.removeElements(head, 3);

        assertTrue(head == null);
    }

    @Before
    public void setup() {
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
    }
}
