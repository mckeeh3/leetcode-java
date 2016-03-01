package solutions;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 *
 * @see <a href="https://leetcode.com/problems/symmetric-tree/">101. Symmetric Tree</a>
 */
public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        return root == null || match(root.left, root.right);
    }

    private boolean match(TreeNode left, TreeNode right) {
        return left == null && right == null || !(left == null || right == null) && left.val == right.val && match
                (left.left, right.right) && match(left.right, right.left);
    }
}
