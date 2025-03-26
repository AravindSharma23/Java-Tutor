//142  Linked List Cycle II - medium - Asked FAANG

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(slow != null && fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                while(head != slow){
                    head = head.next;
                    slow = slow.next;
                }
                
                return slow;
            }
        }
        return null;

    }
}
