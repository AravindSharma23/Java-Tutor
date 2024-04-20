
// To find maximum value in array

import java.util.*;
class Main{
    public static void main(String[] args){
       int[] arr = {23,64,99,71,18,13,20};
       System.out.println("Maximum element is "+maxElement(arr));
       System.out.println("Maximum numbers in a range "+maxRange(arr,1,5));
       
    }
   static int maxElement(int[] arr){ // To find maxmimum value in array
       int maxVal = arr[0];
       for(int i=1;i<arr.length;i++){
           if(arr[i]>maxVal){
               maxVal = arr[i];
           }
       }
       return maxVal;
   }
   static int maxRange(int[] arr, int start, int end){ // To find maxmimum value in array within a range
       int max = arr[start];
       for(int i=start+1;i<=end;i++){
           
           if(arr[i] > max){
               max = arr[i];
           }
       }
       return max;
   }
}
