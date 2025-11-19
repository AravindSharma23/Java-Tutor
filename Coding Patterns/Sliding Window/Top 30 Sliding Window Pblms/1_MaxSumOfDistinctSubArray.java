// Maximum Sum of distinct Subarray - Leetcode - Medium - 2461

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int begin = 0;
        long maxSum = 0;
        long currSum = 0;
        Set<Integer> s = new HashSet<>();
        for(int i = 0;i<n;i++){
            if(!s.contains(nums[i])){ // if not present in set means 
                currSum += nums[i]; // then add
                s.add(nums[i]);

                if(i-begin +1 == k){  // if three elements in sub arr 
                    maxSum = Math.max(maxSum,currSum); // then find maxSum
                    currSum = currSum-nums[begin];
                    s.remove(nums[begin]); // remove a element from front of set 
                    begin++;
                }
            }else{      // if duplicate present means comes to this section 
                while(nums[i] != nums[begin]){  // skip that element and remove from set from front 
                    currSum = currSum-nums[begin];
                    s.remove(nums[begin]);
                    begin++;
                }
                begin++;  // if duplicates present continuosly skip this 
            }
        }
        return maxSum;
    }
}
