package Median_Of_Two_Sorted_Class;

import org.junit.Test;

import java.awt.*;

public class test {
    @Test
    public void test_Soultion(){
        int nums1[]={5,7,10,34},nums2[]={2,6,8,10};
        Solution solution=new Solution();
        System.out.println(solution.findMedianSortedArrays(nums1, nums2));
    }
}
