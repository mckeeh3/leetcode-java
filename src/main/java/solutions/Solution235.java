package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
 *
 * @see
 * <a href="https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/">235. Lowest Common Ancestor of a Binary Search Tree</a>
 */
public class Solution235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root != null && p != null && q != null) {
            List<TreeNode> pPath = findPath(root, p);
            List<TreeNode> qPath = findPath(root, q);

            return findLca(root, pPath, qPath);
        } else {
            return null;
        }
    }

    private List<TreeNode> findPath(TreeNode root, TreeNode node) {
        List<TreeNode> path = new ArrayList<>();
        findPath(path, root, node);
        return path;
    }

    private void findPath(List<TreeNode> path, TreeNode root, TreeNode node) {
        path.add(root);
        if (root.val != node.val) {
            if (root.val > node.val) {
                findPath(path, root.left, node);
            } else {
                findPath(path, root.right, node);
            }
        }
    }

    private TreeNode findLca(TreeNode lca, List<TreeNode> pPath, List<TreeNode> qPath) {
        if (pPath.size() > 0 && qPath.size() > 0) {
            if (pPath.contains(qPath.get(0))) {
                lca = qPath.get(0);
                pPath.remove(pPath.indexOf(qPath.get(0)));
                qPath.remove(0);
                lca = findLca(lca, pPath, qPath);
            }
        }
        return lca;
    }
}
