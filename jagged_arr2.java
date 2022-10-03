import java.util.*;
class Main{
    public static void main(String args[]){
        int arr[][] = {
            {10,20,30},   // jagged array
            {40,50,60,70,80},
            {90,100,110,120,130,140}
        };
        for(int k[]:arr){  // To store each value from arr to K.
            for(int l:k){  // To access elements in k using l.
                System.out.print(" "+l);
            }
            System.out.println("");
        }
    }
}
