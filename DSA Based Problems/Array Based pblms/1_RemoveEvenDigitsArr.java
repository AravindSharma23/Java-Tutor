// Remove even digits elements in array
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	int[] arr = {90,75,18,12,6,4,3,1}; 
    int[] ans = removeEvenIntegers(arr);
    System.out.print("Result is "+Arrays.toString(ans));
	}
	static int[] removeEvenIntegers(int[] arr){
	    int unevenCount = 0;
	    for(int i = 0;i<arr.length;i++){
	        
	        if(arr[i]%2 != 0){
	            unevenCount++;
	        }
	    }
	   
	    int[] resArr = new int[unevenCount];
	    int index = 0;
	    for(int i=0;i<arr.length;i++){
	      
	        if(arr[i]%2 != 0){
	           
	            resArr[index] = arr[i];
	            index++;
	        }
	        
	    }
	    return resArr;
	    }
     }
	

