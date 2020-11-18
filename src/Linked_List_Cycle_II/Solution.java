package Linked_List_Cycle_II;

public class Solution {
    public ListNode detectCycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(slow!=null&&fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                break;
            }
        }
        if(fast==null||fast.next==null)
            return null;
        else{
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
    }
}
