import java.util.*;
class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num,temp,sum=0,rem;
        num = sc.nextInt();
        temp=num;
       while(num>0){
           rem = num%10;
           sum=sum*10+rem;
          
           num = num/10;
       }
       if(sum == temp){
           System.out.println("Palindrome");
       }
       else{
           System.out.println("NOt a Palindrome");
       }
    }
}
