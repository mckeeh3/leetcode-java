package solutions;

/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values
 * along the path equals the given sum.
 *
 * @see <a href="https://leetcode.com/problems/path-sum/">112. Path Sum</a>
 */
public class Solution112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        return hasPathSum(root, sum, 0);
    }

    private boolean hasPathSum(TreeNode node, int sum, int pathSum) {
        if (node == null) {
            return false;
        } else if (node.val + pathSum == sum && isLeaf(node)) {
            return true;
        } else {
            return hasPathSum(node.left, sum, pathSum + node.val) || hasPathSum(node.right, sum, pathSum + node.val);
        }
    }

    private boolean isLeaf(TreeNode node) {
        return node != null && node.left == null && node.right == null;
    }
}
