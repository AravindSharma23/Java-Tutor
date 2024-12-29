import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    int n=5;
       for(int i=1;i<=n*2;i++){
         int totalCol = i>n ? 2*n-i : i;
         int noOfSpaces = n-totalCol; 
         for(int space=0;space<noOfSpaces;space++){
             System.out.print(" ");
         }
        for(int j=1;j<=totalCol;j++){
            System.out.print("* ");
        }

           
           
           System.out.println();
       }
	}
 }

/*

    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 

*/
