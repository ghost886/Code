package Remove_Nth_Node_From_End_of_List;

import org.junit.Test;

public class test {
    @Test
    public void test(){
        Solution solution=new Solution();
        ListNode node2=new ListNode(2);
        ListNode node1=new ListNode(1,node2);
        ListNode head=new ListNode(0,node1);
        ListNode node=solution.removeNthFromEnd(head,1);
        System.out.println("结束了");
    }
}
