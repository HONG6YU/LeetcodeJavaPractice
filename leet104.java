package leetcode;

public class leet104 {
    public int maxDepth(TreeNode root) {
        int maxLeft = 0;
        int maxRight = 0;
        int max = -1;
        if (root==null) {
            return 0;
        }
        if (root.left!=null) {
            maxLeft = maxDepth(root.left);
        }
        if (root.right!=null) {
            maxRight = maxDepth(root.right);
        }
        max = Math.max(maxLeft, maxRight);
        return 1+ max;
    }
}
