
import java.util.Arrays;

public class leet213 {
    public int rob(int[] nums) {
        int length = nums.length;
        if (nums==null||length == 0) {
            return 0;
        }
        if (length == 1) {
            return nums[0];
        }
        return Math.max(myRob(Arrays.copyOfRange(nums, 0, length-1)), myRob(Arrays.copyOfRange(nums, 1, length)));
    }
    public int myRob(int[] nums) {
        int pre = 0, cur = 0, next;
        for(int num : nums) {
            next = cur;
            cur = Math.max(pre + num, cur);
            pre = next;
        }
        return cur;
    }
}
