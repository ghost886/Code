package Trapping_Rain_Water;

import org.junit.Test;

public class test {
    @Test
    public void test(){
        int  height[]=new int[]{4};
//        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
//        int height[]={4,2,0,3,2,5};
//        int height[]={1};
        Solution1 solution=new Solution1();
        System.out.println(solution.trap(height));
    }
}
