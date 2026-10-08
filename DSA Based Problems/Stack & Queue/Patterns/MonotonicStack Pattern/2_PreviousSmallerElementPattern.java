// previous Smaller Element 

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{  // Left       <---     Right
	   int[] arr = {4, 5, 2, 10, 8}; 
		int[] res = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		for(int i = arr.length-1;i>=0;i--){
		    while(!stack.isEmpty() && stack.peek() >= arr[i]){ // maintaing only smaller ele in a stack , so pop ele  that is greater val than current ele in stack
		        stack.pop();
		    }
		    res[i] = stack.isEmpty() ? -1 : stack.peek();
		    stack.push(arr[i]);
		}
		System.out.println(Arrays.toString(res));
		
	}
    
}
