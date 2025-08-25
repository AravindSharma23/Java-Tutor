// Remove loop in Linked List - Medium - FAANG 


/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        // code here
      Node fast = head;
      Node slow = head;
      Node loopStart = null;
      while(fast != null && fast.next != null){
          fast = fast.next.next;
          slow = slow.next;
          if(fast == slow){
              break;
          }
      }
      if(fast == null || fast.next == null){ // if no loops present
          return;
      }
      // start from head to find loop starting node
      slow = head;
      while(slow != fast){
          slow = slow.next;
          fast = fast.next;
      }
      loopStart = slow;
      // Finding last node of cycle and point it to null
      Node temp = loopStart;
      while(temp.next != loopStart){
          temp = temp.next;
      }
      temp.next = null;
        
    }
}
