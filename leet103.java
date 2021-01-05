package leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leet103 {
    List<List<Integer>> ans = new ArrayList<>();
    Queue<TreeNode> q = new LinkedList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return ans;
        }
        q.add(root);
        boolean dir = false;
        while (!q.isEmpty()) {
            Deque<Integer> level = new LinkedList<>();
            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode curTreeNode = q.poll();
                if (dir) {
                    level.addFirst(curTreeNode.val);
                } else {
                    level.addLast(curTreeNode.val);
                }
                if (curTreeNode.left != null) {
                    q.add(curTreeNode.left);
                    
                }
                if (curTreeNode.right != null) {
                    q.add(curTreeNode.right);
                }

            }
            ans.add(new LinkedList<Integer>(level));
            dir = dir == true ? false : true;
        }
        return ans;
    }
}
