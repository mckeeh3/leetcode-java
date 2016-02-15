package solutions;

/**
 * For Solution257.
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return String.format("%s[%d]", getClass().getSimpleName(), val);
    }
}
