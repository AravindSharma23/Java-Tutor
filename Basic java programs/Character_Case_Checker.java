import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char letter = sc.next().charAt(0);
		if(letter >= 'a' && letter <= 'z'){
		    System.out.print("It's Lowercase");
		}else{
		    System.out.print("It's Uppercase");
		}
		
	}
}
