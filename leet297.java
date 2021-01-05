package leetcode;

public class leet297 {
        // Encodes a tree to a single string.
        int index = 0;
        int length;
        String[] splited;
        public String serialize(TreeNode root) {
            if (root==null) {
                return "*";
            }
            return root.val + "," + serialize(root.left) +","+ serialize(root.right);
        }
    
        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            length = data.length();
            splited = data.split(",");
            return helper();
        }

        public TreeNode helper() {
            if (splited[index].equals("*")||index>=length) {
                return null;
            }
            TreeNode root = new TreeNode(Integer.parseInt(splited[index]));
            index++;
            root.left = helper();
            index++;
            root.right = helper();
            return root;
        }
}
