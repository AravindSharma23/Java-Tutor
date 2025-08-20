
// Quicksort using Recursion

/*
choosing pivot :
 -> corner element 
 -> mid element
 -> Random element
 
 Rule :
 ->Elements must be lesser than pivot on left side.
 -> Elements must be greater than pivot on right side. 
 */
 
 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {5,4,3,2,1};
	    quickSort(arr,0,arr.length-1);
	    System.out.println(Arrays.toString(arr));
	}
	public static void quickSort(int[] arr , int low,int high){
	    if(low>=high){
	        return;
	    }
	    int s = low;
	    int e = high;
	    int pivot = s+(e-s)/2;
	    while(s<=e){
	       // No need to sort it bcz its sorted so increment s and decrement e . 
	        while(arr[s]<arr[pivot]){
	            s++;
	        }
	        
	        while(arr[e]>arr[pivot]){
	            e--;
	        }
	        // If it violate rule means swap it with s and e.
	        if(s<=e){
	            int temp = arr[s];
	            arr[s] = arr[e];
	            arr[e] = temp;
	            s++;
	            e--;
	        }
	    }
// if pivot at correct index (its order is correct) separate it into two parts
	    quickSort(arr,low,e);
	    quickSort(arr,s,high);
	    
	}
}
