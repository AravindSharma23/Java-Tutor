// String -> Subsequence
// Array -> Subset


/*
Subset pattern :
    Taking some elements or removing some elements is known as subset pattern.
*/
public class Main
{
	public static void main(String[] args) {
	    String s = "abc";
	    subSequence("",s);
	}
	static void subSequence(String p , String up){
	    if(up.isEmpty()){
	        System.out.println("Processed String is :"+p);
	        return;
	    }
	    char ch = up.charAt(0);
	    
	    subSequence(p+ch,up.substring(1)); // Taking some elements
        subSequence(p,up.substring(1)); //  removing some elements
	}
	
}
