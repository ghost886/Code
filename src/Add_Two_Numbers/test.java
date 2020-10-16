package Add_Two_Numbers;

import org.junit.Test;

public class test {
    @Test
    public void test_Add_Two_Numbers(){
//        ListNode listNode3=new ListNode(3);
//        ListNode listNode2=new ListNode(4,listNode3);
//        ListNode listNode1=new ListNode(2,listNode2);
//
//        ListNode listNodec=new ListNode(4);
//        ListNode listNodeb=new ListNode(6,listNodec);
//        ListNode listNodea=new ListNode(5,listNodeb);

//        ListNode listNode1=new ListNode(0);
//        ListNode listNodea=new ListNode(0);

//        ListNode listNode1=new ListNode(9);
//        for (int i = 0; i <6 ; i++) {
//            listNode1=new ListNode(9,listNode1);
//        }
//        ListNode listNodea=new ListNode(9);
//        for (int i = 0; i <3 ; i++) {
//            listNodea=new ListNode(9,listNodea);
//        }

//        ListNode listNode2=new ListNode(8);
//        ListNode listNode1=new ListNode(1,listNode2);
//        ListNode listNodea=new ListNode(0);

//        ListNode listNode1=new ListNode(0);
//        ListNode listNodeb=new ListNode(3);
//        ListNode listNodea=new ListNode(7,listNodeb);

        ListNode listNode2=new ListNode(6);
        ListNode listNode1=new ListNode(8,listNode2);

        ListNode listNodec=new ListNode(8);
        ListNode listNodeb=new ListNode(4,listNodec);
        ListNode listNodea=new ListNode(6,listNodeb);
        Add_Two_Numbers addTwoNumbers=new Add_Two_Numbers();
        ListNode listNode=addTwoNumbers.addTwoNumbers(listNode1,listNodea);
        while(listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }
}
