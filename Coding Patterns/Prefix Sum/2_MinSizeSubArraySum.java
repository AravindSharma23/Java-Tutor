// 209. Minimum Size Subarray Sum - leetocde - medium

class Solution {
    public int minSubArrayLen(int target, int[] arr) {
       // Set<Integer> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while(right < arr.length){
            sum = sum+arr[right];
           while(sum>= target){
            min = Math.min(min,right-left+1);
            sum = sum-arr[left];
            left++;
           }
            
            right++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
