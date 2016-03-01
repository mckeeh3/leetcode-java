package solutions;

import java.util.TreeMap;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <ul>
 * <li>push(x) -- Push element x onto stack.</li>
 * <li>pop() -- Removes the element on top of the stack.</li>
 * <li>top() -- Get the top element.</li>
 * <li>getMin() -- Retrieve the minimum element in the stack.</li>
 * </ul>
 *
 * @see <a href="https://leetcode.com/problems/min-stack/">155. Min Stack</a>
 * @see <a href="https://en.wikipedia.org/wiki/Red%E2%80%93black_tree">Red–black tree</a>
 */
public class Solution155 {
    private ListNode top = null;
    private TreeMap<Integer, Integer> tree = new TreeMap<>();

    public void push(int x) {
        ListNode node = new ListNode(x);
        node.next = top;
        top = node;
        treeAdd(x);
    }

    public void pop() {
        if (top != null) {
            treeRemove(top.val);
            top = top.next;
        }
    }

    public int top() {
        return top == null ? 0 : top.val;
    }

    public int getMin() {
        return tree.firstKey();
    }

    private void treeAdd(int x) {
        if (tree.containsKey(x)) {
            tree.put(x, tree.get(x) + 1);
        } else {
            tree.put(x, 1);
        }
    }

    private void treeRemove(int x) {
        if (tree.containsKey(x)) {
            int count = tree.get(x) - 1;
            if (count > 0) {
                tree.put(x, count);
            } else {
                tree.remove(x);
            }
        }
    }
}
