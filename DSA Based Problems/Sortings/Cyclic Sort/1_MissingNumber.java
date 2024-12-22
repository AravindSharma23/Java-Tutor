/*

 Missing Number -> Leetcode -> 268 -> Easy - Amazon question.
*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    int[] arr = {3,0,1}; 
	    int i = 0;
	    while(i < arr.length){
	        int correct = arr[i];
	        if(arr[i] < arr.length && arr[i] != arr[correct]){
	            swap(arr,i,correct);
	        }else{
	            i++;
	        }
	    }
	   
	  System.out.println("Array is "+Arrays.toString(arr));
	  System.out.println("Missing num is "+findMissingNumber(arr));
      
	}
   static void swap(int[] arr,int first,int second){
       int temp = arr[first];
       arr[first] = arr[second];
       arr[second] = temp;
   }
   static int findMissingNumber(int[] arr){
        for(int index=0;index<arr.length;index++){
	        if(arr[index] != index){ // case1 -> return missed num
	            return index;
	        }
	    }
	    return arr.length; // return lastly missed num

   }
    
}
