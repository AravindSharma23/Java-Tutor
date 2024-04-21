// To find specific character is found or not in a string


import java.util.*;
class Main{
    public static void main(String[] args){
     String name = "Aravind";
     char target = 'd';
     System.out.println("Result is "+Search(name,target));
     System.out.print("Result2 is "+Search2(name,target));

    }
    static boolean Search(String name, char target){
        if(name.length() == 0){
            return false;
        }
        for(int i=0;i<name.length();i++){
            if(name.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
    
    static boolean Search2(String name, char target){ // using enhanced for loop 
         if(name.length() == 0){
            return false;
        }
        for(char n : name.toCharArray()){
            if (n == target){
                return true;
            }
        }
        return false;
    }
    
}
