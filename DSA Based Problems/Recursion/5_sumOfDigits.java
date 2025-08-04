// Sum of digits 



public class Main
{
	public static void main(String[] args) {
	    
	   System.out.println(func(1232));
       
	}
	public static int func(int n){
	    if(n <= 1){
	        return 1;
	    }
	    return func(n/10) + n % 10 ;

	}
}
