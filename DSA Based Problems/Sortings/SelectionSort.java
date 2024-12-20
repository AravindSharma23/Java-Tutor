/* 
Selection sort :
1. Find max element in array.
2. Place it in correct position.
*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    int[] arr = {2,4,5,1,3};
	    for(int i=0;i<arr.length;i++){
	        int last = arr.length-1-i;
	        int maxIndex = getMaxIndex(arr,0,last);
	        swap(arr,maxIndex,last);
	    }
	  System.out.println("Array is "+Arrays.toString(arr));

	}
	static int getMaxIndex(int[] arr,int start,int end){
	    int max = start;
	    for(int i=start;i<=end;i++){
	        if(arr[max] < arr[i]){
	            max = i;
	        }
	    }
	    return max;
	}
	
	static void swap(int[] arr,int first,int second){
	    int temp = arr[first];
	     arr[first] = arr[second];
	    arr[second] = temp;
	}
}
