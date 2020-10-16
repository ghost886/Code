package LengthOfLongestSubString;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int max=0;
        char a;
//        if(s!="")
//            a=s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            a=s.charAt(i);
            for (int j = start; j <i ; j++) {
                if(a==s.charAt(j))
                    start=j+1;
            }
            if (max<(i-start+1))
                max=i-start+1;
//            System.out.println("start:"+start+", i:"+i+" , max:"+max+" , "+s.charAt(i));
        }
        return max;
    }
}
