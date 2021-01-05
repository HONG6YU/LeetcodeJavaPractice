

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leet199 {
    List<Integer> ans = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            int n = nodes.size();
            for (int i = 0; i < n; i++) {
                TreeNode curNode = nodes.poll();
                if (i == n - 1) {
                    ans.add(curNode.val);
                }
                if (curNode.left != null) {
                    nodes.add(curNode.left);
                }
                if (curNode.right != null) {
                    nodes.add(curNode.right);
                }
            }

        }
        return ans;
    }
}
