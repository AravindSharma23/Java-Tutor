// 287. Find the Duplicate Number - leetcode - medium

// cyclic sort pattern

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] nums = {1,3,4,2,2};
		int i = 0;
		while(i<nums.length){
		    int correct = nums[i]-1;
		    if(nums[i] != nums[correct]){
		        swap(nums,i,correct);
		    }else{
		        i++;
		    }
		}
		System.out.println(Arrays.toString(nums));
		for(int j = 0;j<nums.length;j++){
		    if(nums[j] != j+1){
		        System.out.println(nums[j]); // return nums[j]
		    }
		}

	}
	static void swap(int[] arr, int first,int second){
	    int temp = arr[first];
	    arr[first] = arr[second];
	    arr[second] = temp;
	}
	
	
}
