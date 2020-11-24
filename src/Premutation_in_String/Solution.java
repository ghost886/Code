package Premutation_in_String;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean checkInclusion(String s1,String s2){//permutation 排列
        //思路也是滑动窗口检测，和上一个76T不同的是子串不包括额外的
        int left=0;
        int right=0;
        int valid=0;
        char[] c_s1=s1.toCharArray();
        char[] c_s2=s2.toCharArray();

        Map<Character,Integer> need=new HashMap<>();
        Map<Character,Integer> window=new HashMap<>();

        //初始化
        for (int i = 0; i < s1.length(); i++)
            need.put(c_s1[i],need.getOrDefault(c_s1[i],0)+1);

        while(right<s2.length()){
            window.put(c_s2[right],window.getOrDefault(c_s2[right],0)+1);
//            if(window.get(c_s2[right]).intValue()==(need.get(c_s2[right])).intValue())//这样会有一个空指针异常
            if(window.get(c_s2[right]).intValue()==(need.getOrDefault(c_s2[right],0)).intValue())
                valid++;

            while(left<=right&&window.get(c_s2[left])>need.getOrDefault(c_s2[left],0)){
                window.put(c_s2[left],window.get(c_s2[left])-1);
                left++;
            }
            if(valid==need.size()&&right-left+1==s1.length())
                return true;
            right++;
        }
        return false;
    }
}
