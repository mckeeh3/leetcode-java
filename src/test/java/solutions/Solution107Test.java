package solutions;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Tests Solution107.
 */
public class Solution107Test {
    @Test
    public void treeWith5Nodes3Levels() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution107 solution107 = new Solution107();
        List<List<Integer>> levels = solution107.levelOrderBottom(root);
        assertNotNull(levels);
        assertEquals(3, levels.size());
        assertEquals(2, levels.get(0).size());
        assertEquals(2, levels.get(1).size());
        assertEquals(1, levels.get(2).size());
        assertEquals(15, (int) levels.get(0).get(0));
        assertEquals(7, (int) levels.get(0).get(1));
        assertEquals(9, (int) levels.get(1).get(0));
        assertEquals(20, (int) levels.get(1).get(1));
        assertEquals(3, (int) levels.get(2).get(0));
    }

    @Test
    public void treeWith7Nodes3Levels() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(10);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution107 solution107 = new Solution107();
        List<List<Integer>> levels = solution107.levelOrderBottom(root);
        assertNotNull(levels);
        assertEquals(3, levels.size());
        assertEquals(4, levels.get(0).size());
        assertEquals(2, levels.get(1).size());
        assertEquals(1, levels.get(2).size());
        assertEquals(8, (int) levels.get(0).get(0));
        assertEquals(10, (int) levels.get(0).get(1));
        assertEquals(15, (int) levels.get(0).get(2));
        assertEquals(7, (int) levels.get(0).get(3));
        assertEquals(9, (int) levels.get(1).get(0));
        assertEquals(20, (int) levels.get(1).get(1));
        assertEquals(3, (int) levels.get(2).get(0));
    }
}
