package minimum_ASCII;

class Solution {
    int memo[][];
    public int minimumDeleteSum(String s1, String s2) {
        char[] s1_char=s1.toCharArray();
        char[] s2_char=s2.toCharArray();
        int sum=0;
        memo=new int[s1_char.length][s2_char.length];
        for (int i = 0; i <s1_char.length ; i++) {
            for (int j = 0; j < s2_char.length; j++) {
                memo[i][j]=-1;
            }
        }
        for (int i = 0; i < s1_char.length; i++) {
            sum+=Integer.valueOf(s1_char[i]);
        }
        for (int i = 0; i < s2_char.length; i++) {
            sum+=Integer.valueOf(s2_char[i]);
        }
        return sum-2*dp(s1_char,0,s2_char,0);
    }
    public int dp(char[] s1,int l1,char[] s2, int l2){
        if(l1>=s1.length||l2>=s2.length)
            return 0;
        if(memo[l1][l2]!=-1)
            return memo[l1][l2];
        else {
            if (s1[l1] == s2[l2]){
                memo[l1][l2]=Integer.valueOf(s1[l1]) + dp(s1, l1 + 1, s2, l2 + 1);
                return memo[l1][l2];
            }

            else{
                memo[l1][l2]=Math.max(dp(s1,l1+1,s2,l2),dp(s1,l1,s2,l2+1));
                return memo[l1][l2];
            }
        }
    }
}