package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution101.
 */
public class Solution101Test {
    @Test
    public void symmetricTreeWith3levels() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        Solution101 solution101 = new Solution101();
        assertTrue(solution101.isSymmetric(root));
    }

    @Test
    public void asymmetricTreeWith3levels() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(4);

        Solution101 solution101 = new Solution101();
        assertFalse(solution101.isSymmetric(root));
    }

    @Test
    public void symmetricTreeWith4levels() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(5);
        root.left.left.right = new TreeNode(6);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(8);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(4);
        root.right.left.left = new TreeNode(8);
        root.right.left.right = new TreeNode(7);
        root.right.right = new TreeNode(3);
        root.right.right.left = new TreeNode(6);
        root.right.right.right = new TreeNode(5);

        Solution101 solution101 = new Solution101();
        assertTrue(solution101.isSymmetric(root));
    }
}
