

public class leet124 {
    public int MAX = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        helper(root);
        return MAX;
    }

    public int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMax = Math.max(helper(root.left), 0);
        int rightMax = Math.max(helper(root.right), 0);
        int max = root.val + leftMax + rightMax;
        MAX = Math.max(max, MAX);
        return root.val + Math.max(leftMax, rightMax);
    }
}
