package Move_Zeros;

import org.junit.Test;

public class test {
    @Test
    public void test(){
        Solution solution=new Solution();
        int nums[]={0,1,0,3,12};
        solution.moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
