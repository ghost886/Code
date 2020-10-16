package Longest_Palindromic_Substring;

import java.util.Arrays;

/*
思路
遍历所有的节点为中心节点,思路错误一半
 */
//        char str1[]=s.split("|");   split()和toCharArray()是有区别的
//        char str1[]=java.util.Arrays.copyOf(str,1);
//        copyOf和copyOfRange则是创建了一个全新的数组
//        System.arraycopy(,,,)并没有创造一个全新的数组
class Solution {
    public String longestPalindrome(String s) {
        char str[]=s.toCharArray();
        int len=s.length(),longest=1,left=0,right=0;
        String p_str;
        char str1[]=new char[2*len+1];
        int t=0;
        while(t<len){
            str1[2*t]='-';
            str1[2*t+1]=str[t];
            t++;
        }
        str1[2*len]='-';

        for (int i = 0; i <(2*len+1) ; i++) {
            int j=0;
            while ((i - j >= 0) && (i + j < (2*len+1))) {
                if(str1[i-j]!=str1[i+j])
                    break;
                j++;
            }
            j--;
            if((j*2+1)>=longest){//小失误
                left=i-j;
                right=i+j;
                longest=j*2+1;
            }
        }
        char str2[]=java.util.Arrays.copyOfRange(str1,left,right+1);
        p_str=new String(str2);
        p_str=p_str.replaceAll("-","");
        return p_str;
    }
}

