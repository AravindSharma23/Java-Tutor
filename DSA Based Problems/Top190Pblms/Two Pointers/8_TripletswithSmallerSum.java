// Triplets with Smaller Sum - medium -gfg

class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
        Arrays.sort(arr);
        int count = 0;
        int n = arr.length;
        for(int i = 0;i<n-2;i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                int tot = arr[i]+arr[left]+arr[right];
                if(tot<sum){
                    count+=right-left; // within this range we found a smaller eles
                    left++;
                }else{
                    right--;
                }
            }
        }
        return count;
       
    }
}
