package Populating_Next_Right_Pointers_in_Each_Node;

import org.junit.Test;

public class test {
    @Test
    public void test(){
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);

        Node b=new Node(2,d,e,null);
        Node c=new Node(3,f,g,null);

        Node a=new Node(1,b,c,null);
        Solution solution=new Solution();
        solution.connect(a);
    }
}
