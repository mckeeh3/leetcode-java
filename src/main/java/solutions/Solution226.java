package solutions;

/**
 * Invert a binary tree.
 *
 * @see <a href="https://leetcode.com/problems/invert-binary-tree/">226. Invert Binary Tree</a>
 */
public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode hold = root.left;
            root.left = root.right;
            root.right = hold;

            invertTree(root.left);
            invertTree(root.right);
        }

        return root;
    }
}
