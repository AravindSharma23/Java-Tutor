// Decrementing - passing numbers 



public class Main
{
	public static void main(String[] args) {
	    
	   System.out.println(func(1232));
       
	}
	public static void func(int n){
	    if(n == 0){
	        return ;
	    }
	    func(--n);
      // if pos decrement leads error so we used pre decrement 

	}
}
