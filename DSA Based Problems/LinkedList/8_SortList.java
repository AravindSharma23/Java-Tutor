// Sort List - Leetcode Medium - 148

class Solution {
    public ListNode sortList(ListNode head) {
      if(head == null || head.next == null){
        return head;
      }
      ListNode mid = getMid(head);
      ListNode left = sortList(head);
      ListNode right = sortList(mid);
      return merge(left,right);
}
public ListNode getMid(ListNode head){ // finding mid
    ListNode fast = head;
    ListNode slow = head;
    ListNode prev = null;
    while(fast != null && fast.next != null){
      prev = slow;
      slow = slow.next;
      fast = fast.next.next;
    }
    if(prev != null){
        prev.next = null;
    }
    return slow;
}
public ListNode merge(ListNode l1,ListNode l2){ // merging 1st part & 2nd part
    ListNode dummy = new ListNode(Integer.MIN_VALUE);
    ListNode current = dummy;
    while(l1 != null && l2 != null){
        if(l1.val <= l2.val){
           current.next = l1;
           l1 = l1.next;
        }else{
            current.next = l2;
            l2 = l2.next;
        }
        current = current.next;
    }
     if(l1 == null){
        current.next = l2;
     }else{
        current.next = l1;
     }
       return dummy.next;
}
}
