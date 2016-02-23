package solutions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution104.
 */
public class Solution104Test {
    private TreeNode head;

    @Test
    public void emptyTreeHasDepthOf0() {
        Solution104 solution104 = new Solution104();
        assertEquals(0, solution104.maxDepth(null));
    }

    @Test
    public void treeWith1NodeHasDepthOf1() {
        Solution104 solution104 = new Solution104();
        assertEquals(1, solution104.maxDepth(new TreeNode(99)));
    }

    @Test
    public void treeWith2NodesHasDepthOf1() {
        head = new TreeNode(1);
        head.left = new TreeNode(2);
        Solution104 solution104 = new Solution104();
        assertEquals(2, solution104.maxDepth(head));
    }

    @Test
    public void treeWith3NodesHasDepthOf2() {
        head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        Solution104 solution104 = new Solution104();
        assertEquals(2, solution104.maxDepth(head));
    }

    @Test
    public void treeWith10NodesHasDepthOf4() {
        Solution104 solution104 = new Solution104();
        assertEquals(4, solution104.maxDepth(head));
    }

    @Test
    public void treeWith12NodesHasDepthOf6() {
        head.right.right.right.right = new TreeNode(2);
        head.right.right.right.right.right = new TreeNode(3);
        Solution104 solution104 = new Solution104();
        assertEquals(6, solution104.maxDepth(head));
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
