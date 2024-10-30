// 33. Search in Rotated Sorted Array - >leetcode  medium -> Google Interview question


class Solution {
    public int search(int[] nums, int target) {
         return result(nums,target);
    }
  	static int findPivot(int[] arr){  // step 1 -> Find pivot
        int max = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[max]< arr[i]){
                max = i;
            }else{
                break;
            }
        }
        return max;
    }
    static int result(int[] arr,int target){
        int idx = -1;
        if(arr[0]>arr[arr.length-1]){  // To check whether array is rotationally sorted
            int maxVal = findPivot(arr);

            if(target > arr[arr.length-1]){    // check for target in 1st part of array
               idx =  binarySearch(arr,0,maxVal,target);

            }else{           // check for target in 2nd part of array
           idx =  binarySearch(arr,maxVal+1,arr.length-1,target);

        }
          return idx;   
        }
        return binarySearch(arr,0,arr.length-1,target);   // To check for target in a sorted array
    }
    static int binarySearch(int[] arr,int start,int end,int target){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid]>target){
                end = mid-1;
            }else if(arr[mid] < target){
                start = mid+1;
            }
        }
        return -1;
    }
}
