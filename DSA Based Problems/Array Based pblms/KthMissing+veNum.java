// leetcode - 1539 -->  Kth Missing Positive Number - easy


class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 0;
        int j=1;
        while(i<arr.length && k>1){ // finding missing num in between arr elements
           if(arr[i] == j){
            i++;
            j++;
           }else{
            j++;
            k--;
           }
        }
       while(k>1){ // Finding missing nums based on k for a unmissing arr elements
        j++;
        k--;
       }
       return j; 
    }
}
