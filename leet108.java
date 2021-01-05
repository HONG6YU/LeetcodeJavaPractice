package leetcode;

public class leet108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length==0) {
            return null;
        }
        TreeNode root = helper(nums, 0, nums.length-1);
        return root;
    }
    public TreeNode helper(int[] nums, int start, int end) {
        if (start>end) {
            return null;
        }
        int mid = (start+end)/2;
        TreeNode cur = new TreeNode(nums[mid]);
        cur.left = helper(nums, start, mid-1);
        cur.right = helper(nums, mid+1, end);
        return cur;
    }
}
