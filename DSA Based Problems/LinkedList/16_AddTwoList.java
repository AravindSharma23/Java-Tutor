// Add Number linkedlist - GFG - Important

// Adding two linked list
/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        Node l1 = reverseList(head1);
        Node l2 = reverseList(head2);
        int carry = 0;
        //int sum = 0;
        Node dummy = new Node(Integer.MIN_VALUE);
        Node temp = dummy;
        while(l1 != null || l2 != null || carry>0){
            int sum = carry;
            if(l1 != null){
                sum+=l1.data;
                l1 = l1.next;
            }
            if(l2 != null){
                sum+=l2.data;
                l2 = l2.next;
            }
            
             int rem = sum%10;
             carry = sum/10;
            
            Node node = new Node(rem);
            temp.next = node;
            temp = temp.next;
        }
        
        Node res = reverseList(dummy.next);
        Node tail = res;
        while(tail != null && tail.data ==0){
             tail = tail.next;
        }
        return tail;
        
    }
    public Node reverseList(Node head){
        Node curr = head;
        Node prev = null;
        Node next = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
