// Reverse a Number :




public class Main
{
    
     static int sum = 0;
	public static void reverse(int n){
	    if(n == 0){
	        return ;
	    }
	    int rem = n%10;
        sum = sum *10 + rem;
	   reverse(n/10);

	}
	
	public static void main(String[] args) {
	    
	   reverse(1234);
	   System.out.println(sum);
       
	}
  
}

// Palindrom or not :



public class Main
{
	
	public static void main(String[] args) {
	    System.out.println(isPanlindrome(2112112));
	    
       
	}
	public static boolean isPanlindrome(int n){
	    return n == reverse(n,0);
	}
	public static int reverse(int n , int res){
	    if(n == 0){
	        return res;
	    }
	    return reverse(n/10, res * 10 + n%10 );
	}
  
}
