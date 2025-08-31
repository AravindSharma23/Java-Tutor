//Maximum average subarray - GFG - Important - Easy

// User function Template for Java

class Solution {
    int findMaxAverage(int[] arr, int n, int k) {
        // code here
       // long maxAvg = 0;
        int windowSum = 0;
        int maxSum = 0;
       // long avg = 0;
        int startInd = 0;
        for(int i = 0;i<k;i++){
            windowSum = windowSum+arr[i];
        }
        maxSum = windowSum;
       // avg = windowSum/k;
       // maxAvg = avg;
        for(int i = k;i<n;i++){
            windowSum = windowSum+arr[i]-arr[i-k];
           // avg = windowSum/k;
            if(windowSum > maxSum){
                 startInd = i-k +1;
                 //maxAvg = avg;
                 maxSum = windowSum;
            }
            
        }
        return startInd;
    }
}
