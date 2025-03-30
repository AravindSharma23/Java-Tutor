// Middle of linked list - 876 - leetcode -easy
// Used Two pointers method(hare and tortoise Algorithm)
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
