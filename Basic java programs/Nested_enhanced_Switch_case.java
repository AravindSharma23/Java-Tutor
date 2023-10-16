
//Nested Enhanced Switch case
import java.util.*;

public class Main {
    public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
	    int empId = sc.nextInt();
	    String dept = sc.next();
	    switch (empId){
	        case 1 -> System.out.println("empId is 1");
	        case 2 -> System.out.println("empId is 2");
	        case 3 -> {
	            System.out.println("empId is 3");
	            switch(dept){
	                case "IT" ->System.out.println("IT Department");
	                case "Infra" ->System.out.println("Infra Department");
	                case "Security" ->System.out.println("Security Department");
	            }
	        }
	        case 4 -> System.out.println("You are entered Green Color");
	        default -> System.out.println("Out of colorslist");
	    }
  }
}
