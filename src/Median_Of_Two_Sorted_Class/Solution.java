package Median_Of_Two_Sorted_Class;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sum=(nums1.length+nums2.length);
        int x=0,y=0,i=0;
        double median=0;
        int nums3[]=new int[sum];
        while(x<nums1.length||y<nums2.length) {//i定位的是小的那个数
            if(x==nums1.length&&y<nums2.length)
                nums3[i++]=nums2[y++];
            else if(y==nums2.length&&x< nums1.length)
                nums3[i++]=nums1[x++];
            else {
                if (nums1[x] <= nums2[y])
                    nums3[i++] = nums1[x++];
                else
                    nums3[i++] = nums2[y++];
            }
            if(((i-1)==sum/2)&&sum%2==1) {
                median = (double) nums3[i - 1];
                break;
            }
            else if(((i-1)==sum/2)&&sum%2==0) {
                median = ((double) nums3[i - 1] + (double) nums3[i - 2]) / 2;
                break;
            }
            else
                continue;
        }
        return median;
    }
}
