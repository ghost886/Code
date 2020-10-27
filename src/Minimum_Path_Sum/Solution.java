package Minimum_Path_Sum;

public class Solution {
    public int minPathSum(int[][] grid ){
        int paths[][]=new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length ; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(i-1>=0&&j-1>=0)
                    paths[i][j]+=Math.min(paths[i][j-1],paths[i-1][j]);
                else if(i-1>=0&&j-1<0)
                    paths[i][j]+=paths[i-1][j];
                else if(i-1<0&&j-1>=0)
                    paths[i][j]+=paths[i][j-1];
                else
                    paths[i][j]=0;
                paths[i][j]+=grid[i][j];
            }
        }
        return paths[grid.length-1][grid[0].length-1];
    }
}
