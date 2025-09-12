// Subsequences with ASCII values

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String s = "abc";
	   System.out.println(subSequenceWithASCII("",s));
	}
	static ArrayList<String> subSequenceWithASCII(String p , String up){
	    if(up.isEmpty()){
	        ArrayList <String> list = new ArrayList<>();
	        list.add(p);
	        return list;
	    }
	    char ch = up.charAt(0);
	    
	   ArrayList<String> left =  subSequenceWithASCII(p+ch,up.substring(1)); // Taking some elements
       ArrayList<String> right = subSequenceWithASCII(p,up.substring(1)); //  removing some elements
       ArrayList<String> third = subSequenceWithASCII(p+(ch+0) , up.substring(1));
    //   System.out.println(left);
       left.addAll(right);
       left.addAll(third);
       return left;
	}
	
}
