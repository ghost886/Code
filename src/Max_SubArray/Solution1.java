package Max_SubArray;

public class Solution1 {
    //这种思想是把当前的那个数字作为主体
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num:nums){
            if (sum>0)
                sum+=num;
            else
                sum=num;
            res=Math.max(res,sum);
        }
        return res;
    }
}