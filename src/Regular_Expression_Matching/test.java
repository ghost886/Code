package Regular_Expression_Matching;

import org.junit.Test;

public class test {
    @Test
    public void test1(){
        Solution solution=new Solution();
//        if(solution.isMatch("abcdefg","abcdefggggg"))
//        if(solution.isMatch("aab","c*a*b"))
//        if(solution.isMatch("ab","a*"))
        if(solution.isMatch("a","ab*a"))
            System.out.println("匹配");
        else
            System.out.println("不匹配");
    }
}
