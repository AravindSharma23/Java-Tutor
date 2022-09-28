import java.util.*;
public class Main{
    public static void main(String args[])
    {
        for(int i=100;i<=999;i++){
           int temp=i,sum=0,rem;
           while(temp>0){
               rem=temp%10;
               sum=sum+rem*rem*rem;
               temp=temp/10;
               
           }
           if(sum == i){
               System.out.println("The Armstrong num is :" + i);
           }
           else{
               continue;
           }
           
        }
        
    }
}
