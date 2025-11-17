// Intersection of Two Linked Lists - 160 - Leetcode  - Easy


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
          int len1 = getLength(head1);
          int len2 = getLength(head2);

          while(len1 > len2){
            len1--;
            head1 = head1.next;
          }
          while(len2 > len1){
            len2--;
            head2 = head2.next;
          }
          while(head1 != null && head2 != null){
              if(head1 ==  head2){
                 return head1;
              }
              head1 = head1.next;
              head2 = head2.next;
          }
          return null;
    }
    public int getLength(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}



