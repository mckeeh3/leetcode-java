package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return all root-to-leaf paths.
 *
 * @see <a href="https://leetcode.com/problems/binary-tree-paths/">257. Binary Tree Paths</a>
 */
public class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();

        if (root != null) {
            if (root.left == null && root.right == null) {
                paths.add("" + root.val);
            }
            if (root.left != null) {
                paths.addAll(followPath("" + root.val, root.left));
            }
            if (root.right != null) {
                paths.addAll(followPath("" + root.val, root.right));
            }
        }

        return paths;
    }

    private List<String> followPath(String parentPath, TreeNode treeNode) {
        List<String> path = new ArrayList<>();
        if (treeNode != null) {
            if (treeNode.left == null && treeNode.right == null) {
                path.add(parentPath + "->" + treeNode.val);
            } else {
                if (treeNode.left != null) {
                    path.addAll(followPath(parentPath + "->" + treeNode.val, treeNode.left));
                }
                if (treeNode.right != null) {
                    path.addAll(followPath(parentPath + "->" + treeNode.val, treeNode.right));
                }
            }
        }

        return path;
    }
}
