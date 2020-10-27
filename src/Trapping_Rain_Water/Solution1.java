package Trapping_Rain_Water;

public class Solution1 {
    public int trap(int []height){
        int capacity=0;
        int left=0,right=height.length-1;
        int l_max=0,r_max=0;
        while(left<=right){
            l_max=Math.max(l_max,height[left]);
            r_max=Math.max(r_max,height[right]);
            if(l_max<r_max){
                capacity+=l_max-height[left];
                left++;
            }else{
                capacity+=r_max-height[right];
                right--;
            }
        }
        return capacity;
    }
}
