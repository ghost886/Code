package Minimum_Path_Sum;

import org.junit.Test;

public class test {
    @Test
    public void test(){
        Solution solution=new Solution();
        int u=solution.minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}});
        System.out.println(u);
    }
}
