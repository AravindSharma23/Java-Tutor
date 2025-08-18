// Linked List Group Reverse using recursion - Hard 



class Solution {
    public static Node reverseKGroup(Node head, int k) {
        // code here
        if(head == null){
            return head;
        }
        int count = 0;
        Node temp = head;
        while(temp != null && count < k){
            count ++;
            temp = temp.next;
        }
        Node groupedNode = reverseNodes(head,k);
        
       head.next =  reverseKGroup(temp,k);
       return groupedNode;
        
    }
    public static Node reverseNodes(Node head , int k){
        
        Node curr = head;
        Node next = null;
        Node prev = null;
        int c = 0;
        while(curr != null && c<k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            c++;
        }
        return prev;
       
    }
}
