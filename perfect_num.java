import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int tot=0;
        for(int i=1;i<n;i++){
            if(n%i == 0){
              tot=tot+i;
            }
        }
       
         if(tot == n){
             System.out.println("Prefect number");
        }
         else{
            System.out.println("Not a perfect number");
         }
    }
}
