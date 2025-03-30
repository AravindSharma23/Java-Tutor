// Leetcode 21 - Easy - Merge Two Sorted Lists - Imp


class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(Integer.MIN_VALUE); // create a node first

        ListNode head = node; 

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                node.next = l1;
                l1 = l1.next;
            }else{
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }
        if(l1 == null){ // check to add remaining part 
            node.next = l2;
        }else{
            node.next = l1;
        }
        return head.next; // return next of min integer
    }
}
