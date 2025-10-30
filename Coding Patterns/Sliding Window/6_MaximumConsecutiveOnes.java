// Leetcode 485. Max Consecutive Ones - Easy

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int right = 0,left = 0,max = 0;

         while(right < nums.length){
            if(nums[right] == 0){
                left = right+1;
            }
            max = Math.max(max,right-left+1);
            right++;
         }
         return max;
    }
}
