// 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold - Medium - Leetcode

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int avg = 0;
        int count = 0;
        for(int i = 0;i<k;i++){
           sum = sum +arr[i];
        }
        avg = sum/k;
        if(avg>=threshold){
            count++;
          }
        for(int j = k;j<arr.length;j++){
            
            sum = sum + arr[j]-arr[j-k];
            avg = sum/k;
            if(avg>=threshold){
            count++;
          }
          
        }
        return count;
    }
}
