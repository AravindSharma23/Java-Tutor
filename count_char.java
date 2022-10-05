import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int upper =0,lower=0,space=0,vowels=0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)>=65 && str.charAt(i)<=90){
                upper++; 
            }
            if (str.charAt(i)>=97 && str.charAt(i)<=122){
                lower++;
            }
            if (str.charAt(i) == 32){
                space++;
                
            }
            if (str.charAt(i) == 'A' || str.charAt(i) =='E'|| str.charAt(i) =='I'||str.charAt(i) =='O'||str.charAt(i) =='U' ||str.charAt(i) == 'a'||str.charAt(i) =='e'||str.charAt(i) =='i'||str.charAt(i) =='o'||str.charAt(i) =='u'){
                vowels++;
            }
        }
        System.out.println("UPPER :"+upper);
        System.out.println("LOWER :"+lower);
        System.out.println("SPACE :"+space);
        System.out.println("VOWELS :"+vowels);
       
    }
}
