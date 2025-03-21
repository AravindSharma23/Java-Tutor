class circularLinkedList{
    private Node head;
    private Node tail;
    class Node{
        private int value;
        private Node next;
        
       public Node(int val){
            this.value = val;
        }
       public Node(int val,Node next){
            this.value = val;
            this.next = next;
        }
    }
    public circularLinkedList(){
        this.head = null;
        this.tail = null;
    }
    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void delete(int val){
        Node node = head;
        if(node == null){
            return;
        }
        if(node.value == val){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if(n.value == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);
    }
    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.value+" ->");
                node = node.next;
                
            }while(node != head);
        }
    }
}
class Main{
    public static void main(String[] args){
        circularLinkedList list = new circularLinkedList();
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.delete(5);
        list.display();
    }
}
