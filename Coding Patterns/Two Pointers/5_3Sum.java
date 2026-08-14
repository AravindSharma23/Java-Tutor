// Leetcode 15 -> 3 sum - Medium - Imp

class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        // if arr is null or less than 3(bcz triplet having 3 ele) means return empty list
        if(arr == null || arr.length <3) return new ArrayList<>();

        // sort it 1st
        Arrays.sort(arr); 

        // using set bcz we want unique triplets
        Set<List<Integer>> result = new HashSet<>(); 
        // Here i is fixed ele and add with two pointers
        for(int i = 0;i<arr.length-2;i++){ 
            int left = i+1;
            int right = arr.length-1;

            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];

                if(sum == 0){ // sum equals 0 means add into set
                   result.add(Arrays.asList(arr[i],arr[left],arr[right]));
                   left++;
                   right--;
                } else if(sum < 0){ 
                    left++; // if sum < 0 means so move to bigger so left++ 
                }else{
                    right--; // if sum > 0 means so move to lesser so right--
                }
            }
        }
        return new ArrayList<>(result);

    }
}
