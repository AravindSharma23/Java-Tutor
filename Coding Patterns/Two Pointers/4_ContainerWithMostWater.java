// 11. Container With Most Water - leetcode - medium -imp

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxiArea = 0;

        while(left<right){   // (right-left) - to find breath
            int area = Math.min(height[left],height[right]) * (right-left); // Math.min(height[left],height[right]) - finding shorter wall to avoid overflow or water leakage
            maxiArea = Math.max(maxiArea,area);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxiArea;
    }
}
