// Second Maximum value in array:

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	int[] arr = {13,34,2,34,33,1};
	System.out.println("Second max val is "+secondMaxVal(arr));
	}
	static int secondMaxVal(int[] arr){
	    int max = Integer.MIN_VALUE;
	    int secondMax = Integer.MIN_VALUE;
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]>max){
	            secondMax = max;
	            max = arr[i];
	        }else if(arr[i] > secondMax && arr[i] != max){ // To avoid duplicate max value and store it in secondMax.
	            secondMax = arr[i];
	        }
	    }
	    return secondMax;
	}
}

