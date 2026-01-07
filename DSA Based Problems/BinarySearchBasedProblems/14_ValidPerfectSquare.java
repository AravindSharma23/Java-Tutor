// 367. Valid Perfect Square - leetcode - easy

class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;
        long val = 0;

        while(low <= high){
            int mid = low +(high-low)/2;
            val = (long) mid * mid;
            if(val == num){
               break;
            }else if(val < num){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        if(val == num){
         return true;
        }
        return false;
    }
}
