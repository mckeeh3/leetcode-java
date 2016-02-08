package solutions;

/**
 * Definition for singly-linked list.
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return String.format("%s[%d]", ListNode.class.getSimpleName(), val);
    }
}
