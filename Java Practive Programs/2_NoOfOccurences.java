// No of Occurences of a number :


import java.util.*;

public class Main
{
	public static void main(String[] args) {
	  int num = 12342423;
	  int count = 0;
	  while(num > 0){
	      int rem = num % 10;
	      if(rem == 2){
	          count ++;
	        }
	      num = num/10;
	  }
	  
	  System.out.print("No of Occurences:"+count);
	}
}
