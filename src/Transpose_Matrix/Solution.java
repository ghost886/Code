package Transpose_Matrix;

public class Solution {
    //二维数组本质上是一维数组，行数=数组名.length,列数=数组名[0].length;
    public int[][] transpose(int[][] A){
        int [][]B=new int [A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                B[j][i]=A[i][j];
            }
        }
        return B;
    }
}
