package Longest_Palindromic_Substring;
class Solution1 {
    public String longestPalindrome(String s) {
        char s_char[]=s.toCharArray();
        int len=s.length();
        int left=0,right=0;
        int dp[][]=new int[len][len];
        dp[len-1][len-1]=1;
        //初始化
        for (int i = 0; i < len-1; i++) {
            dp[i][i]=1;
            if(s_char[i]==s_char[i+1])
                dp[i][i+1]=1;
            else
                dp[i][i+1]=-1;
        }
        //递归函数
        for (int i = 0; i < len; i++) {
            for (int j = i+2; j < len; j++) {
                recursion(i,j,dp,s_char);
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if(dp[i][j]==1){
                    if(left-right<j-i){
                        right=i;
                        left=j;
                    }
                }
            }
        }
        return s.substring(right,left+1);
    }
    public int recursion(int i,int j,int [][]dp,char []s_char){//要有一个返回值
        if(s_char[i]!=s_char[j])
            dp[i][j]=-1;
        else{
            if(dp[i+1][j-1]==0) {
                dp[i][j]=recursion(i + 1, j - 1, dp, s_char);
            }
            else if(dp[i+1][j-1]==1)
                dp[i][j]=1;
            else
                dp[i][j]=-1;
        }
        return dp[i][j];
    }
}