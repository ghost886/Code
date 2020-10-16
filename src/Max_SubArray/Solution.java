package Max_SubArray;

public class Solution {
    public int maxSubArray(int[] nums) {
        int dp[][]=new int[nums.length][nums.length];
        for (int i = 0; i <nums.length ; i++) {
            dp[i][i]=nums[i];
        }
        int biggest=nums[0];
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                dp[j][i]=dp[j][i-1]+nums[i];
                if(biggest<dp[j][i]){
                    biggest=dp[j][i];
                }
            }
        }
        return biggest;
    }
}
