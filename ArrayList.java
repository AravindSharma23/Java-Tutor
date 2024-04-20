import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<Integer> myList= new ArrayList<>(10);
	    Scanner sc = new Scanner(System.in);
	    /*
	    To Add new elements in ArrayList
	    
	      myList.add(1);
	      myList.add(13);
	      myList.add(75);
	      myList.add(33);
	      myList.add(32);
	      */
	      
	      /* 
	      To check whether its exist or not
	      System.out.println(myList.contains(32));
	      
	      */
	      
	      /* 
	      To set a value at specific index
	      myList.set(0,100);
	     */
	     
	     /*
	      To remove element at specific index
	      myList.remove(3); //index:3
	   
	    */
	    
	   /*  To get input in ArrayList */
	   for(int i=0;i<5;i++){
	       myList.add(sc.nextInt());
	   }
	   System.out.print("My list is"+myList);
	   
	   /* Get index at any item */
	   for(int i=0;i<5;i++){
	       System.out.print(myList.get(i));
	   }
	   
	}
	
}
