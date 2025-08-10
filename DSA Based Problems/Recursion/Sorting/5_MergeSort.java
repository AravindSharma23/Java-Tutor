//

import java.util.*;

/*
Merge Sort :

step1 -> Divide the array into two halfs
step2 -> Sort them via recursion
step3 -> merge it into a new array
 

*/
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {5,4,3,2,1};
	   int[] ans =  mergeSort(arr);
	   System.out.println(Arrays.toString(ans));
	    
	}
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        
        return merge(left,right); 
    }
    static int[] merge(int[] first,int[] second){
        int[] mix = new int[first.length+second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // We can add remaining elements if exist in first or second array.
        while(i<first.length){
            mix[k] = first[i];
            i++;

            k++;
        }
        while(j<second.length){
            mix[k] = second[j];
            j++;

            k++;
        }
        return mix;
    }
}
