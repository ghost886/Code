package Palindrome_Number;

public class Solution {
    public boolean isPalindrome(int x){
        int y=x;
        int z=0;
        if(x>=0){
            while(x>=10){
                z+=x%10;
                z=z*10;
                x/=10;
            }
            z=z+x;
//            if(z==y)
//                return true;
            return z==y;//牛皮
        }
        return false;
    }
}
