package solutions;

/**
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and
 * each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * @see <a href="https://leetcode.com/problems/add-two-numbers/">2. Add Two Numbers</a>
 */
public class Solution002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int digit, digit1, digit2;
        int carry = 0;
        ListNode answer = null;
        ListNode next;
        ListNode previous = null;

        while (l1 != null || l2 != null) {
            digit1 = l1 == null ? 0 : l1.val;
            digit2 = l2 == null ? 0 : l2.val;
            digit = digit1 + digit2 + carry;

            if (digit >= 10) {
                carry = digit / 10;
                digit %= 10;
            } else {
                carry = 0;
            }

            next = new ListNode(digit);
            if (previous != null) {
                previous.next = next;
            }
            if (answer == null) {
                answer = next;
            }

            previous = next;

            l1 = l1 == null || l1.next == null ? null : l1.next;
            l2 = l2 == null || l2.next == null ? null : l2.next;

            if (carry > 0 && l1 == null && l2 == null) {
                previous.next = new ListNode(carry);
            }
        }

        return answer;
    }
}
