package Insertion_Sort_List;

class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head==null)//这个东西就很烦了，竟然还会插入一个空指针，这...
            return head;
        ListNode node=head;
        while(node.next!=null){
            if(node.val<=node.next.val)
                node=node.next;
            else {
                ListNode node1=node.next;
                node.next=node.next.next;
                ListNode point=head;
                //插入的时候要考虑头部
                if(head.val>node1.val){
                    node1.next=head;
                    head=node1;
                }
                else{
                    while(point.val<=node1.val){
                        if(point.next.val>= node1.val)//其实point.next==null是不会出现的
                            break;
                        point=point.next;
                    }
                    node1.next=point.next;
                    point.next=node1;
                }
            }
        }
        return head;
    }
}