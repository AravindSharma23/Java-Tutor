//Leetcode pblm -> 88 -> Medium 
//First and last position of element in sorted element in sorted array.


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        // int start = search(nums,target,true);
        // int end = search(nums,target,false);
        ans[0] = search(nums,target,true);
        if(ans[0] != -1){
           ans[1] = search(nums,target,false);
        }
        // ans[1] = end;
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
            if(isFirstIndex){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

       }
       return ans;
    }
    
}
