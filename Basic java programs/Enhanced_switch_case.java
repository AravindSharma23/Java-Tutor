// Enhanced Switch case 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String color = sc.next().trim();
	    switch (color){
	        case "red" -> System.out.println("You are entered Red Color");
	        case "yellow" -> System.out.println("You are entered Yellow Color");
	        case "orange" -> System.out.println("You are entered Orange Color");
	        case "green" -> System.out.println("You are entered Green Color");   // and can add mutiple values in case 
	        default -> System.out.println("Out of colorslist");                   // like "green","pink","blue"
	    }

	}
}
