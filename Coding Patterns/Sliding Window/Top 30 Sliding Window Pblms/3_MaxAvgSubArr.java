// 643. Maximum Average Subarray I - leetcode - easy


class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max = 0;
        int sum = 0;
        for(int i = 0;i<k;i++){
            sum = sum+nums[i];
        }
        max = sum;
        for(int j = k;j<nums.length;j++){
            sum = sum + nums[j]-nums[j-k];
            max = Math.max(max,sum);
        }
        return (double) max/k;
    }
}
