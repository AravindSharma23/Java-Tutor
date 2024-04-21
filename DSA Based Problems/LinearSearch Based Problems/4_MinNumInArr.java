
// Find Minimum value in array 

import java.util.*;
class Main{
    public static void main(String[] args){
    int[] arr = {-3,4,8,-2,-6,13,1};
    
    System.out.print("Min num is "+MinimumNum(arr));

    }
    static int MinimumNum(int[] arr){
        int minVal = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<minVal){
                minVal = arr[i];
            }
        }
        return minVal;
    }
}
