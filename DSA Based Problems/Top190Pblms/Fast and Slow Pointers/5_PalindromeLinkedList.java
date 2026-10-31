// 234. Palindrome Linked List - leetcode - easy

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
    public boolean isPalindrome(ListNode head) {
        ListNode mid = findMid(head);
        ListNode secondHead = reverse(mid);
        ListNode reReverseHead = secondHead;

        while(head != null && secondHead != null){
            if(head.val != secondHead.val){
                break;
            }
            head = head.next;
            secondHead = secondHead.next;
        }
        reverse(reReverseHead);

        return head == null || secondHead == null;
    }
    public ListNode findMid(ListNode head){
        ListNode f = head;
        ListNode s = head;
        while(f != null && f.next != null){
                     s = s.next;
                     f= f.next.next;
             }
         return s;
    }
    public ListNode reverse(ListNode head){
        
        ListNode current = head;
        ListNode prev = null;

        while(current != null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
      return prev;
    }
}
