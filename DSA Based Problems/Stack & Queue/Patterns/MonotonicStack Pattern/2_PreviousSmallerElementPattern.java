// previous Smaller Element 

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[] arr = {5,7,9,6,7,4,5,1,3,7};
	    int size = arr.length;
        Stack<Integer> stack = new Stack<>();
	    int[] res = new int[size];
        for(int i = 0;i<size;i++){
            int curr = arr[i];
            while(!stack.isEmpty() && curr <= stack.peek()){
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : stack.peek(); 
            stack.push(arr[i]);

        }
        System.out.println(Arrays.toString(res));
		
	}
    
}
