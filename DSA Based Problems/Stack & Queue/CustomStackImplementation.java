import java.util.*;

class CustomStack{
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }
    public boolean push(int item){
        
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    private boolean isFull(){
        return ptr == data.length-1;
    }
    
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from an empty stack");
            }
            return data[ptr--];
    }
    
     private int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty stack");
            }
            return data[ptr];
    }
    
    
    private boolean isEmpty(){
        return ptr == -1;
    }
    
    
}
class Main{
    public static void main(String[] args){
     CustomStack stack = new CustomStack(5);
     stack.push(1);
     stack.push(2);
     stack.push(3);
     stack.push(4);
     stack.push(5);
     
      try {
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


 }
}
