// Remove a string based on condition :



public class Main
{
	public static void main(String[] args) {
	    String s = "greenappred";
	    System.out.println(skipAppNotAppleString(s));
	}
	static String skipAppNotAppleString(String up){
	    if(up.isEmpty()){
	        return "";
	    }
	    //char ch = up.charAt(0);
	    if(up.startsWith("app") && !up.startsWith("apple")){
	        return skipAppNotAppleString(up.substring(3)); // skips apple if exist
	    }else{
	        return up.charAt(0) + skipAppNotAppleString(up.substring(1));
	    }
	}
}
