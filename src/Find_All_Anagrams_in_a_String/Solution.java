package Find_All_Anagrams_in_a_String;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    //使用数组代替hashmap可以节省空间和时间
    public List<Integer> findAnagrams(String s, String p) {
        char[] s_char=s.toCharArray();
        char[] p_char=p.toCharArray();
        int []need=new int[26];//利用数组存储
        int []window=new int[26];
        int left=0;
        int right=0;
        int valid=0;

        int need_szie=0;
        List<Integer> list=new LinkedList<>();
        for (int i = 0; i < p_char.length; i++) {
            if(need[p_char[i] - 'a']==0)
                need_szie++;
            need[p_char[i] - 'a']++;
        }
        while(right<s_char.length){
            window[s_char[right]-'a']++;
            if(window[s_char[right]-'a']==need[s_char[right]-'a'])
                valid++;
            while(left<=right&&window[s_char[left]-'a']>need[s_char[left]-'a']){
                window[s_char[left]-'a']--;
                left++;
            }
            if(valid==need_szie&&right-left+1==p_char.length)
                list.add(left);
            right++;
        }


        return list;
    }
}
