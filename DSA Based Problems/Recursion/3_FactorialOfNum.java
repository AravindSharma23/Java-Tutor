// Factorial of number 




public class Main
{
	public static void main(String[] args) {
	    
	   System.out.println(func(5));
       
	}
	public static int func(int n){
	    if(n <= 1){
	        return 1;
	    }
	    return n * func(n-1); // 5 * f(4) * f(3) * f(2) * f(1) -> 5 * 4 * 3 * 2 * 1

	}
}
