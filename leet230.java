
public class leet230 {
    int count = 0;
    int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
        if (root==null) {
            return 0;
        }
        helper(root, k);
        return ans;
    }
    public void helper(TreeNode root, int k) {
        if (root==null) {
            return;
        }
        helper(root.left, k);
        count++;
        if (count==k) {
            ans = root.val;
        }
        helper(root.right, k);
    }
}
