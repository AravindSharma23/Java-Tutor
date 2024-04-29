// Reverse a array  :

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	int[] arr = {90,75,18,12,6,4,3,1}; 
    int[] res = ReversedArr(arr);
    
    System.out.print("Reversed arr is"+Arrays.toString(res));
	}
	static int[] ReversedArr(int[] arr){
	    int start = 0;
	    int end = arr.length-1;
	    while(start<end){
	     int temp = arr[start];
	     arr[start] = arr[end];
	     arr[end] = temp;
	     start++;
	     end--;
	        
	    }
	    return arr;
	}
	

	
     }
	

