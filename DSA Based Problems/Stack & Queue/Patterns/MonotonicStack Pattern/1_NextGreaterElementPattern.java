// Find next greater using monotonic stack pattern 

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[] nums2 = {1,3,4,1,2};
         int size = nums2.length;
         int[] nextGreaterElements = new int[size];
         Stack<Integer> stack = new Stack<>();
         
         for(int i = size-1;i>=0;i--){
             int curr = nums2[i];
             // if stack is empty , no greater elements 
             if(stack.isEmpty()){
                 stack.push(curr);
                 nextGreaterElements[i] = -1;
                 continue;
             }
             // top of stack element is greater than curr element
             if(!stack.isEmpty() && stack.peek() > curr ){
                 nextGreaterElements[i] = stack.peek();
                  stack.push(curr);
                  continue;
                 
             }
             // if top of stack elements are lesser than curr elemensts 
             while(!stack.isEmpty() && curr >= stack.peek()){
                 stack.pop();
             }
             if(stack.isEmpty()){
                 nextGreaterElements[i] = -1;
             }else{
                 nextGreaterElements[i] = stack.peek();
             }
             stack.push(curr);
             
         }
         System.out.println(Arrays.toString(nextGreaterElements));
		
	}
    
}
//Simplified Version :
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{   //Next Greater   
		int[] arr = {4, 5, 2, 10, 8};
		int[] res = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		for(int i = arr.length-1;i>=0;i--){
		    
		    while(!stack.isEmpty() && stack.peek() <= arr[i]){ // removing ele that is smaller than curr ele for maintaining Greater ele only in stack
		        stack.pop();
		    }
		    res[i] = stack.isEmpty() ? -1 : stack.peek();
		    stack.push(arr[i]);
		    
		}
        System.out.println(Arrays.toString(res));

	}
}
