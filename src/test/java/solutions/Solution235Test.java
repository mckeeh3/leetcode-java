package solutions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution235.
 */
public class Solution235Test {
    private TreeNode root;

    @Test
    public void lcaOf2And8Is6() {
        Solution235 solution235 = new Solution235();
        TreeNode lcaNode = solution235.lowestCommonAncestor(root, root.left, root.right);
        assertEquals(6, lcaNode.val);
    }

    @Test
    public void lcaOf2And4Is2() {
        Solution235 solution235 = new Solution235();
        TreeNode lcaNode = solution235.lowestCommonAncestor(root, root.left, root.left.right);
        assertEquals(2, lcaNode.val);
    }

    @Test
    public void lcaOf0And5Is2() {
        Solution235 solution235 = new Solution235();
        TreeNode lcaNode = solution235.lowestCommonAncestor(root, root.left.left, root.left.right.right);
        assertEquals(2, lcaNode.val);
    }

    @Test
    public void lcaOf3And5Is4() {
        Solution235 solution235 = new Solution235();
        TreeNode lcaNode = solution235.lowestCommonAncestor(root, root.left.right.left, root.left.right.right);
        assertEquals(4, lcaNode.val);
    }

    @Test
    public void lcaOf3And9Is6() {
        Solution235 solution235 = new Solution235();
        TreeNode lcaNode = solution235.lowestCommonAncestor(root, root.left.right.left, root.right.right);
        assertEquals(6, lcaNode.val);
    }

    @Before
    public void setup() {
        root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
    }
}
