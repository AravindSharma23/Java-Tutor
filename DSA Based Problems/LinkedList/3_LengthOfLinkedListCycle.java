
// refer nihil lokhia 

class LinkedList{
     Node head;
     Node tail;
    private int size;
    class Node{
        private int value;
        private Node next;
        
        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
    public LinkedList(){
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void insertEnd(int val){
        Node node = new Node(val);
        if(tail == null){
            insertFirst(val);
            return;
        }
        tail.next = node;
        node.next = null;
        tail = node;
        size++;
        
    }
    public int lengthCycle(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){ // why we add fast and fast.next != null means if cycle loop means there is no null.
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                Node temp = slow;
                int length = 0;
                do{
                   temp = temp.next; 
                   length++;
                }while(temp != slow); // when temp == slow means we comes to loop starting point.
                return length;
            }
        }
        return 0;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.print("END");
    }
}

public class Main
{
	public static void main(String[] args) {
	    LinkedList list = new LinkedList();
	    list.insertFirst(3);
	    list.insertEnd(4);
	     list.insertEnd(5);
	     list.insertEnd(6);
         list.display();
         
            int cycleLength = list.lengthCycle(list.head);
        System.out.println("\nCycle Length: " + cycleLength);
       
	}
}
