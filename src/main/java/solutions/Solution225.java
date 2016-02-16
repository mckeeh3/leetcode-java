package solutions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * mplement the following operations of a stack using queues.
 * <ul>
 * <li>push(x) -- Push element x onto stack.</li>
 * <li>pop() -- Removes the element on top of the stack.</li>
 * <li>top() -- Get the top element.</li>
 * <li>empty() -- Return whether the stack is empty.</li>
 * </ul>
 *
 * @see <a href="https://leetcode.com/problems/implement-stack-using-queues/">225. Implement Stack using Queues</a>
 */
public class Solution225 {
    private Queue<Integer> queue = new LinkedList<>();

    // Push element x onto stack.
    public void push(int x) {
        queue.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        Queue<Integer> queueCopy = new LinkedList<>();
        while (!queue.isEmpty()) {
            int value = queue.remove();
            if (!queue.isEmpty()) {
                queueCopy.add(value);
            }
        }
        queue = queueCopy;
    }

    // Get the top element.
    public int top() {
        Queue<Integer> queueCopy = new LinkedList<>();
        int value = 0;
        while (!queue.isEmpty()) {
            value = queue.remove();
            queueCopy.add(value);
        }
        queue = queueCopy;
        return value;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }
}
