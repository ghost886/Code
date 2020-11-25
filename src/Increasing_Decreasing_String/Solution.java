package Increasing_Decreasing_String;

import java.util.Arrays;

public class Solution {
    public String sortString(String s) {
        boolean book[]=new boolean[s.length()];
        int valid=s.length();
        char[] chars=s.toCharArray();
        String res="";
        Arrays.sort(chars);
        while(valid>0){
            char a='\0';
            for (int i = 0; i < s.length(); i++) {
                if(!book[i]&&chars[i]>a) {
                    book[i]=true;
                    valid--;
                    a=chars[i];
                    res = res + chars[i];
                }
            }
            int b=chars[s.length()-1]+1;
            for (int i = s.length()-1; i >=0; i--) {
                if(!book[i]&&chars[i]<b) {
                    book[i]=true;
                    valid--;
                    b=chars[i];
                    res = res + chars[i];
                }
            }
        }
        return res;
    }

}
