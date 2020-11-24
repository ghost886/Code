package Find_All_Anagrams_in_a_String;

import org.junit.Test;

import java.util.List;

public class test {
    @Test
    public void test(){
        Solution solution =new Solution();
        List<Integer> list=solution.findAnagrams("cbaebabacd","abc");
    }
}
