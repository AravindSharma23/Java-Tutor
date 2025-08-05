// 1342 -> Leetcode -> Number of Steps to Reduce a Number to Zero - Easy


class Solution {
    public int numberOfSteps(int num) {
        int ans = findSteps(num,0);
        return ans;
    }
    	public static int findSteps(int n , int count){
	    
	    if(n == 0){
	        return count;
	    }
	    if(n %2 == 0 ){
	        return findSteps(n/2,count+1);
        }
	        return findSteps(n-1,count+1);
        }
	    
}
