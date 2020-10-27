package Regular_Expression_Matching;

/*
动态规划的精髓是用数组表示出一个含义，对i,j赋予含义
这道题的思路并不仅仅是记录正确的，还要记录错误的
*号可以表示0次，.不能表示0次
 */
//这个代码是错误的，不可用，完全没思路
public class Solution {
    public boolean isMatch(String s ,String p){
        if(p.charAt(0)=='*')
            return false;
        Boolean dp[][]=new Boolean[s.length()+1][p.length()+1];
        //初始化,字符串长短也是靠这个来解决
        for (int i = 1; i < s.length()+1; i++)
            dp[i][0]=false;
        for (int i = 1; i < p.length()+1; i++)
            dp[0][i]=true;
        dp[0][0]=true;
        //状态转移
        for (int i = 1; i <= s.length(); i++) {
            int len[]=new int[p.length()];
            len[0]=1;
            for (int j = 1; j <= p.length(); j++) {
                if (p.charAt(j-1)=='*') { //*是0还是非0，这本身就是两种情况//
                    System.out.println(s.charAt(i-1)+"  "+ p.charAt(j - 2));
                    dp[i][j] = Match(s.charAt(i-1), p.charAt(j - 2)) ? dp[i - 1][j] : dp[i][j - 2];
//                    if(Match(s.charAt(i-1), p.charAt(j - 2))){
//                        dp[i][j]=dp[i - 1][j];
//                    }
//                    else{
//                        dp[i][j]=dp[i][j - 2];
//                    }
                }
                else
//                    dp[i][j]=dp[i-1][j-1]&&Match(s.charAt(i-1),p.charAt(j-1))&&(!(i-1==0&&j-1==1))&&(!(i-1==1&&j-1==0));//字符串s偏长
                    dp[i][j]=dp[i-1][j-1]&&Match(s.charAt(i-1),p.charAt(j-1))&&(!(i-1==0&&j-1==1))&&(!(i-1==1&&j-1==0));
                System.out.println(i+"  "+j+"  "+dp[i][j]);
            }
        }
        return dp[s.length()][p.length()];
    }
    public boolean Match(char a,char b) {
        return a==b||b=='.';
    }
}
