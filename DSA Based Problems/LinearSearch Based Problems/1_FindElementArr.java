// To search for  target element in an array and return its index :

import java.util.*;
class Main{
    public static void main(String[] args){
      int[] arr = {23,44,52,67,33,54,6,8};
      int target = 3;
      System.out.print("Result is "+linearSearch(arr,target));
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]== target){
                return i; // return its index
            }
        }
        return -1; // not exist means return -1
    }
}
