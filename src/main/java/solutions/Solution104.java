package solutions;

/**
 * Given a binary tree, find its maximum depth.
 * <p>The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf
 * node.</p>
 *
 * @see <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/">104. Maximum Depth of Binary Tree</a>
 */
public class Solution104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return depth(root, 0);
        }
    }

    private int depth(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        } else {
            return Math.max(depth(node.left, depth + 1), depth(node.right, depth + 1));
        }
    }
}
