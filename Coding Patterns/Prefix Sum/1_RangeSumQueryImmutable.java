// Leetcode -> 303. Range Sum Query - Immutable - Easy 

// Brute force 
class NumArray {
     int[] nums;
    public NumArray(int[] nums) {
       this.nums=nums;
    }
    
    public int sumRange(int left, int right) {
        int tot = 0;
        for(int i=left;i<=right;i++){
            tot+=nums[i];
        }
        return tot;
    }
}







// Optimized solution
class NumArray {
     int[] prefix;
    public NumArray(int[] nums) {
        prefix = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }
}
