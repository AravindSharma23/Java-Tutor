// Leetcode -> - 1095 - Hard
//Find in Mountain Array 

/* 
Step1 : Find Peak element (refer Find Peak Index in Mountain Array)
Step2 : Find minimum and maximum index of target using orderAgnostic 

*/

import java.util.*;

class Main{
    public static void main(String[] args){
     int[] arr = {1,2,3,4,5,3,1};
     int target = 3;
     int peakElement = findPeak(arr);
     System.out.println("peak "+peakElement);
     int orderAgnostic = orderAgnosticFunction(arr,0,peakElement,target);
     if(orderAgnostic != -1){
         //return orderAgnostic;
         System.out.println("orderAgnostic "+orderAgnostic); // returns minimum index of target element
     }else{
         System.out.println(" 2nd orderAgnostic "+orderAgnosticFunction(arr,peakElement+1,arr.length-1,target));
         //returns maximum index of target element
     }
       // return orderAgnosticFunction(arr,peakElement+1,arr.length-1,target);
    }
    static int findPeak(int[] arr){ // step1 -  To find peak element
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start = mid+1;
            }
        }
        return start; // reutrn start or end , both are same value.
    }
   static int orderAgnosticFunction(int[] arr,int start,int end,int target){ // step2 - 
       boolean isAsc = arr[0] < arr[arr.length-1];
       while(start<=end){
           int mid = start+(end-start)/2;
           if(arr[mid] == target){
               return mid;
           }
           if(isAsc){
               if(arr[mid] > target){
                   end = mid-1;
               }else{
                   start = mid+1;
               }
           }else{
                if(arr[mid] > target){
                   end = mid+1;
               }else{
                   start = mid-1;
               }
           }
           
       }
       return -1;
   }
}
