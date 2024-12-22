/*
Cyclic sort :
 -> Ranges from 1 to N use cyclic sort.
 Note :
  -> If ranges from 0 to N -> index = value.
  -> If ranges from 1 to N -> index = value-1.
 
*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    int[] arr = {3,5,2,1,4}; 
	    int i = 0;
	    while(i<arr.length){
	        int check = arr[i]-1;
	        if(arr[i] != arr[check]){
	            swap(arr,i,check);
	        }else{
	            i++;
	        }
	    }
	    
	  System.out.println("Array is "+Arrays.toString(arr));
      
	}
   static void swap(int[] arr,int first,int second){
       int temp = arr[first];
       arr[first] = arr[second];
       arr[second] = temp;
   }
    
}
