// Rotate a LinkedList - leetcode - 61 - medium

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k<0){
            return head;
        }
        // To find linkedlist length
        int length = 1;
        ListNode curr = head;
        while(curr.next != null){
            length++;
            curr = curr.next;
        }
        k = length - (k%length);
        curr.next = head; // creates loop 
        
        while( k-- > 0){
         curr = curr.next;
        }
        head = curr.next;
        curr.next = null;
        return head;
    }
}
