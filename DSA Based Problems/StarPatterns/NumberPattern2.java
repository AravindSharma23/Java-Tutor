import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    int n=5;
       for(int i=1;i<=n;i++){
         for(int space=0;space<n-i;space++){
             System.out.print("  ");
         }  
         for(int reverse=i;reverse>1;reverse--){
                 System.out.print(reverse+" ");

         }
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }

           
           
           System.out.println();
       }
	}
 }

/*
o/p :

        1 
      2 1 2 
    3 2 1 2 3 
  4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5 


*/
