// Find Zero occurences  in a number

public class Main
{
	
	public static void main(String[] args) {
	    System.out.println(findZeros(200,0));
	    
       
	}

	public static int findZeros(int n , int count){
	    
	    if(n == 0){
	        return count;
	    }
	    int rem = n%10;
	    if(rem == 0){
	        return findZeros(n/10,count+1);
	    }
	    return findZeros(n/10,count);
	    
	    
	}
  
}
