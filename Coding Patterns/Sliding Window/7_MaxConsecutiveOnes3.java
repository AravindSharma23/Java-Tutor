// Leetcode 1004. Max Consecutive Ones III - Medium - Important
// Refered nikhil lohia 

class Solution {
    public int longestOnes(int[] nums, int k) {
         int start = 0,maxOnes = 0,zeroCount = 0;
         for(int end = 0;end<nums.length;end++){
            if(nums[end] == 0){
                zeroCount++;
            }

            while(zeroCount > k){
                if(nums[start] == 0){
                    zeroCount--;
                }
                 start++;

            }
            maxOnes = Math.max(maxOnes,end - start +1);
         }
         return maxOnes;
    }
}
