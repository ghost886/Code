package Unique_Paths;

//思路和爬楼梯有些类似
//a(i,j)=a(i,j-1)+a(i-1,j)
//监护室
public class Solution {
    public int uniquePaths(int m, int n) {
        int Path[][]=new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                Path[i][j]=(j-1>=0&&i-1>=0)?Path[i-1][j]+Path[i][j-1]:1;
        return Path[m-1][n-1];
    }
}
