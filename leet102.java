package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leet102 {
    private List<List<Integer>> ans = new ArrayList<List<Integer>>();
    Queue<TreeNode> q = new LinkedList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return ans;
        }
        q.add(root);
        while (!q.isEmpty()) {
            List<Integer> current = new ArrayList<>();
            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode currentNode = q.poll();
                current.add(currentNode.val);
                if (currentNode.left != null) {
                    q.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    q.add(currentNode.right);
                }
            }
            ans.add(current);
        }
        return ans;
    }
}
