package Minimum_Window_Substring;

import org.junit.Test;

public class test {
    @Test
    public void test(){
        String s="ADOBECODEBANC";
        String t="ABC";
//        System.out.println(s.substring(2,2));
        Solution solution=new Solution();
        String a=solution.minWindow(s,t);
        System.out.println(a);
    }
}
