class CircularQueue{
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0; 
    protected int front = 0;
    protected int end = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }
    
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }
    
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }
    
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[front];
    }
    public void display(){
       if(isEmpty()){
           System.out.print("Its Empty");
           return;
       }
         int i = front;

       do{
           System.out.print(data[i]+" -> ");
           i++;
           i = i%data.length;
           
           
       }while(i != end);
       
        System.out.println("END");
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == data.length;
    }
    
}
    


public class Main
{
	public static void main(String[] args) {
	    CircularQueue cirQueue = new CircularQueue(5);
	    
	    cirQueue.insert(1);
	    cirQueue.insert(2);
	    cirQueue.insert(3);
	    cirQueue.insert(4);
	    cirQueue.insert(5);
	    
        cirQueue.display();
        
        try{
            System.out.println(cirQueue.remove());
            
        }catch(Exception e){
            System.out.println("Error is "+e);
        }
        cirQueue.insert(14);

        cirQueue.display();

	}
}
