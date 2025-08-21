// Skip a string  using recursion



public class Main
{
	public static void main(String[] args) {
	    String s = "greenapple";
	    System.out.println(skipString(s));
	}
	static String skipString(String up){
	    if(up.isEmpty()){
	        return "";
	    }
	    //char ch = up.charAt(0);
	    if(up.startsWith("apple")){
	        return skipString(up.substring(5)); // skips apple if exist
	    }else{
	        return up.charAt(0) + skipString(up.substring(1));
	    }
	}
}
