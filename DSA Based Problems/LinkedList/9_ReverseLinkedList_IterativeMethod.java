// Leetcode -> 206 - Reverse Linked List -> Easy -> FAANG Ques
// Here used three pointers (refer dhinesh varyani)
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}
