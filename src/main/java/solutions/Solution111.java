package solutions;

/**
 * Given a binary tree, find its minimum depth.
 * <p>The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf
 * node.</p>
 *
 * @see <a href="https://leetcode.com/problems/minimum-depth-of-binary-tree/">111. Minimum Depth of Binary Tree</a>
 */
public class Solution111 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return depth(root, 0);
        }
    }

    private int depth(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        } else if (isLeaf(node)) {
            return depth + 1;
        } else if (node.left != null && node.right != null) {
            return Math.min(depth(node.left, depth + 1), depth(node.right, depth + 1));
        } else if (node.left != null) {
            return depth(node.left, depth + 1);
        } else {
            return depth(node.right, depth + 1);
        }
    }

    private boolean isLeaf(TreeNode node) {
        return node != null && node.left == null && node.right == null;
    }
}
