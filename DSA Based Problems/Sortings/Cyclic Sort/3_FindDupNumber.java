/*
Find Duplicate Number -> 287 - leetcode - >Aslked in  Amazon. -> Medium

*/

class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        int repeatedNum = 0;
        for(int index=0;index<nums.length;index++){
            if(nums[index] != index+1){
                repeatedNum =  nums[index];
            }
        }
        return repeatedNum;
    }
    static void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
