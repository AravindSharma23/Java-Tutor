// 581. Shortest Unsorted Continuous Subarray - leetcode - medium

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low+1 < n && nums[low] <= nums[low+1]){ // find starting point of unsorted arr
            low++;
        }
        while(high-1 >=0 && nums[high]>= nums[high-1]){ // find ending point of unsorted arr
            high--;
        }
        if(low == n-1){ // if input arr is sorted means 
            return 0;
        }
        int wmin = Integer.MAX_VALUE;
        int wmax = Integer.MIN_VALUE;
        for(int i = low;i<=high;i++){ // finding min and max ele in unsorted arr
            wmin = Math.min(wmin,nums[i]);
            wmax = Math.max(wmax,nums[i]);
            
        }
        while(low-1 >= 0 && nums[low-1] > wmin){ // find exact starting idx for unsorted to sort it
            low--; // skip greater ele than wmin and if any min val is found means it should be inside unsorted if we try to sort it . Get idx range
        }
        while(high+1 < n && nums[high+1] < wmax){// find exact ending idx for unsorted to sort it
            high++; // skip smaller ele than wmax and if any min val is found means it should be inside unsorted if we try to sort it 
        }
        return high-low+1; // to find length of unsorted arr
    }
}
