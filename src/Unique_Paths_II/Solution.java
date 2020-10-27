package Unique_Paths_II;

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length,n=obstacleGrid[0].length;
        int res=0;
        int paths[][]=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(obstacleGrid[i][j]==1)
                    paths[i][j]=0;
                else{
                    if(i-1>=0&&j-1>=0)
                        paths[i][j]=paths[i-1][j]+paths[i][j-1];
                    else if(i-1>=0&&j-1<0)
                        paths[i][j]=paths[i-1][j];
                    else if(i-1<0&&j-1>=0)
                        paths[i][j]=paths[i][j-1];
                    else
                        paths[i][j]=1;
                }
            }
        }
        return paths[m-1][n-1];
    }
}
