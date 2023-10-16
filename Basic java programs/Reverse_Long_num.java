// Reverse a long number 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = 8681910607L;  
	    long res = 0;
		
		while(n>0){
		    long rem = n%10;
		    n = n/10;
		    res = res*10+rem;
		}
		
		System.out.println("sum is "+res);

	}
}
