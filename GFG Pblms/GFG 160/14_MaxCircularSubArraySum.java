// Max Circular Subarray Sum - Hard

class Solution {
    public int circularSubarraySum(int arr[]) {
        // code here
       int maxSoFar = 0;
       int minSoFar = 0;
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
       int total = 0;
       
       for(int a : arr){
           maxSoFar+=a;
           minSoFar +=a;
           max = Math.max(max,maxSoFar);
           min = Math.min(min,minSoFar);
           total+=a;
           
           if(maxSoFar <0){
               maxSoFar = 0;
           }
           
           if(minSoFar >0){
               minSoFar = 0;
           }
           
       }
       return Math.max(total-min,max);
        
    }
    
}
