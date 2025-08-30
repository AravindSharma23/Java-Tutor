// Max Sum Subarray of size K - GFG - important

 public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int maxSum = 0;
        int windowSum = 0;
         int n = arr.length;
        for(int i = 0;i<k;i++){
            windowSum = windowSum+arr[i];
        }
        maxSum = windowSum;
        
        for(int i = k;i<n;i++){
            windowSum = windowSum+arr[i]-arr[i-k];
            maxSum = Math.max(maxSum,windowSum);
        }
        return maxSum;
    }
