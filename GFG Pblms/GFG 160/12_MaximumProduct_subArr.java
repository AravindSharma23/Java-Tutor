// Maximum Product Subarray - Medium - Morgan Stanley , Amazon , Microsoft , OYO Rooms , D-E-Shaw , Google

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {-2 ,6 ,-3 ,-10, 0 ,2};
	    int res = arr[0];
	    int n = arr.length;
	    int leftProduct = 1;
	    int rightProduct = 1;
	    for(int i=0;i<arr.length;i++){
	       leftProduct = leftProduct == 0 ? 1 : leftProduct;
	       rightProduct = rightProduct == 0 ? 1 : rightProduct;
	       
	       leftProduct *= arr[i];
	       rightProduct *= arr[n-1-i];
	       res =  Math.max(res,Math.max(leftProduct,rightProduct));

	    }
       System.out.println("res "+res);

	}
}
