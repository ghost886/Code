package Max_SubArray;

import org.junit.Test;

public class test {
    @Test
    public void Test(){
        int nums[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
//        int nums[]=new int[]{0};
        Solution1 solution=new Solution1();
        System.out.println(solution.maxSubArray(nums));
    }
}
