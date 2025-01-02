// Binary search using recursion



public class Main
{
	public static void main(String[] args) {
	    int[] arr = {1,3,5,7,33,42,50,55,60};
	    int target = 60;
	    System.out.print(binnarySearch(arr,target,0,arr.length-1));
	    
	}
	static int binnarySearch(int[] arr,int target,int start,int end){
	    if(start > end){
	        return -1;
	    }
	    int mid = start+(end-start)/2;
	    if(arr[mid] == target){
	        return mid;
	    }
	    if(arr[mid] > target){
	        return binnarySearch(arr,target,start,mid-1);
	    }else{
	        return binnarySearch(arr,target,mid+1,end);

	    }
	}
}

// o/p : 8 
