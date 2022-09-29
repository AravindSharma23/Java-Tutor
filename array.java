import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int o=0,e=0;
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int a=0;a<n;a++){
            arr[a] =sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2 == 0){
                e++;
            }
            else{
                o++;
            }
            
        }
        System.out.println("ODD :" +o);
        System.out.println("EVEN :" +e);
    }
}
