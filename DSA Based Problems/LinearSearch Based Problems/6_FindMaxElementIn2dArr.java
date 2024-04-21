// To find maximum value in 2d array


import java.util.*;
class Main{
    public static void main(String[] args){
    int[][] arr ={
        {23,4,1},
        {18,12,3,9},
        {78,99,34,56},
        {18,12}
    };

    System.out.print("Result is  "+Maximum(arr));
    System.out.print("Result of Enhanced for loop "+Maximum2(arr));
    
    }
    
    static int Maximum(int[][] arr){
        int maxVal = arr[0][0];
        for(int row = 0; row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                if(arr[row][col] > maxVal ){  
                   maxVal = arr[row][col];
                }
            }
        }
        return  maxVal;
        
    }
    
    static int Maximum2(int[][] arr){  // Using Enhanced for loop
        int maxVal = arr[0][0];
        for(int[] row : arr){
            for(int element : row){
                if(element > maxVal){
                    maxVal = element;
                }
            }
        }
        return maxVal;
    }
    
}
