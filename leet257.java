
import java.util.ArrayList;
import java.util.List;

public class leet257 {
    List<String> ans = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        helper(root, "");
        return ans;
    }

    public void helper(TreeNode root, String cur) {
        if (root==null) {
            return;
        }
        if (root.left==null&&root.right==null) {
            cur += root.val + "";
            ans.add(cur);
            return;
        }
        cur += root.val + "->";
        helper(root.left, cur);
        helper(root.right, cur);
    }
}
