// As same as binary search 

// Ceiling -> smallest number that is greater than or equal to target
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int arr[] = {2,3,5,9,14,16,18};
		int target = 15;
		int res = ceiling(arr,target);
		System.out.print("Res is "+res);
	}
	static int ceiling(int[] arr,int target){
	    int start = 0;
	    int end = arr.length-1;
	   if(target>arr[arr.length-1]){ // if target is greater than greatest num in arr then return -1;
       return -1;
     }
	    while(start<=end){
	        int mid = start+(end-start)/2;
	        if(arr[mid]>target){
	            end = mid-1;
	        }
	        else if(arr[mid]<target){
	            start = mid+1;
	        }else{
	            return mid;
	        }
	    }
	    return start;
	}
}
