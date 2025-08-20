// Add Number LinkeedList - 240 testcases only passed...

class Solution {
    static Node addTwoLists(Node head1, Node head2) {
        // code here
        Node l1 = reverseList(head1);
        Node l2 = reverseList(head2);
        Node dummy = new Node(Integer.MIN_VALUE);
        Node curr = dummy;
        Node node;
        int carry = 0;
        while(l1 != null && l2 != null){
           int  sum = l1.data + l2.data+carry;
            node = new Node(sum%10);
            dummy.next = node;
            dummy = node;
            carry = sum/10;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
          int  sum = l1.data+carry;
            node = new Node(sum%10);
            dummy.next = node;
            dummy = node;
            carry = sum/10;
            l1 = l1.next;
        }
        while(l2 != null){
          int  sum = l2.data+carry;
            node = new Node(sum%10);
            dummy.next = node;
            dummy = node;
            carry = sum/10;
            l2 = l2.next;
        }
        while(carry > 0){
              node = new Node(carry%10);
            dummy.next = node;
            dummy = node;
            carry = carry/10;
        }
       Node result =  reverseList(curr.next);
        return result;
    }
    public static Node reverseList(Node head){
        Node curr = head;
        Node next = null;
        Node prev = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
