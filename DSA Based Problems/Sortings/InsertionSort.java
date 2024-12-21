/*
Insertion sort :
  -> It works good in partially sorted array(Hybrid array).
  -> stable 
  
*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    int[] arr = {2,5,1,0,-3,7};
	   	   //int[] arr = {};

	    for(int i=1;i<arr.length;i++){
	        for(int j=i;j>0;j--){
	            if(arr[j]<arr[j-1]){
	                swap(arr,j,j-1);
	            }
	            else{
	                break;
	            }
	        }
	    }
	    System.out.println("arr is "+Arrays.toString(arr));
	}

	static void swap(int[] arr,int first,int second){
	    int temp = arr[first];
	     arr[first] = arr[second];
	    arr[second] = temp;
	}
}
