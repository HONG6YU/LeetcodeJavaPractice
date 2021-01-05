

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class leet95 {
    List<TreeNode> ans = new ArrayList<>();

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return ans;
        }
        return helper(1, n);
    }

    public List<TreeNode> helper(int start, int end) {
        List<TreeNode> allTrees = new LinkedList<>();
        if (start > end) {
            allTrees.add(null);
            return allTrees;
        }
        for (int i = start; i < end + 1; i++) {
            List<TreeNode> leftTree = helper(start, i - 1);
            List<TreeNode> rightTree = helper(i + 1, end);
            for (TreeNode treeNode : leftTree) {
                for (TreeNode treeNode2 : rightTree) {
                    TreeNode root = new TreeNode(i, treeNode, treeNode2);
                    allTrees.add(root);
                }
            }
        }
        return allTrees;
    }
}
