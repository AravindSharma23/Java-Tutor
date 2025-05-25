// Hacker rank - refered nikhil lohia 


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Stack<Integer> a = new Stack<>();
	    Stack<Integer> b = new Stack<>();
	    a.push(4);
	     a.push(2);
	      a.push(4); 
	       a.push(6);
	        a.push(1);
	        
	        b.push(2);
	         b.push(1);
	          b.push(8);
	           b.push(5);
	    int st1Count = 0,st2Count = 0,totalSum=0,result=0;
	    int maxSum = 11;
	    for(Integer st1Element : a){
	        if(totalSum+st1Element > maxSum){
	            break;
	        }
	        totalSum+=st1Element;
	        //System.out.println("totalSum in a "+totalSum);
	        st1Count++;
	    }
	    result = st1Count;
	    
	    for(Integer st2Element : b){
	       //System.out.println("prev totalSum "+totalSum +" "+ st2Element);
	       totalSum+=st2Element;
	       st2Count++; 
	        
	        while(totalSum > maxSum && st1Count>0){
	            totalSum-=a.get(st1Count-1);
	            st1Count--;
	            //System.out.println("totalSum "+totalSum);
	        }
	        //System.out.println("st1Count "+st1Count+"st2Count "+st2Count);
	        result=totalSum<=maxSum ? Math.max(st1Count+st2Count,result) : result;
	    }
	    //System.out.println("result "+result);

	}
}
