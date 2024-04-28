// Binary search for descending ordered array.

public class Main
{
	public static void main(String[] args) {
	int[] arr = {90,75,18,12,6,4,3,1}; // sorted Array
	int target = 18;
	int ans = binarySearch(arr,target);
	System.out.print("Result is "+ans);
	}
	static int binarySearch(int[] arr, int target){
	    int start = 0;
	    int end = arr.length-1;
	  
	    while(start<=end){
	        // int mid = (start+end)/2 -> It makes error bcz it exceeds Integer limit.so use below for mid. 
	        int mid = start+(end-start)/2;
	        if(target > arr[mid]){
	             end = mid-1;
	           
	        }else if(target< arr[mid]){
	             start = mid+1;
	        }
	        else{
	             return mid; // prints index 
	        }
	    }
	    return -1 ; // If not found means prints -1
	}
}
