package Next_Greater_Element_I;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public int[] nextGreaterElement(int[] nums1,int[] nums2){
        if(nums2.length==0)
            return new int[]{};
        else{
            Stack<Integer> stack =new Stack();
            int num1[]=new int [nums1.length];
            Map<Integer,Integer> map=new HashMap<>();
            stack.push(nums2[nums2.length-1]);
            System.out.println(stack.peek());
            map.put(nums2[nums2.length-1],-1);
            for (int i =  nums2.length-2; i >=0 ; i--) {
                while(!stack.isEmpty()&&stack.peek()<nums2[i]){
                    stack.pop();
                }
                if(stack.isEmpty())
                    map.put(nums2[i],-1);
                else
                    map.put(nums2[i],stack.peek());
                stack.push(nums2[i]);
                System.out.println("---------");
                System.out.println(nums2[i]);
                System.out.println(map.get(nums2[i]));
            }
            for (int i = 0; i < nums1.length; i++) {
                num1[i]=map.get(nums1[i]);
            }
            return num1;
        }
    }
}