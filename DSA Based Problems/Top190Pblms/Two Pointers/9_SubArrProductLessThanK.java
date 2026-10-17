// 713. Subarray Product Less Than K - leetcode -713 - medium

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0; 
        int n = nums.length;
        int count = 0;
        int prod = 1;
        int left = 0;
        for(int right = 0;right < n;right++){
           prod *= nums[right];

           while(prod >= k){
            prod/=nums[left]; // here we removing that value from beginning of arr
            left++;
           }
           count += right-left +1; // diff btw right & left
        }
        return count;
    }
}
