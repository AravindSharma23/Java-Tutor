 // Find power of number 
 // Divider and conquer method ->  fast exponentiation
 //Time complexity - Ologn
public class Main
{
	public static void main(String[] args) {
     System.out.println(power(2,5)); 
	}
	static int power(int x, int n){
	    if(n==0){
	        return 1;
	    }
	   int half = power(x,n/2);
	   if(n%2 == 0){
	       return half * half;
	   }else{
	       return x*half * half;
	   }
	}

}
