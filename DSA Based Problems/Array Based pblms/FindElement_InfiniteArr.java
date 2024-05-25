// Find position of element in infinite sorted array - Asked in Amazon



public class Main
{
	public static void main(String[] args) {
		int[] arr = {1,3,7,11,14,19,23,24,32,44,64,71,75,82};
		int target = 7;
		int res = findRange(arr,target);
		System.out.print(res);
	}
	static int findRange(int[] arr, int target){
	    int start = 0;
	    int end = 1;
	    while(target>arr[end]){
	       int temp = end+1;
	        end = end+(end-start+1)*2; // doubling size 
	        start = temp;
	        
	    }
	    return binarySearch(arr,target,start,end);
	}
	static int binarySearch(int[] arr,int target,int start,int end){
	    while(start <=end){
	    int mid = start+(end-start)/2;
	    if(target==arr[mid]){
	        return mid;
	    }
	    if(arr[mid]>target){
	        end = mid-1;
	    }else{
	        start = mid+1;
	    }
	}
	   return -1;
	}
}
