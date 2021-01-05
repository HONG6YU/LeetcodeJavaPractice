
public class leet198 {
    public int rob(int[] nums) {
        int length = nums.length;
        //特殊情况
        if (nums==null||length==0) {
            return 0;
        }
        if (length==1) {
            return nums[0];
        }
        //初始化，dp用于记录到第i个位置的sum
        int[] dp = new int[length];
        //第一个时，sum就是第一个的值
        dp[0] = nums[0];
        //第二个时，sum是第一和第二的最大值
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            //动态规划方程
            //考虑是否要包含第i个值，取包含和不包含两种情况的最大值
            dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);
        }
        return dp[length-1];
    }
}
