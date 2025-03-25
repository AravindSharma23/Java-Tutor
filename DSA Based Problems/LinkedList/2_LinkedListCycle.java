// LinkedList cycle  - 141 - Leetcode -easy
/* 
Its a fast and slow pointer method - pattern for solve a pblm.
F moves 2steps at a time but s moves one step at a time.
*/
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){ // why we add fast and fast.next != null means if cycle loop means there is no null.
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
             return true;
            }
        }
        return false;
    }
}
