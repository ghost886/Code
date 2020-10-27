package Transpose_Matrix;

import org.junit.Test;

public class test {
    @Test
    public void Teat(){
        Solution solution=new Solution();
//        int a[][]=solution.transpose(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        int a[][]=solution.transpose(new int[][]{{1},{4}});
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[0].length ; j++) {
                System.out.printf(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
