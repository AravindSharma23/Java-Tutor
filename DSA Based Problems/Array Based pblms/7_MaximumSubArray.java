// Leetcode - 53 ->  Maximum Subarray  - Medium

/*
Approach 1 : Navie Approach 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
	    int maxSum = 0;
	    for(int i = 0;i<arr.length;i++){
	        int sum = 0;

	        for(int j = i;j<arr.length;j++){
	            sum = sum+arr[j];
	            maxSum = Math.max(maxSum,sum);
	        }
	    }
	    System.out.println("maxSum"+maxSum);
	    
	}
     
}

*/

// Approach 2 :  Kadane's Algorithm  - > TC - O(n) - > Best approach

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = nums[0];
         for(int i=1;i<nums.length;i++){
            if(sum>=0){
                sum = sum+nums[i];
            }else{
                sum = nums[i];
            }
            if(sum > maxSum){
                maxSum = sum;
            }
         }
         return maxSum;
    }
}
