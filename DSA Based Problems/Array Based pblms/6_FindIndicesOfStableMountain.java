//  Leetcode - 3285.-> Find Indices of Stable Mountains - Easy

/*  
We need to find all mountains such that the previous mountain's height is strictly greater than a given threshold. 
Index 0 is excluded because it doesn't have a previous mountain.
We use a simple for loop starting from index 1.
*/

class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<height.length;i++){
            if(height[i-1]>threshold){
                res.add(i);
            }
        }
        return res;
    }
}
