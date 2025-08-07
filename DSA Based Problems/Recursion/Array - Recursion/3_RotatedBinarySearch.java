// Rotated Binary Search using recursion 



public class Main
{
	
	public static void main(String[] args) {
	    int[] arr = {4,5,6,8,9,1,2,3};
	    int target = 3;
	    System.out.println(binearySearch(arr,target,0,arr.length-1));
	    
	}
	static int binearySearch(int[] arr , int target,int s, int e){
	    int mid = s+(e-s)/2;
	    if(s>e){
	        return -1;
	    }
	    if(arr[mid] == target){
	        return mid;
	    }
	    if(arr[s]<= arr[mid]){ // check whether 1st part is sorted or not 
	        if(target >= arr[s] && target <= arr[mid]){ // checking in 1st part
	           return binearySearch(arr,target,s,mid-1);
	        }else{
	           return binearySearch(arr,target,mid+1,e);
	        }
	    }
	    if(target>= arr[mid] && target <= arr[e]){ // checking in 2nd part
	       return  binearySearch(arr,target,mid+1,e);
	    }
	    return binearySearch(arr,target,s,mid-1);
	} 
}
