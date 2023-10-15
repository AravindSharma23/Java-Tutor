// Fibonacci Series 


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0; // count = 0
		int b = 1; // count = 1
		int count = 2;
		while(count<=n){
		   
		   int temp = b;
		   b = a+b;
		   a = temp;
		   count ++;
		   
		}
		
		System.out.println("Fibanacci Number "+b);
// 		System.out.println("Count is "+count);
	}
}
