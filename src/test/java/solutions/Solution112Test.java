package solutions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution112.
 */
public class Solution112Test {
    private TreeNode head;

    @Test
    public void treeHasPathSumOf27() {
        Solution112 solution112 = new Solution112();
        assertTrue(solution112.hasPathSum(head, 27));
    }

    @Test
    public void treeHasPathSumOf22() {
        Solution112 solution112 = new Solution112();
        assertTrue(solution112.hasPathSum(head, 22));
    }

    @Test
    public void treeHasPathSumOf26() {
        Solution112 solution112 = new Solution112();
        assertTrue(solution112.hasPathSum(head, 26));
    }

    @Test
    public void treeHasPathSumOf18() {
        Solution112 solution112 = new Solution112();
        assertTrue(solution112.hasPathSum(head, 18));
    }

    @Test
    public void treeDoesNotHavePathSumOf9() {
        Solution112 solution112 = new Solution112();
        assertFalse(solution112.hasPathSum(head, 9));
    }

    @Test
    public void treeDoesNotHavePathSumOf13() {
        Solution112 solution112 = new Solution112();
        assertFalse(solution112.hasPathSum(head, 13));
    }

    @Test
    public void treeDoesNotHavePathSumOf99() {
        Solution112 solution112 = new Solution112();
        assertFalse(solution112.hasPathSum(head, 99));
    }

    @Test
    public void treeDoesNotHavePathSumOf1() {
        head = new TreeNode(1);
        head.right = new TreeNode(2);

        Solution112 solution112 = new Solution112();
        assertFalse(solution112.hasPathSum(head, 1));
    }

    @Before
    public void setup() {
        head = new TreeNode(5);
        head.left = new TreeNode(4);
        head.left.left = new TreeNode(11);
        head.left.left.left = new TreeNode(7);
        head.left.left.right = new TreeNode(2);
        head.right = new TreeNode(8);
        head.right.left = new TreeNode(13);
        head.right.right = new TreeNode(4);
        head.right.right.right = new TreeNode(1);
    }
}
