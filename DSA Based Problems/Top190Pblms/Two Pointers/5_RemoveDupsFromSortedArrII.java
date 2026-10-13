// leetcode - 80. Remove Duplicates from Sorted Array II - medium 

class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for(int n : nums){
            if(j<2 || nums[j-2]!= n){
                nums[j++] = n;
            }
        }
        return j;
    }
}
