package leetcode;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
    }

    public void add(TreeNode root) {
        if (root==null) {
            return;
        }
        if (this.val<root.val) {
            if (root.left==null) {
                root.left = this;
                return;
            }
            add(root.left);
        }
        if (this.val>root.val) {
            if (root.right==null) {
                root.right = this;
                return;
            }
            add(root.right);
        }
    }
}