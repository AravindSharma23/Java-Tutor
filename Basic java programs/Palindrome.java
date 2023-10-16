import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();
	  int temp = num;
	  int res = 0; 
	 while(temp>0){
	     int rem = temp%10;
	     res = res*10+rem;
	     temp = temp/10;
	 }
// 	 System.out.println("Result is "+res);
	if(res == num){
	    System.out.println("Palindrome");
	}
	else{
	    System.out.println("Not a Palindrome");
	}

	}
}
