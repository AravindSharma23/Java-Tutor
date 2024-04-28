
// Binary search :
/*
Assume its a sorted array.
steps : 
1. Find mid element 
2. If target > mid -> start = mid+1;
3. If traget < mid -> end = mid-1;
4. Got a answer

*/
public class Main
{
	public static void main(String[] args) {
	int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89}; // sorted Array
	int target = 2;
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
	            start = mid+1;
	        }else if(target< arr[mid]){
	            end = mid-1;
	        }
	        else{
	             return mid; // prints index 
	        }
	    }
	    return -1 ; // If not found means prints -1
	}
}
