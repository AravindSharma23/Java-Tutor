// Leetcode : 42. Trapping Rain Water - Hard

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n == 0) return 0;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = height[0];
        rightMax[n-1] = height[n-1];

        for(int i = 1;i<n;i++){ 
            // storing max from left to right side of height[]
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
        for(int j = n-2;j>=0;j--){
            // storing max from right to left side of height[]
            rightMax[j] = Math.max(rightMax[j+1],height[j]);
        }
        //formula : 
        //Min(left,right)-height of current ele to find water storage unit
        int totalWater = 0;
        for(int k = 0;k<n;k++){
            totalWater+= Math.min(leftMax[k],rightMax[k]) - height[k];
        }
        return totalWater;
    }
}
