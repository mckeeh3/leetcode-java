package solutions;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Tests Solution257.
 */
public class Solution257Test {
    @Test
    public void treeWith0NodeWorks() {
        Solution257 solution257 = new Solution257();
        TreeNode root = null;

        List<String> paths = solution257.binaryTreePaths(root);

        assertEquals(paths.size(), 0);
    }

    @Test
    public void treeWith1NodeWorks() {
        Solution257 solution257 = new Solution257();
        TreeNode root = new TreeNode(1);

        List<String> paths = solution257.binaryTreePaths(root);

        assertEquals(paths.get(0), "1");
    }

    @Test
    public void treeWith2NodeWorks() {
        Solution257 solution257 = new Solution257();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);

        List<String> paths = solution257.binaryTreePaths(root);

        assertEquals(paths.get(0), "1->2");
    }

    @Test
    public void treeWith4NodeWorks() {
        Solution257 solution257 = new Solution257();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        List<String> paths = solution257.binaryTreePaths(root);

        assertEquals("1->2->5", paths.get(0));
        assertEquals("1->3", paths.get(1));
    }

    @Test
    public void treeWith5NodeWorks() {
        Solution257 solution257 = new Solution257();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<String> paths = solution257.binaryTreePaths(root);

        assertEquals(paths.get(0), "1->2->4");
        assertEquals(paths.get(1), "1->2->5");
        assertEquals(paths.get(2), "1->3");
    }
}
