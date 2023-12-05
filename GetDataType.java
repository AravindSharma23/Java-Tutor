// To check values data type
import java.util.*;
public class Main{
    public static void main(String[] args){
    //   Scanner sc = new Scanner(System.in);
    //   System.out.print("Enter a float number : ");
    //   float deci = sc.nextFloat();
       int myInteger = 234;
       float myFloat = 23.345f;
       String myStr = "Happy Journey";
       char myChar = 'A';
      
       System.out.println("myInteger type is "+((Object)myInteger).getClass().getSimpleName());
       
       System.out.println("myFloat type is "+((Object)myFloat).getClass().getSimpleName());

       System.out.println("myStr type is "+ myStr.getClass().getSimpleName());

       System.out.println("myChar type is "+((Object)myChar).getClass().getSimpleName());

    }
}
