// Leetcode -> 852 -> Easy 
//Peak Index in a Mountain Array or 162. Find Peak Element - medium // 

import java.util.*;

class Main{
    public static void main(String[] args){
        int[] arr = {1,2,3,5,6,4,3,2};
        System.out.println("Ans "+peakIndex(arr));
        
    }
    static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start; // start or end
    }
}
