package Ones_and_Zeros;

public class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int ans=0;
        int len=strs.length;
        int number_0[]=new int[strs.length];
        int number_1[]=new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            number_0[i] = findNumber(strs[i]);
            number_1[i]=strs[i].length()-number_0[i];
        }
        //另外一种思路的计数方式也很好

        /*
        i表示遍历第几个字符串
        j表示还剩0的个数
        k表示还剩1的个数
         */
        int dp[][][]=new int[len+1][m+1][n+1];

        for (int i = 1; i <=len; i++) {
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k <= n; k++) {
                    dp[i][j][k]=dp[i-1][j][k];
                    if (j>=number_0[i-1]&&k>=number_1[i-1]&&(dp[i][j][k]<(dp[i-1][j-number_0[i-1]][k-number_1[i-1]]+1))){
                        dp[i][j][k]=dp[i-1][j-number_0[i-1]][k-number_1[i-1]]+1;
                    }
                }
            }
        }
        return dp[len][m][n];
    }
    //找出每个字符串里面有多少个0
    public int findNumber(String str){
        int ans=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='0')
                ans++;
        }
        return ans;
    }

}
