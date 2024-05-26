// Problem no: 852 - Medium  -> Peak Index in mountain Array 


class Solution {
    public int peakIndexInMountainArray(int[] arr) { 
      // Its biotonic arr, bcz it has both increasing part and decreasing part
       int start = 0;
       int end = arr.length-1;
       while(start < end){
        int mid = start+(end-start)/2;
        if(arr[mid]>arr[mid+1]){ //  its a decreasing part 
            end = mid;
        }else{   // arr[mid]<arr[mid+1]
            start = mid+1; // Its a increasing part
        }
       } // this loop breaks when start and end having equal index 
       return start; // return start or end bcz both are equal so the while loop breaks
    }
}

