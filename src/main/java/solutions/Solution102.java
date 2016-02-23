package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
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
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 * </pre>
 *
 * @see
 * <a href="https://leetcode.com/problems/binary-tree-level-order-traversal/">102. Binary Tree Level Order Traversal</a>
 */
public class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        levelOrder(root, 0, levels);
        return levels;
    }

    private void levelOrder(TreeNode node, int level, List<List<Integer>> levels) {
        if (node != null) {
            if (levels.size() < level + 1) {
                levels.add(new ArrayList<>());
            }
            levels.get(level).add(node.val);
            levelOrder(node.left, level + 1, levels);
            levelOrder(node.right, level + 1, levels);
        }
    }
}
