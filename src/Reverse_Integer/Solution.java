package Reverse_Integer;
import java.util.ArrayList;

public class Solution {
    public int reverse(int x){
        long y=0;
        boolean is_Minus=false;
        if (x<0) {
            is_Minus = true;
            x=-x;
        }
        ArrayList<Integer> integerArrayList=new ArrayList<>();
        while(x>=10){//小细节失误
            integerArrayList.add(x%10);
            x/=10;
        }
        integerArrayList.add(x);
        int list_size=integerArrayList.size();
        for (int i = 0; i<=list_size-1  ; i++) {
            y+=Math.pow(10,list_size-i-1)*integerArrayList.get(i);//这个用法忘记了
        }
        if (is_Minus) y=-y;
        return y==(int)y?(int)y:0;
    }
}
