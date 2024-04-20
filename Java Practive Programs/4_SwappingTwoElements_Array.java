
// Swapping two elements in an array 

import java.util.*;
class Main{
    public static void main(String[] args){
       int[] arr = {23,64,99,71,18,13,20};
       System.out.println("Before swapping"+Arrays.toString(arr));

       swap(arr,1,3);
       
       System.out.println("After swapping"+Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1, int index2){
       int temp = arr[index1];
       arr[index1] = arr[index2];
       arr[index2] = temp;
    }
}
