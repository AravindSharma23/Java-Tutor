// Prime Number or Not with Great time Complexity

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println(Prime(n));
	
	}
	static boolean Prime(int n){
	    
	    if(n<=1){
	        return false;
	    }
	    int c = 2;
	    while(c*c<=n){
	        if(n%c == 0){
	            return false;
	        } 
	        c++;
	    }
	    return c * c > n;
	}

    
}
