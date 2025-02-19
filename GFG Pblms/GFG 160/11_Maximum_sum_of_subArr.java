// Maximum sum of sub array or kadanes algorithm  - Medium - Zoho , Flipkart , Morgan Stanley , Accolite, Amazon , Microsoft , Samsung , Snapdeal , 24*7 Innovation Labs , Citrix , D-E-ShawFactSetHikeHousing.comMetLife , Ola Cabs , Oracle , PayuTeradata , Visa , Walmart , Adobe , Google , Arcesium
// refer yt -  algo thamizha
class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]+sum<0){ // if adding  curr element with sum less than 0 means 
                sum = 0;
                continue;
            }else{
                sum = sum+arr[j];
                max = Math.max(max,sum);
            }
        }
        return max;
    }
}
