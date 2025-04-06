// 234 - Leetcode - Easy - palindrome_LinkedList - Asked in FAANG

/*
1. Find mid of linked list
2. Reverse linked list
3. check the 1st part and 2nd part whether its values are equal or not.
4. Rereverse the linked list

*/

// refered kunal kushwaha
lass Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode mid = findMid(head);
        ListNode secondHead = reverse(mid);
        ListNode reReverseHead = secondHead;

        while(head != null && secondHead != null){ // comparing 1st and 2nd part 
            if(head.val != secondHead.val){
                break;
            }
            head = head.next;
            secondHead = secondHead.next;
        }
        reverse(reReverseHead);

        return head == null || secondHead == null; // if any one is null means all are equal and its palindrome
    }
    public ListNode findMid(ListNode head){ //  Finding mid
        ListNode f = head;
        ListNode s = head;
        while(f != null && f.next != null){
                     s = s.next;
                     f= f.next.next;
             }
         return s;
    }
    public ListNode reverse(ListNode head){ // Reversing
        
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

