package leetcode;

public class leet112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        boolean ans = false;
        if (root==null) {
            return false;
        }
        if (root.val==sum&&root.left==null&&root.right==null) {
            return true;
        }
        if (root.left!=null) {
            ans = hasPathSum(root.left, sum-root.val);
        }
        if (ans) {
            return true;
        }
        if (root.right!=null) {
            ans =  hasPathSum(root.right, sum-root.val);
        }
        return ans;
    }
    
}
