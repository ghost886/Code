package Longest_Palindromic_Substring;

class Solution2 {
    public String longestPalindrome(String s) {
        int len=s.length();
        String ans="";
        Boolean [][]dp=new Boolean[len][len];
        for (int l = 0; l < len; l++) {
            for (int i = 0; i < len-l; i++) {
                int j=i+l;
                if(l==0)
                    dp[i][j]=true;
                else if (l==1)
                    dp[i][j]= s.charAt(i) == s.charAt(i + 1);//简化
                else
                    dp[i][j]= s.charAt(i) == s.charAt(i + l) && dp[i + 1][j - 1];//简化
                if ((l+1)>ans.length()&&dp[i][j]) {
                    ans = s.substring(i, i + l + 1);
                }
            }
        }
        return ans;
    }
}
