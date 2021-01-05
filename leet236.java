

public class leet236 {
    TreeNode ans;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null) {
            return null;
        }
        helper(p, q, root);
        return ans;
        
    }
    public boolean helper(TreeNode p, TreeNode q, TreeNode curNode) {
        if (curNode==null) {
            return false;
        }
        boolean leftHas = helper(p, q, curNode.left);
        boolean rightHas = helper(p, q, curNode.right);
        if ((leftHas&&rightHas)||(leftHas||rightHas)&&(curNode.val==p.val||curNode.val==q.val)) {
            ans = curNode;
        }
        return leftHas||rightHas||curNode.val==p.val||curNode.val==q.val;
    }
}
