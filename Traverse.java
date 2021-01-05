package leetcode;

import java.util.ArrayList;

class Traverse {
    public static void inOrder(TreeNode node, ArrayList<TreeNode> list) {
        if (node == null) {
            return;
        }
        inOrder(node.left, list);
        list.add(node);
        inOrder(node.right, list);
    }
}