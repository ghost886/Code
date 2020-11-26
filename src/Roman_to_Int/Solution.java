package Roman_to_Int;

import java.util.HashMap;
import java.util.Map;
//可以使用switch来提高效率，减少时间和空间
public class Solution {
    public int romanToInt(String s) {
        char[] chars=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int before=0;
        int res=0;
        for (int i = s.length()-1; i >=0 ; i--) {
            int now=map.get(chars[i]);
            if(now>=before)
                res+=now;
            else
                res-=now;
            before=now;
        }
        return res;
    }
}