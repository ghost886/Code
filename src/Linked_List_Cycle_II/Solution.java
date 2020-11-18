package Linked_List_Cycle_II;

public class Solution {
    public ListNode hasCycle(ListNode head){
        ListNode slow=head.next;
        ListNode fast=head.next.next;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next.next;
        }
        return null;
    }
}
