//Adding values to the expected index and the elements are moving one step.
//Eg :a[]={23,11,15,31,2,3,17,29,19,66} <--- original Arrays
// o/p Array:{23,11,15,31,100,2,3,17,29,19}

import java.util.*;
class Main{
    public static void main(String args[]){
        int a[]={23,11,15,31,2,3,17,29,19,66};
        int idx=4;
        int val = 100;
        for(int i=a.length-1;i<idx;i--){
            a[i]=a[i-1];
        }
        a[idx]=val;
        System.out.println(Arrays.toString(a));
        
        
    }
}
