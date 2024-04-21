// To find a target element's index position in 2d array

import java.util.*;
class Main{
    public static void main(String[] args){
    int[][] arr ={
        {23,4,1},
        {18,12,3,9},
        {78,99,34,56},
        {18,12}
    };
    int target = 56;
    System.out.print("Result is  "+Arrays.toString(Search(arr,target)));
    
    }
    
    static int[] Search(int[][] arr, int target){
        
        for(int row = 0; row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                if(arr[row][col] == target){  // To return index as array so need to initialize it like below
                    return new int[]{row,col}; // To get index of target value
                }
            }
        }
        return  new int[] {-1,-1};
        
    }
    
}
