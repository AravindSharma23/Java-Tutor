// Majority Element - > Easy - Leetcode

//Refer https://www.youtube.com/watch?v=WJt1NKLD4ZM


class Solution {
    public int majorityElement(int[] nums) {
       int res = nums[0];
       int count = 0;
       for(int n : nums){
        if(count == 0){
            res = n;
        }
        if(res == n){
            count++;
        }else{
            count--;
        }
       } 
       return res;
    }
}
