// Second Largest - Easy


class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
               secondMax = max;
               max = arr[i];
            }
            if(max != arr[i] && secondMax<arr[i]){ // avoid duplicates
                secondMax = arr[i];
            }
        }
        if(secondMax>0){   // if second largest is found  
            return secondMax;
        }
        return -1;
    }
}
