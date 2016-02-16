package solutions;

import java.util.Stack;

/**
 * Implement the following operations of a queue using stacks.
 * <ul>
 * <li>push(x) -- Push element x to the back of queue.</li>
 * <li>pop() -- Removes the element from in front of queue.</li>
 * <li>peek() -- Get the front element.</li>
 * <li>empty() -- Return whether the queue is empty.</li>
 * </ul>
 *
 * @see <a href="https://leetcode.com/problems/implement-queue-using-stacks/">232. Implement Queue using Stacks</a>
 */
public class Solution232 {
    private Stack<Integer> stack = new Stack<>();

    // Push element x to the back of queue.
    public void push(int x) {
        stack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        reverse();
        stack.pop();
        reverse();
    }

    // Get the front element.
    public int peek() {
        reverse();
        int value = stack.peek();
        reverse();
        return value;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.isEmpty();
    }

    private void reverse() {
        Stack<Integer> reversed = new Stack<>();
        while (!stack.isEmpty()) {
            reversed.push(stack.pop());
        }
        stack = reversed;
    }
}
