package Delete_Operation_for_Two_Strings;

public class Solution {
    int memo[][];
    public int minDistance(String word1,String word2){
        memo=new int[word1.length()][word2.length()];
        for (int i = 0; i <word1.length() ; i++) {
            for (int j = 0; j < word2.length(); j++) {
                memo[i][j]=-1;
            }
        }
        char []w1=word1.toCharArray();
        char []w2=word2.toCharArray();
        return w1.length+w2.length-2*dp(w1,0,w2,0);
    }
    int dp(char[] w1,int l1,char[] w2,int l2){
        if(l1>=w1.length||l2>=w2.length)
            return 0;
        if(memo[l1][l2]!=-1)
            return memo[l1][l2];
        else{
            if(w1[l1]==w2[l2]){
                memo[l1][l2]=1+dp(w1,l1+1,w2,l2+1);
                return memo[l1][l2];
            }
            else{
                memo[l1][l2]=Math.max(dp(w1,l1+1,w2,l2),dp(w1,l1,w2,l2+1));
                return memo[l1][l2];
            }
        }
    }
}
