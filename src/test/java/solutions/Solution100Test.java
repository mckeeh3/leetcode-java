package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution100.
 */
public class Solution100Test {
    @Test
    public void matching2levelTrees() {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        Solution100 solution100 = new Solution100();
        assertTrue(solution100.isSameTree(root1, root2));
    }

    @Test
    public void unmatched2levelTrees() {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        //root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        Solution100 solution100 = new Solution100();
        assertFalse(solution100.isSameTree(root1, root2));
    }

    @Test
    public void matching3levelTrees() {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(4);
        root1.right = new TreeNode(5);
        root1.right.left = new TreeNode(6);
        root1.right.right = new TreeNode(7);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.left.left = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right = new TreeNode(5);
        root2.right.left = new TreeNode(6);
        root2.right.right = new TreeNode(7);

        Solution100 solution100 = new Solution100();
        assertTrue(solution100.isSameTree(root1, root2));
    }

    @Test
    public void unmatched3levelTrees() {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(4);
        root1.right = new TreeNode(5);
        root1.right.left = new TreeNode(6);
        root1.right.right = new TreeNode(7);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.left.left = new TreeNode(3);
        root2.left.right = new TreeNode(99);
        root2.right = new TreeNode(5);
        root2.right.left = new TreeNode(6);
        root2.right.right = new TreeNode(7);

        Solution100 solution100 = new Solution100();
        assertFalse(solution100.isSameTree(root1, root2));
    }
}
