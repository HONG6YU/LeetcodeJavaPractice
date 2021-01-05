
import java.util.ArrayList;

public class leet98 {
    public boolean isValidBST(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList<>();
        inOrder(root, list);
        for (TreeNode treeNode : list) {
            System.out.println(treeNode.val);
        }
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1).val >= list.get(i).val) {
                return false;
            }
        }
        return true;
    }

    public void inOrder(TreeNode node, ArrayList<TreeNode> list) {
        if (node == null) {
            return;
        }
        inOrder(node.left, list);
        list.add(node);
        inOrder(node.right, list);
    }

}
