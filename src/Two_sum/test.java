package Two_sum;

import Add_Two_Numbers.ListNode;
import Two_sum.Two_sum;
import org.junit.Test;

public class test {
    @Test
    public void test_Two_sum(){
        int[] nums = {3,3};
        int target = 6;
        Two_sum twoSum=new Two_sum();
        int[] b=twoSum.twoSum(nums,target);
        System.out.println(b[0]+","+b[1]);
    }
}
