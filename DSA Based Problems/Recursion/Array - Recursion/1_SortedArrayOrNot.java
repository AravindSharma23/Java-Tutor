// Sorted Array or not ? 



public class Main
{
	
	public static void main(String[] args) {
	    int[] arr ={1,-1,5,8,11,15};
	    System.out.println(isSorted(arr,0));
	    
       
	}

	public static boolean isSorted(int[] arr , int index){
	    
	    if(arr.length -1 == index){
	        return true;
	    }
	    return arr[index] < arr[index+1] && isSorted(arr,index+1);
	    
}
  
}
