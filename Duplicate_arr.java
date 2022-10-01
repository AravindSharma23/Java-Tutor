import java.util.*;
class Main{
    public static void main(String args[]){
        int arr[] = {2,3,4,4,5,7,1,9,7,1};
        for(int i=0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i]+" ");
                }
                else{
                    continue;
                }
            }
        }
    }
}
