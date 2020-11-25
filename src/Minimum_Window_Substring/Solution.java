package Minimum_Window_Substring;

import java.util.HashMap;
import java.util.Map;

//        String s="ADOBECODEBANC";
//        String t="ABC";
public class Solution {
    public String minWindow(String s,String t){
        //利用滑动窗口算法进行计算，可以使得时间复杂度为O(N)
        int left=0;
        int right=0;
        int valid=0;
        char[] s1=s.toCharArray();
        int r=s.length()-1;
        int l=0;
        Map<Character, Integer> need=new HashMap();//回头看看这俩区别是啥？
        Map<Character, Integer> windows=new HashMap<>();
        for(char c:t.toCharArray())//另一种方法是charat()
            need.put(c,need.getOrDefault(c,0)+1);//这两步是初始化需要的数组
        //这个for循环找出的字符串尽可能的包含t里面的字符
//        while(right<s.length()){
        for(int i=0;i<10400;i++){
            windows.put(s1[right],windows.getOrDefault(s1[right],0)+1);

            //判断是否符合条件
//            if(s1[right]=='k'&&windows.get(s1[right]).equals(need.getOrDefault(s1[right],0)));
//                System.out.println(s1[right]+"  "+windows.get(s1[right])+"    "+need.getOrDefault(s1[right],0));
            if(windows.get(s1[right]).equals(need.getOrDefault(s1[right],0)))//这里选用等于号是为了避免重复相加
                valid++;

            while(left<=right&&windows.get(s1[left])>need.getOrDefault(s1[left],0)){//一定要注意越界的问题
                windows.put(s1[left],windows.get(s1[left])-1);
                //判断是否符合条件
                left++;//缩小窗口
            }

            if(valid==need.size()){
                if(right-left<r-l){
                    r=right;
                    l=left;
                }
            }
            //right++放在这里可以省好多事
            right++;//扩大窗口,另外这一步也会对下面截取字符串产生影响
        }

        if(valid==need.size())
            return s.substring(l,r+1);
        return "";
    }
}
