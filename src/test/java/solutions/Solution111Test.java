package solutions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution111.
 */
public class Solution111Test {
    private TreeNode head;

    @Test
    public void emptyTreeHasDepthOf0() {
        Solution111 solution111 = new Solution111();
        assertEquals(0, solution111.minDepth(null));
    }

    @Test
    public void treeWith1NodeHasDepthOf1() {
        Solution111 solution111 = new Solution111();
        assertEquals(1, solution111.minDepth(new TreeNode(99)));
    }

    @Test
    public void treeWith2NodesHasDepthOf1() {
        head = new TreeNode(1);
        head.left = new TreeNode(2);
        Solution111 solution111 = new Solution111();
        assertEquals(2, solution111.minDepth(head));
    }

    @Test
    public void treeWith3NodesHasDepthOf2() {
        head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        Solution111 solution111 = new Solution111();
        assertEquals(2, solution111.minDepth(head));
    }

    @Test
    public void treeWith10NodesHasDepthOf3() {
        Solution111 solution111 = new Solution111();
        assertEquals(3, solution111.minDepth(head));
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
