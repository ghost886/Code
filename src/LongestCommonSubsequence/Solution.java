package LongestCommonSubsequence;

class Solution {
    int memo[][];
    public int longestCommonSubsequence(String text1, String text2) {
        memo=new int[text1.length()][text2.length()];
        for (int i = 0; i < text1.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                memo[i][j]=-1;
            }
        }
        return dp(text1,0,text2,0);
    }
    int dp(String s1,int l1,String s2,int l2){
        if(l1>=s1.length()||l2>=s2.length())
            return 0;
        if(memo[l1][l2]!=-1)
            return memo[l1][l2];
        if(s1.charAt(l1)==s2.charAt(l2)) {
            memo[l1][l2]=1 + dp(s1, l1 + 1, s2, l2 + 1);
            return memo[l1][l2];
        }
        else
        {
            memo[l1][l2]=Math.max(dp(s1,l1+1,s2,l2),dp(s1,l1,s2,l2+1));
            return memo[l1][l2];
        }
    }
}
