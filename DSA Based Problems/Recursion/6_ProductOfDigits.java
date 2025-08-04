// Products of digits 



public class Main
{
	public static void main(String[] args) {
	    
	   System.out.println(func(1232));
       
	}
	public static int func(int n){
	    if(n%10 == n){
	        return n;
	    }
	    return func(n/10) * ( n % 10 );

	}
}
