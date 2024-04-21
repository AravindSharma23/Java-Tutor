

// Search for an element in a range
import java.util.*;
class Main{
    public static void main(String[] args){
    int[] arr = {18,23,35,66,71,9,56,7};
    int target = 66;
    int start = 1;
    int end = 4;
    
    System.out.println("Result is "+findElement(arr,start,end,target));

    }
    static boolean findElement(int[] arr, int start,int end,int target){
        for(int i=start;i<=end;i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
