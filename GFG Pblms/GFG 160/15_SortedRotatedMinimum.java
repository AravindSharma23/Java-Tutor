// Search -> Day29 Sorted and Rotated Minimum  - Easy

class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        int res;
        int i=0;
        if(arr[0]>arr[arr.length-1]){
            while(true){
               if( arr[i] < arr[i+1]){
                   i++;
               }else{
                   res = arr[i+1];
                   break;
               }
            }
            
        }else{
            res = arr[0];
        }
       
           return res;
    }
}
