package solutions;

/**
 * Given two binary trees, write a function to check if they are equal or not.
 * <p>Two binary trees are considered equal if they are structurally identical and the nodes have the same value.</p>
 *
 * @see <a href="https://leetcode.com/problems/same-tree/">100. Same Tree</a>
 */
public class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return match(p, q);
    }

    private boolean match(TreeNode left, TreeNode right) {
        return left == null && right == null || !(left == null || right == null) && left.val == right.val && match
                (left.left, right.left) && match(left.right, right.right);
    }
}
