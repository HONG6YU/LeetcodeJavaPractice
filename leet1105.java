

import java.util.HashMap;

public class leet1105 {
    private HashMap<Integer, Integer> map;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int length = preorder.length;
        this.map = new HashMap<Integer, Integer>();
        for (int i = 0; i < length; i++) {
            map.put(Integer.valueOf(inorder[i]), i);
        }
        return helper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode helper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        // base case
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int rootIndex = map.get(root.val);
        int leftSize = rootIndex - inStart;
        root.left = helper(preorder, preStart + 1, preStart + leftSize, inorder, inStart, rootIndex - 1);
        root.right = helper(preorder, preStart + leftSize + 1, preEnd, inorder, rootIndex + 1, inEnd);
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = { 3, 9, 20, 15, 7 };
        int[] inorder = { 9, 3, 15, 20, 7 };
        leet1105 test = new leet1105();
        TreeNode ans = test.buildTree(preorder, inorder);
        System.out.print(ans.val);
    }
}
