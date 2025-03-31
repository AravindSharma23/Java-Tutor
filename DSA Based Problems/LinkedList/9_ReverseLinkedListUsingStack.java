// Reversal of linked list using stack


ListNode reverseLinkedList(ListNode head){
   Stack<Integer> stack = new Stack<>();
     while(head != null){
          stack.push(head.val);
          head = head.next;
      }
   ListNode reversedList = new ListNode(Integer.MIN_VALUE);
   ListNode ptr = reversedList;
   while(!stack.isEmpty()){
      ptr.next = new ListNode(stack.pop());
      ptr = ptr.next;
   }
    return reversedList.next;
 }

