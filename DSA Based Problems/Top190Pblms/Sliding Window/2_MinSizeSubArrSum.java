//209. Minimum Size Subarray Sum - leetcode - medium

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{  
	    int[] nums = {1,4,4};
	    int target = 4;

	   System.out.println(frequency(nums,target));
	    
        
      } 
     static int frequency(int[] nums, int target){
        int left = 0;
        int right = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        
        while(right < nums.length){
            sum = sum + nums[right];
            while(sum >= target){ //finding  min len - greater than or equal to target eles
                min = Math.min(min,right-left+1);//start & end range of >=  target eles
                sum = sum - nums[left]; 
                left++;
            }
            right++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
          
      }


}
