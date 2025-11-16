// Kth from End of Linked List  - GFG - Easy - Important


class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        //Node dummy = head;
        Node A = head;
        Node B = head;
        int m = 0;
        while(m<k && A != null ){
            A = A.next;
            m++;

        }
        if(m < k && A == null){
            return -1;
        }
        while(A != null && B != null){
            B = B.next;

            A = A.next;
        }
        return B.data;
    }
}
