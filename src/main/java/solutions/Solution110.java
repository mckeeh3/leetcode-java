package solutions;

/**
 * Given a binary tree, determine if it is height-balanced.
 * <p>For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two
 * subtrees of every node never differ by more than 1.</p>
 *
 * @see <a href="https://leetcode.com/problems/balanced-binary-tree/">110. Balanced Binary Tree</a>
 */
public class Solution110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else if (isLeaf(root)) {
            return true;
        } else {
            int depthLeft = depth(root.left, 1);
            int depthRight = depth(root.right, 1);

            return depthLeft > 0 && depthRight > 0 && Math.abs(depthLeft - depthRight) <= 1;
        }
    }

    private int depth(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        } else if (isLeaf(node)) {
            return depth + 1;
        } else if (node.left == null && node.right != null && !isLeaf(node.right)) {
            return -1;
        } else if (node.right == null && node.left != null && !isLeaf(node.left)) {
            return -1;
        } else {
            int depthLeft = depth(node.left, depth + 1);
            int depthRight = depth(node.right, depth + 1);

            return Math.abs(depthLeft - depthRight) > 1 ? 0 : Math.max(depthLeft, depthRight);
        }
    }

    private boolean isLeaf(TreeNode node) {
        return node != null && node.left == null && node.right == null;
    }
}
