// Sum of N numbers 



public class Main
{
	public static void main(String[] args) {
	    
	   System.out.println(func(5));
       
	}
	public static int func(int n){
	    if(n <= 1){
	        return 1;
	    }
	    return n + func(n-1);

	}
}
