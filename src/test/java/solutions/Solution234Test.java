package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution234.
 */
public class Solution234Test {
    @Test
    public void list1IsNotPalindrome() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        Solution234 solution234 = new Solution234();
        assertFalse(solution234.isPalindrome(head));
    }

    @Test
    public void list2IsPalindrome() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);

        Solution234 solution234 = new Solution234();
        assertTrue(solution234.isPalindrome(head));
    }

    @Test
    public void list3IsPalindrome() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);

        Solution234 solution234 = new Solution234();
        assertTrue(solution234.isPalindrome(head));
    }

    @Test
    public void list4IsNotPalindrome() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        Solution234 solution234 = new Solution234();
        assertFalse(solution234.isPalindrome(head));
    }
}
