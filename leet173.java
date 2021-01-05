package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class leet173 {
    Queue<TreeNode> list = new LinkedList<>();
    public leet173(TreeNode root) {
        helper(root);
    }
    public void helper(TreeNode root) {
        if (root==null) {
            return;
        }
        helper(root.left);
        list.add(root);
        helper(root.right);
    }
    
    public int next() {
        TreeNode curNode = list.poll();
        return curNode.val;
    }
    
    public boolean hasNext() {
        if (list.isEmpty()) {
            return false;
        }
        return true;
    }
}
