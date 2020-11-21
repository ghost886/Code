package Remove_Nth_Node_From_End_of_List;
//利用快慢节点找出整个链表有多少；
//利用快慢节点找出整个链表有多少；
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head;
        ListNode fast=head;
        int count=0;
        while(fast!=null&&fast.next!=null){
            count++;
            slow=slow.next;
            fast=fast.next.next;
        }
        slow=head;//这里赋予了slow以head的头，那么此时对于slow的操作就是对于head的操作
        if(fast==null)//此时对应偶数的情况，总数为2*count
            count=2*count;
        else//此时对应奇数的情况，总数为2*count+1
            count=2*count+1;
        int subscript=count-n;
        //subscript的作用很重要，重点考虑它为0的情况
        //subscript为0时，代表去掉头节点
        //subscript大于等于1时，代表去掉下标为subscript节点，这时我们需要走subscript-1步走到它
        //前一个节点（subscript这时也代表将要被去掉的那个节点前面有几个节点）
        if(subscript==0)
            head=head.next;//这里面的操作就是对输入变量进行直接操作
        else {
            while (subscript > 1) {//等于1时不需要走步就到达了head
                subscript--;
                slow = slow.next;
            }
            slow.next=slow.next.next;
        }
        return head;
    }
}
