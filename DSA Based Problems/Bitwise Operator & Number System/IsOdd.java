
public class Main
{
	public static void main(String[] args) {
	    int n = 4; 
	    System.out.print(isOdd(n));
	}
	static String isOdd(int n){
	    if((n&1) == 1){
	        return "Odd";
	    }
	    return "Even";
	}
}
/* 
o/p : 
Even
*/
