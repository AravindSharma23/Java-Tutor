// Find Minimum value in Array:

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	int[] arr = {90,75,18,12,6,4,3,1}; 
    int res = MinVal(arr);
    
    System.out.print("Min val  is "+res);
	}
	 static int MinVal(int[] arr){
	     int min = arr[0];
	     for(int i=0;i<arr.length;i++){
	         if(arr[i]< min){
	             min = arr[i];
	         }
	     }
	     return min;
	 }
	}
	

	
     
	

