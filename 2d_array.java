import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][]=new int[n][n];
        for(int row=0;row<n;row++){
            for(int col =0;col<arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }
            
        }
    
         
    for(int row=0;row<n;row++){
        for(int col=0;col<arr[row].length;col++){
        System.out.print(arr[row][col]+" ");
        }
    
    System.out.println();
	    
	}
	
	/*
	for(int row=0;row<arr.length;row++){
	    System.out.print(Arrays.toString(arr[row]));
	}
	*/
    /*
	for(int[] a:arr){ // Enhanced for loop
	    System.out.println(Arrays.toString(a));
	}
        */
    }
}
