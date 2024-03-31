// Alphabet case Checker


import java.util.*;

public class Main
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  char letter = sc.next().trim().charAt(0);
	  if(letter >= 'a' && letter <= 'z'){
	      System.out.print("Lower");
	  }else{
	      System.out.print("Upper");
	  }
	  
	}
}
