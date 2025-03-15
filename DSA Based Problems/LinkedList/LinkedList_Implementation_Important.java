//Kunal Linkedlist

class LinkedList{
  
   private Node head;
   private Node tail;
   private int size;
   
   public LinkedList(){
       this.size = 0;
   }
   
   class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value , Node next){
            this.value = value;
            this.next = next;
         }
      }
      public void insertFirst(int val){
          Node node = new Node(val);
          node.next = head;
          head = node;
          if(tail == null){
              tail = head;
          }
          size+=1;
      }
      public void display(){
          Node temp = head;
          while(temp != null){
              System.out.print(temp.value+"->");
              temp = temp.next;
          }
      }
      public void insertEnd(int val){
          Node node = new Node(val);
          if(tail == null){
              insertFirst(val);
              return;
          }
          tail.next = node;
          tail = node;
          size++;
      }
      public void insertAtPosition(int pos,int val){
          if(pos == 0){
              insertFirst(val);
          }
          if(pos == size){
              insertEnd(val);
          }
          Node temp = head; // it has 0th indx value so starts from 1 in for loop.
          for(int i=1;i<pos;i++){
              temp = temp.next;
          }
           Node node = new Node(val,temp.next);
           temp.next = node;
           size++;

      }
      public int deleteFirst(){
          int value = head.value;
          head = head.next;
          if(head == null){ // if it has only one node means 
              tail = null;
          }
          size--;

          return value;
      }
      
      public void deleteLast(){
          Node A = head;
          Node B = head;
          while(B.next != null){
              A = B;
              B = B.next;
              
          }
          A.next = null;
          size--;
      }
     public void deleteAtIndex(int index){
         Node A = head;
         for(int i=0;i<index-1;i++){
             A = A.next;
         }
         A.next = A.next.next;
     }
}
public class Main
{
	public static void main(String[] args) {
	    LinkedList list = new LinkedList();
	    list.insertFirst(3);
	    list.insertFirst(4);
        list.insertFirst(5);
        list.insertEnd(2);
        list.insertEnd(1);
        list.insertAtPosition(3,100);
        // list.deleteFirst();
        list.display();
        //list.deleteLast();
        System.out.println("Before deleted");
        //list.display();
        list.deleteAtIndex(2);
        list.display();



	}
}
