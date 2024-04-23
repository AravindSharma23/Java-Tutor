// Richest Customer wealth leetcode -> 1672

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 int[][] accounts = {
	     {1,2,3},
	     {3,2,1},
	     {8,7,3}
	 };
	 
	System.out.println("maxWealth is "+maxWealth(accounts));
	}
	
	static int maxWealth(int[][] accounts){
	    int ans = Integer.MIN_VALUE;
	    for(int[] account : accounts){
	        int sum = 0;
	        for(int wealth : account){
	            sum = sum+wealth;
	        }
	        if(ans < sum){
	            ans = sum;
	        }
	    }
	    return ans;
	}
}
