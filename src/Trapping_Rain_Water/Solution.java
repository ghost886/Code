package Trapping_Rain_Water;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Solution {
    public int trap(int[] height){
        int capacity=0;
        int l_max[]=new int[height.length];
        int r_max[]=new int[height.length];
        int max_height=0;
        for (int i = 0; i <height.length ; i++) {
            l_max[i]=max_height;
            if(max_height<height[i])
                max_height=height[i];
        }
        max_height=0;
        for (int i = height.length-1; i >=0 ; i--) {
            r_max[i]=max_height;
            if(max_height<height[i])
                max_height=height[i];
        }
        for (int i = 0; i < height.length; i++) {
            int height1=min(l_max[i],r_max[i]);
            capacity+=max(height1-height[i],0);
        }
        return capacity;
    }
}

