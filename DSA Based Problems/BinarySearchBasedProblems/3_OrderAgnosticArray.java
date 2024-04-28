// Order Agnostic  Array 



public class Main
{
	public static void main(String[] args) {
	int[] arr = {90,75,18,12,6,4,3,1}; // sorted Array

	int target = 4;
	int ans = agrosticBinarySearch(arr,target);
	System.out.print("Result is "+ans);
	}
	static int agrosticBinarySearch(int[] arr, int target){
	    int start = 0;
	    int end = arr.length-1;
	    boolean isAscending = arr[start]<arr[end];
	    
	    while(start<=end){
	        // int mid = (start+end)/2 -> It makes error bcz it exceeds Integer limit.so use below for mid. 
	        int mid = start+(end-start)/2;
	        if(target == arr[mid]){
	             return mid;
	        }  
	        if(isAscending){   // For Ascending ordered array
	            if(target < arr[mid]){
	                end = mid-1;
	            }else{
	                start = mid+1;
	            }
	        }
	        else{             // For Descending ordered array
	            if(target < arr[mid]){
	                start = mid+1;
	            }else{
	                end = mid-1;
	            }
	        }
	       
	        
	    }
	      return -1;
	    }
     }
	



