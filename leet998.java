

public class leet998 {
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if (root.val<val) {
            TreeNode cur = new TreeNode(val,root,null);
            return cur;
        }
        helper(root, val);
        return root;
    }    

    public void helper(TreeNode root, int val) {
        if (val<root.val) {
            if (root.left==null) {
                root.left = new TreeNode(val);
                return;
            }
            if (root.right == null) {
                root.right = new TreeNode(val);
                return;
            }
            if (val<root.left.val) {
                helper(root.left, val);
                return;
            }
            if (val<root.right.val) {
                helper(root.right, val);
                return;
            }
        }
    }
}
