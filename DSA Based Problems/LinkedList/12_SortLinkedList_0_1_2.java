// Sort a linked list of 0s, 1s and 2s  - GFG - Medium -  Asked in FAANG

class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        Node current = head;
        
        while(current != null){
            
            if(current.data == 0){
                zeros++;
            }else if(current.data == 1){
                ones++;
            }else{
                twos++;
            }
            current = current.next;
        }
        //current = head;
        Node dummy = new Node(Integer.MIN_VALUE);
        current = dummy;
        for(int i=0;i<zeros;i++){
            Node newNode = new Node(0);
            current.next = newNode;
            current = current.next;
        }
        for(int i=0;i<ones;i++){
            Node newNode = new Node(1);
            current.next = newNode;
            current = current.next;
        }
        for(int i=0;i<twos;i++){
            Node newNode = new Node(2);
            current.next = newNode;
            current = current.next;
        }
        return dummy.next;
        
    }
}
