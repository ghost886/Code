package middleNode;

//这道题的思路就是利用快慢节点进行寻找中间节点
//学会如何寻找中间节点，对于链表的归并排序有好处,因为可以寻找链表的中间节点
public class Solution {
    public ListNode middleNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        int nums=0;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //这个很迷糊了，return的东西没想象的那么麻烦，实际上是很简单的
        //这里好好想想
        return slow;
//        if(fast==null)
//            return slow;
//        return slow.next;
    }
}
