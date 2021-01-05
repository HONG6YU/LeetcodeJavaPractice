package leetcode;

public class leet53 {
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int ans = Integer.MIN_VALUE;
        for (int i : nums) {
            if (pre<0) {
                pre = i;
            }else{
                pre += + i;
            }
            ans = Math.max(ans, pre);
        }
        return ans;
    }
}
