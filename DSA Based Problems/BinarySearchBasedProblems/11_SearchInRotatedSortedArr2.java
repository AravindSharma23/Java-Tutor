
//  Search in Rotated Sorted Array II - > 81 -> Leetcode medium
class Solution {
    public boolean search(int[] nums, int target) {
      	    return result(nums,target);

    }
  	static boolean result(int[] arr,int target){
        int start = 0;
        int end =arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return true;
            }
            if(arr[start]== arr[mid] && arr[end] == arr[mid]){
                start++;
                end--;
            }else if(arr[start]<=arr[mid]){
                if(arr[start] <= target && target < arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(arr[mid]<target && target <= arr[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
         return false;
    }

    	
}
