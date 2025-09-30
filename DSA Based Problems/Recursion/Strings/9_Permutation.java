// Permutation using recursion in string


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  permutation("","abc");
	}
	static void permutation(String p,String up){
	    if(up.isEmpty()){
	        System.out.println("Processed is "+p);
	        return;
	    }
	    char ch = up.charAt(0);
	    for(int i = 0;i<=p.length();i++){
	        String f = p.substring(0,i);
	        String s = p.substring(i,p.length());
	        System.out.println("f "+f);
	        System.out.println("s "+s);
	        
	        permutation(f+ch+s,up.substring(1));
	    }
	}
}

// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) {
// 	    String s = "abc";
// 	  permutation(s.toCharArray(),0);
// 	}
// 	static void swap(char[] arr,int i , int fi){
// 	    char temp = arr[i];
// 	    arr[i] = arr[fi];
// 	    arr[fi] = temp;
	    
// 	}
// 	static void permutation(char[] arr,int fi){
// 	   if(fi == arr.length-1){
// 	       System.out.println(Arrays.toString(arr));
// 	       return;
// 	   }
// 	   for(int i = fi;i<arr.length;i++){
// 	       //System.out.println(fi);
// 	       swap(arr,i,fi);
// 	       permutation(arr,fi+1);
// 	       swap(arr,i,fi);

// 	   }
// 	}
}
