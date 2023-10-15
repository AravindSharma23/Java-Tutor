
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);       // Find occurence of Number 
		int n = 1385757879;
		int count = 0;
		
		while(n>0){
		    int rem = n%10;
		    if(rem == 8){
		        count++;
		    }
		     n = n/10;
		}
		
		System.out.println("count is "+count);

	}
}
