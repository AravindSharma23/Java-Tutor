// 143. Reorder List - leetcode - medium

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
    public void reorderList(ListNode head) {
        if(head == null || head.next ==null){
            return ;
        }
        ListNode firstHead = head;
        ListNode mid = findMid(head);
        ListNode secondHead = reverse(mid);
        while(firstHead != null && secondHead != null){
            ListNode temp = firstHead.next;
            firstHead.next = secondHead;
            firstHead = temp;

            temp = secondHead.next;
            secondHead.next = firstHead;
            secondHead = temp;


        }
        if(firstHead != null){
            firstHead.next = null;
        }
    }
    public ListNode findMid(ListNode head){
        ListNode f = head;
        ListNode s = head;

        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
    public ListNode reverse(ListNode head){
        ListNode current = head;
        ListNode prev = null;

        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
