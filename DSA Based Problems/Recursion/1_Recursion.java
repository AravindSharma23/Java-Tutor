
//Fibonnaci Series using Recursion

/*
Explanation :

Fib(0) -> 0
Fib(1) -> 1 
Fib(2) -> Fib(1) + Fib(0) -> 1 + 0 = 1
Fib(3) -> Fib(2) + Fib(1) -> 1 + 1 = 2
Fib(4) -> Fib(3) + Fib(2) -> 2 + 1 = 3 -> Final answer

*/

public class Main
{
	public static void main(String[] args) {
	    int n = 4; 
	    System.out.print(fib(n));
	}
	static int  fib(int n){
	    if(n<2){
	        return n;
	    }
	    return fib(n-1)+fib(n-2);
	}
}

// o/p -> 3

