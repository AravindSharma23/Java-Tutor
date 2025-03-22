// Remove Duplicates from sorted list - Leetcode easy - 83 
//created own linkedlist 
// class LinkedList{
//    private Node head;
//    private Node tail;
//    private int size;
//     class Node{
//       private int value;
//       private Node next;
      
//       public Node(int val){
//           this.value = val;
//       }
//       public Node(int val,Node next){
//           this.value = val;
//           this.next = next;
//       }
//     }
    
//     public LinkedList(){
//         this.size = 0;
//     }
    
//     public void insertFirst(int val){
//         Node node = new Node(val);
//         node.next = head;
//         head = node;
//         if(tail == null){
//             tail = head;
//         }
//         size++;
//     }
//     public void insertEnd(int val){
//         Node node = new Node(val);
//         if(tail == null){
//             insertFirst(val);
//             return;
//         }
//         tail.next = node;
//         tail = node;
//         tail.next = null;
//         size++;
//    }
//     public void removeDuplicates(){
//         Node node = head;
//         while(node.next != null){
//             if(node.value == node.next.value){
//                 node.next = node.next.next;
//                 size--;
//             }else{
//                 node = node.next;
//             }
//         }
//         tail = node;
//         tail.next = null;
//     }
//     public void display(){
//         Node temp = head;
//         while(temp.next != null){
//             System.out.print(temp.value+"->");
//             temp = temp.next;
//         }
//         System.out.println("END");
        
//     }
// }
// public class Main
// {
// 	public static void main(String[] args) {
// 	    LinkedList list = new LinkedList();
// 	    list.insertFirst(3);
// 	    list.insertEnd(4);
// 	    list.insertEnd(4);
//         list.insertEnd(5);
//         list.insertEnd(5);
//         list.insertEnd(3);

// 	    list.removeDuplicates();
// 	    list.display();
	    
// 	}
// }





// leetcode solution - easy - 83 
class Solution {
    public ListNode deleteDuplicates(ListNode node) {
        if(node == null){
            return node;
        }
        ListNode head = node;
        while(node.next != null){
             if(node.val == node.next.val){
                node.next = node.next.next;
             }
             else{
                node = node.next;
             }
             
        }
        return head;
    }
}
