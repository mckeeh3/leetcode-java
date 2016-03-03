package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution021.
 */
public class Solution021Test {
    @Test
    public void twoNullLists() {
        Solution021 solution021 = new Solution021();
        assertNull(solution021.mergeTwoLists(null, null));
    }

    @Test
    public void oneNullTwoNotNull() {
        ListNode l2 = new ListNode(1);

        Solution021 solution021 = new Solution021();
        ListNode result = solution021.mergeTwoLists(null, l2);

        assertNotNull(result);
        assertEquals(1, result.val);
    }

    @Test
    public void oneNotNullTwoNull() {
        ListNode l1 = new ListNode(1);

        Solution021 solution021 = new Solution021();
        ListNode result = solution021.mergeTwoLists(l1, null);

        assertNotNull(result);
        assertEquals(1, result.val);
    }

    @Test
    public void l1with1NodeL2with3nodes() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(3);

        Solution021 solution021 = new Solution021();
        ListNode result = solution021.mergeTwoLists(l1, l2);

        assertNotNull(result);
        assertEquals(1, result.val);
        assertEquals(1, result.next.val);
        assertEquals(2, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
    }

    @Test
    public void l1with2NodesL2with3nodes() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(3);

        Solution021 solution021 = new Solution021();
        ListNode result = solution021.mergeTwoLists(l1, l2);

        assertNotNull(result);
        assertEquals(1, result.val);
        assertEquals(1, result.next.val);
        assertEquals(2, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
        assertEquals(3, result.next.next.next.next.val);
    }
}
