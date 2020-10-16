package Ones_and_Zeros;

import org.junit.Test;

public class test {
    @Test
    public void test1(){
        String strs[]={"10","0001","111001","1","0"};
        Solution solution=new Solution();
        System.out.println( solution.findMaxForm(strs,5,3));
    }
}
