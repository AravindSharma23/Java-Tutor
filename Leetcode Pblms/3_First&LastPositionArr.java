// Problem - 34 -> Related to Binary search -> Asked in FB
// Find First and last position of element in Array
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int search(int[] nums,int target,boolean isFirstIndex){
       int ans = -1;
       int start = 0;
       int end = nums.length-1;
       while(start<=end){
        int mid = start+(end-start)/2;
        if(nums[mid]>target){
            end = mid-1;
        }else if(nums[mid]<target){
            start = mid+1;
        }else{
            ans = mid;
            if(isFirstIndex){ // To check for any number is their in 1st part of array
                end = mid-1;
            }else{      // To check for any number is their in 2nd part
                start = mid+1;
            }
        }

       }
       return ans;
    }
    
}
