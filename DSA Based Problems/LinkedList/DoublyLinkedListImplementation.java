



class DoublyLinkedList{
   private Node head;
      class Node{
             int value;
             Node prev;
             Node next;  
        
             public Node(int val){
                this.value = val;
             }
            public Node(int val,Node next,Node prev){
               this.value = val;
               this.next = next;
               this.prev = prev;
            }
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){ // If inserting 1st time means showing err show added  a condition
            head.prev = node;
        }
        head = node;
    }
    public void insertAtEnd(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }
    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
        
    }
    public void insertAfter(int after , int val){
        Node p = find(after);
        if(p == null){
            System.out.print("does not exist");
            return ;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }
    }
    public void display(){
        Node temp = head;
        Node last = head;
        while(temp != null){
            System.out.print(temp.value+"-> ");
            last = temp; // stores last node
            temp = temp.next;
        }
        System.out.println("END");
        
        System.out.println("Printing in reverse ");
        
        while(last != null){ 
            System.out.print(last.value+"-> ");
            last = last.prev;
        }
    }
    
   
}
class Main{
    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(6);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(11);
        list.insertAtEnd(8);
        list.insertAfter(6,44);
        list.display();

    }
}
