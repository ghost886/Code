package Longest_Palindromic_Substring;

import org.junit.Test;

public class test {
    @Test
    public void test1(){
        Solution2 solution=new Solution2();
        String s=solution.longestPalindrome("a");
        System.out.println(s);

//        String s="1234567890xyz";
//        char cr[]=s.toCharArray();
//        char tr[]=java.util.Arrays.copyOfRange(cr,4,7);
//        System.out.println(tr);

    }
}
