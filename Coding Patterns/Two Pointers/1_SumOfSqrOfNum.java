// Sum of Square of Number - leetcode - medium - 633


class Solution {
    public boolean judgeSquareSum(int c) {
        int low = 1, high = c ;
        // Binary search to find sqrt of num
        while(low <= high){
           int mid = low+(high-low)/2;
            long val = (long) mid*mid;
            if(val <= c){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        long sum = 0;
        long left = 0;
        long right = high; // (int) Math.sqrt(c) without using binary seaech to find sqrt of num
        while(left<= right){
         sum = left * left + right *right;
        if(sum == c){
            return true;
        }else if(sum < c){
            left++;
        }else{
            right--;
        }
        }
       return false;
        
    }
}
