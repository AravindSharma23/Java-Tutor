//

/*
 step1 - match with index(order the elements)
 step2 - find smallest missing +ve num
*/


class Solution {
    // Function to find the smallest positive number missing from the array. - medium 
    public int missingNumber(int[] arr) {
        // Your code here
        int i= 0;
        int n = arr.length;
        while(i<n){
            int ele = arr[i];
            int idx = arr[i]-1;
            if(idx >= 0 && idx<n){ // to avoid -ve index value 
              if(arr[idx] != arr[i]){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                continue;
              }
            }
            i++;
        }
        
        for(int j=0;j<arr.length;j++){
            if(arr[j] != j+1){
                return j+1;
            }
        }
          return n+1;

    }   
    
}
