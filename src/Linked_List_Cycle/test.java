package Linked_List_Cycle;

import org.junit.Test;

public class test {
    @Test
    public void test(){
        Solution solution =new Solution();
        ListNode node0=new ListNode(0);
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        ListNode node5=new ListNode(5);
        node0.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node1;
        System.out.println(solution.hasCycle(node0));
    }
}
