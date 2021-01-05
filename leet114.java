package leetcode;

public class leet114 {
    public void flatten(TreeNode root) {
        if (root==null) {
            return;
        }
        TreeNode pre = predecessNode(root.left);
        if (pre!=null) {
            pre.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        flatten(root.right);
    }
    public TreeNode predecessNode(TreeNode root) {
        if (root==null) {
            return null;
        }
        if (root.right!=null) {
            return predecessNode(root.right);
        }
        return root;
    }

}
