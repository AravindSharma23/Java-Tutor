// Minimize the Heights II - Medium - Microsoft,Adobe




import java.util.*;
public class Main
{
	public static void main(String[] args) {
    //int[] arr = {1, 5, 8, 10};
    //int k = 2;
    int[] arr = {3, 9, 12, 16, 20};
    int k = 3;
    System.out.println(minimumDiff(arr,k));
	}
	static int minimumDiff(int[] arr,int k){
	    // sort an array if its not sorted 
	    int n = arr.length;//4
	    int ans = arr[n-1] - arr[0]; // 9

	    int smallest = arr[0]+k; // 1st element 
	    int largest = arr[n-1]-k; // last element
	    int min , max;
	    for(int i=0;i<n-1;i++){
	        min = Math.min(smallest,arr[i+1]-k);
	        max = Math.max(largest,arr[i]+k);
	       if(min<0){
	           continue; // skip the negative element
	       }
	        ans = Math.min(ans,max-min);
	    }
	    return ans;
	}
	}

