package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right,
 * level by level from leaf to root).
 * <p>For example:</p>
 * <p>Given binary tree {3,9,20,#,#,15,7},</p>
 * <pre>     3
 *  / \
 * 9  20
 *   /  \
 *  15   7
 * </pre>
 * <p>return its level order traversal as:</p>
 * <pre>
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 * </pre>
 *
 * @see
 * <a href="https://leetcode.com/problems/binary-tree-level-order-traversal-ii/">107. Binary Tree Level Order Traversal II</a>
 */
public class Solution107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Stack<List<Integer>> levelStack = new Stack<>();
        levelOrderBottom(root, 0, levelStack);
        return levels(levelStack);
    }

    private void levelOrderBottom(TreeNode node, int level, Stack<List<Integer>> levelStack) {
        if (node != null) {
            if (levelStack.size() < level + 1) {
                levelStack.add(new ArrayList<>());
            }
            levelStack.get(level).add(node.val);
            levelOrderBottom(node.left, level + 1, levelStack);
            levelOrderBottom(node.right, level + 1, levelStack);
        }
    }

    private List<List<Integer>> levels(Stack<List<Integer>> levelStack) {
        List<List<Integer>> levels = new ArrayList<>();

        while (!levelStack.isEmpty()) {
            levels.add(levelStack.pop());
        }
        return levels;
    }
}
