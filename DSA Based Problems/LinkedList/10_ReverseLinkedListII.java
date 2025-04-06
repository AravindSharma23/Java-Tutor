// Reverse LinkedList II - Leetcode - 92 - Medium - Asked in FAANG


class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head; 
        ListNode leftPrev = dummy;
        ListNode current = head;

        for(int i=0;i<left-1;i++){
            leftPrev = leftPrev.next;
            current = current.next;
        } 
        ListNode subListedHead = current;
        ListNode prevNode = null;
        for(int i=0;i<=right-left;i++){
              ListNode nextNode = current.next;
              current.next = prevNode;
              prevNode = current;
              current = nextNode;
        }
       leftPrev.next = prevNode;
       subListedHead.next = current;
       return dummy.next;
    }
}
