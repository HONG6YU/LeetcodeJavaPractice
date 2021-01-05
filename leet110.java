package leetcode;

public class leet110 {
    public boolean isBalanced(TreeNode root) {
        if (root==null) {
            return true;
        }
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        if (Math.abs(leftMax-rightMax)>1) {
            return false;
        }
        boolean leftAns = isBalanced(root.left);
        boolean rightAns = isBalanced(root.right);
        return leftAns&&rightAns;
    }

    public int maxDepth(TreeNode root) {
        if (root==null) {
            return 0;
        }
        int maxLeft = maxDepth(root.left);
        int maxRight = maxDepth(root.right);
        int max = Math.max(maxLeft, maxRight);
        return 1 + max;
    }
}
