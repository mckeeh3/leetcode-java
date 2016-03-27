package solutions;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Tests Solution023.
 */
public class Solution023Test {
    @Test
    public void listsEmpty() {
        ListNode[] lists = {};

        Solution023 solution023 = new Solution023();
        ListNode result = solution023.mergeKLists(lists);
        assertNull(result);
    }

    @Test
    public void lists2numbers1() {
        ListNode l2 = new ListNode(1);
        ListNode[] lists = {null, l2};

        Solution023 solution023 = new Solution023();
        ListNode result = solution023.mergeKLists(lists);
        assertNotNull(result);
        assertEquals(1, result.val);
    }

    @Test
    public void lists2numbers5() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        ListNode[] lists = {l1, l2};

        Solution023 solution023 = new Solution023();
        ListNode result = solution023.mergeKLists(lists);
        assertNotNull(result);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(4, result.next.next.next.val);
        assertEquals(5, result.next.next.next.next.val);
        assertNull(result.next.next.next.next.next);
    }

    @Test
    public void lists3numbers9() {
        ListNode l1 = new ListNode(-1);
        l1.next = new ListNode(1);
        ListNode l2 = new ListNode(-3);
        l2.next = new ListNode(1);
        l2.next.next = new ListNode(4);
        ListNode l3 = new ListNode(-2);
        l3.next = new ListNode(-1);
        l3.next.next = new ListNode(0);
        l3.next.next.next = new ListNode(2);
        ListNode[] lists = {l1, l2, l3};

        Solution023 solution023 = new Solution023();
        ListNode result = solution023.mergeKLists(lists);
        assertNotNull(result);
        assertEquals(-3, result.val);
        assertEquals(-2, result.next.val);
        assertEquals(-1, result.next.next.val);
        assertEquals(-1, result.next.next.next.val);
        assertEquals(0, result.next.next.next.next.val);
        assertEquals(1, result.next.next.next.next.next.val);
        assertEquals(1, result.next.next.next.next.next.next.val);
        assertEquals(2, result.next.next.next.next.next.next.next.val);
        assertEquals(4, result.next.next.next.next.next.next.next.next.val);
    }

    @Test
    public void lists10kNumbers10k() {
        Random random = new Random();
        ListNode[] lists = new ListNode[10000];
        for (int i = 0; i < lists.length; i++) {
            lists[i] = new ListNode(random.nextInt(100));
        }

        Solution023 solution023 = new Solution023();
        ListNode result = solution023.mergeKLists(lists);
        assertNotNull(result);
        boolean sorted = true;
        int val = result.val;
        result = result.next;
        while (sorted && result != null) {
            if (result.next != null && val > result.next.val) {
                sorted = false;
            } else {
                result = result.next;
            }
        }
        assertTrue(sorted);
    }
}
