//Bubble sort 
/* 

* In bubble sort , it has n pass to sort an unsorted array.
* In  1st pass  we get a largest number and each pass we get other largest numbers that is minimum of largest number .
* And finally got a sorted array.
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	           //    0 1 2 3  4 5 
	    int[] arr = {3,5,2,6,-1,7};
	    bubbleSort(arr);
	    System.out.println("arr is "+Arrays.toString(arr));
	}
	static void bubbleSort(int[] arr){
	     boolean swapped;

	    for(int i=0;i<arr.length;i++){
	        swapped = false;
	     for(int j=1;j<arr.length-i;j++){
	         if(arr[j]<arr[j-1]){
	             int temp = arr[j];
	             arr[j] = arr[j-1];
	             arr[j-1] = temp;
	             swapped = true;
	         }
	         
	     } 
	     if(!swapped){ // To break this inner 'for' loop bcz that given is sorted array and prevent unwanted iteration.
	         break;
	     }
	     
	    }
	}
}
