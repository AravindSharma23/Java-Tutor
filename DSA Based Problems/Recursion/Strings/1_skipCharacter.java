// Skip a character using recursion



import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String s = "baccah";
	   // skip("",s);
	   System.out.println(skippedString("aravind"));
	}
	static void skip(String p , String up){
	    if(up.isEmpty()){
	        System.out.println("Processed string : "+p);
	        return;
	    }
	    char ch = up.charAt(0);
	    if(ch == 'a'){
	        skip(p,up.substring(1));
	    }else{
	        skip(p+ch,up.substring(1));

	    }
	}
	static String skippedString(String up){
	    if(up.isEmpty()){
	        return "";
	    }
	    char ch = up.charAt(0);
	    
	    if(ch == 'a'){
	       return  skippedString(up.substring(1));
	    }else{
	       return ch + skippedString(up.substring(1));
	    }
	}
}
