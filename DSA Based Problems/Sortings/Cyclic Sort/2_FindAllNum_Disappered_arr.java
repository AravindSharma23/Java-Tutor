/*
 Find All Numbers Disappeared in an Array - > Leetcode 448  -> Google
 Tips:
 Range [0,n]-> index = value.
 Range [1,n]-> index = value-1;

*/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if( nums[i] != nums[correct]){
              swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index] != index+1){
                list.add(index+1);
            }
        }
        return list;
    }
    static void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
