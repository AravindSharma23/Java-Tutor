// Medium -> GFG - > Add 1 to a Linked List Number 

class Solution {
    public Node addOne(Node head) {
        // code here.
        if(head.next == null){
            head.data = head.data+1;
            return head;
        }
      Node reversed =  reverseList(head); 
      Node temp = reversed;
      
      Node prev = null;
      int carry = 1;
      while(temp != null){
          int sum = temp.data + carry;
           temp.data = sum%10;
          carry = sum /10;
          prev = temp;
          temp = temp.next;
      }
      if(carry >0){
          prev.next = new Node(carry);
      }
       return reverseList(reversed);

    }
     public Node reverseList(Node head){
        Node next = null;
        Node prev = null;
        Node curr = head;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
        }
        return prev;
    }
}
