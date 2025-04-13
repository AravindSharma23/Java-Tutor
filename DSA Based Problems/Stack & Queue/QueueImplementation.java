
import java.util.*;
class Main{
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        System.out.println(queue.peek());// get head of queue
        System.out.println(queue.remove());//removes head of queue
        


    }
}
