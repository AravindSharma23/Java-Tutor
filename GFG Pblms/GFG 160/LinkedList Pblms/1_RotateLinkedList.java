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

// Rotate a linkedlist in right side : 
class Solution {
    public Node rotate(Node head, int k) {
        // add code here
        if(head == null || head.next == null || k<0){
            return head;
        }
       Node current = head;
       int count=0;
       Node end=null;
       while(current!=null){
           if(current.next==null){
               end=current;
           }
           count++;
           current=current.next;
       }
       k=k%count;
       while(k>0){
           end.next=head;
           end=end.next;
           head=end.next;
           end.next=null;
           k--;
       }
       
       
       return head;
    }
}
