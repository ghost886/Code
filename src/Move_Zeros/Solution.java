package Move_Zeros;
//这道题比较简单，但是还是学到了一些东西，对于方法传入参数的修改
//另外，如果leetcode那边出现了cannot find symbol就是检查检查方法名称和官方方法名称有什么不一样
public class Solution {
    public void moveZeroes(int [] nums){
        int nums1[]=new int [nums.length];
        int i=0,j=0;
        while(i<nums.length){
            if(nums[i]!=0)
                nums1[j++]=nums[i];
            i++;
        }
        while(j<nums.length)
            nums1[j++]=0;
        for (int k = 0; k < nums.length; k++) {
            nums[k]=nums1[k];
        }
        //直接赋值（nums=nums1）的话是nums的地址就变成了@816，出了这个方法nums实际上没有变
        //但是一个一个改变值，出了方法，nums实际上也被改变了
    }
}
