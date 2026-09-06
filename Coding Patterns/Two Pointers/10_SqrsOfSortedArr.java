// leetcode 977. Squares of a Sorted Array - easy

import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
      int n = nums.length;
      int[] res = new int[n];
      int left = 0;
      int right = n-1;
     for(int i = n-1;i>=0;i--){
        int leftSum = nums[left] * nums[left];
        int rightSum = nums[right] * nums[right];
        if(leftSum>rightSum){
            res[i] = leftSum;
            left++;
        }else{
            res[i] = rightSum;
            right--;
        }  
     }
     return res;
}
}
