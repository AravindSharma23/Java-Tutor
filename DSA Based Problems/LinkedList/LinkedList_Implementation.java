// Implementation of LinkedList


class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        
        Node(int val){
            data = val;
            next = null;
        }
    }
    LinkedList(){
        head = null;
    }
    public void insertAtBeginning(int val){
        Node newNode = new Node(val);
        if(head == null){
             head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void display(){
        Node temp = head;
        while(temp != null){
         System.out.print(temp.data+" ");
         temp = temp.next;
        }
    }
    public void insertAtPosition(int pos,int val){
        Node newNode = new Node(val);
        Node temp = head;
        for(int i=0;i<pos;i++){
            if(pos == 0){
                insertAtBeginning(val);
                return;
            }else{
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
    }
    public void deleteAtPosition(int pos){
        Node temp = head;
        Node prev = null;
        if(pos==0){ // delete at beginning
            head = head.next;
            return;
        }
        for(int i=1;i<=pos;i++){
            prev = temp; // prev of delete node
            temp = temp.next; // deleting node 
        }
         prev.next = temp.next;
        
    }
}
class Main{
    public static void main(String[] args){
    LinkedList list = new LinkedList();
    list.insertAtBeginning(9);
    list.insertAtBeginning(7);
    list.insertAtPosition(1,6);
    list.display();
    System.out.println("Before deletion");
    list.deleteAtPosition(0);
    System.out.println("After deletion");

    list.display();
    }
}
