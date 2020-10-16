package Regular_Expression_Matching;

import org.junit.Test;

public class test {
    @Test
    public void test1(){
        Solution solution=new Solution();
//        if(solution.isMatch("mississippi","mis*is*ip*."))
        if(solution.isMatch("aab","c*a*b"))
            System.out.println("匹配");
        else
            System.out.println("不匹配");
    }
}
