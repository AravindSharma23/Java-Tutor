// 167. Two Sum II - Input Array Is Sorted - leetcode - medium

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        while(left<= right){
            int sum = numbers[left] + numbers[right];

            if(sum == target){
                return new int[] {left+1,right+1};
            }
            if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{0,0};
      
    //     int n = numbers.length;
	 
	//    HashMap<Integer,Integer> map = new HashMap<>();
	//    for(int i = 0;i<n;i++){
	//        int val = target-numbers[i];
	       
	//        if(map.containsKey(val)){
	//             return new int[] {map.get(val)+1,i+1};
	//        }
	//        map.put(numbers[i],i);
	//    }
    //    return new int[] {0,0};
     }
}
