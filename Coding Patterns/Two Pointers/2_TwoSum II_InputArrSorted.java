// 167. Two Sum II - Input Array Is Sorted - leetcode  - medium

class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] res = new int[2];
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int sum = arr[low]+arr[high];
            if(sum<target){
                low++;
            }else if(sum>target){
                high--;
            }else{
                res[0] = low+1;
                res[1] = high+1;
                break;
            }
        }
        return res;
    }
}
