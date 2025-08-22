// Return Arraylist of string 

// These are subsequences of string 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String s = "abc";
	   System.out.println(subSequence("",s));
	}
	static ArrayList<String> subSequence(String p , String up){
	    if(up.isEmpty()){
	        ArrayList <String> list = new ArrayList<>();
	        list.add(p);
	        return list;
	    }
	    char ch = up.charAt(0);
	    
	   ArrayList<String> left =  subSequence(p+ch,up.substring(1)); // Taking some elements
       ArrayList<String> right = subSequence(p,up.substring(1)); //  removing some elements
       
       left.addAll(right);
       return left;
	}
	
}

