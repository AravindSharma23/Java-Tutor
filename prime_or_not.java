import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        for(int i=2;i<n;i++ ){
            if(n%i == 0){
              count++;  
            }
        }
        if(count == 0){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}
