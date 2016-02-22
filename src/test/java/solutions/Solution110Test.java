package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution110.
 */
public class Solution110Test {
    @Test
    public void nullTreeIsBalanced() {
        Solution110 solution110 = new Solution110();
        assertTrue(solution110.isBalanced(null));
    }

    @Test
    public void treeWith1NodeIsBalanced() {
        TreeNode root = new TreeNode(1);
        Solution110 solution110 = new Solution110();
        assertTrue(solution110.isBalanced(root));
    }

    @Test
    public void treeWith2BalancedNodesIsBalanced() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        Solution110 solution110 = new Solution110();
        assertTrue(solution110.isBalanced(root));
    }

    @Test
    public void treeWith3BalancedNodesIsBalanced() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        Solution110 solution110 = new Solution110();
        assertTrue(solution110.isBalanced(root));
    }

    @Test
    public void treeWith4UnbalancedNodesIsNotBalanced() {
        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(1);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        Solution110 solution110 = new Solution110();
        assertFalse(solution110.isBalanced(root));
    }
}
