public class Main
{
	public static void main(String[] args) {
	String a = "Aravind kumar";
	String b= "Hello world";
	System.out.println("Upper case :"+a.toUpperCase());
	System.out.println("Lower case :"+a.toLowerCase());
	System.out.println("To check the starting of string :"+a.startsWith("Ar"));
	System.out.println("To check the ending of string: "+b.endsWith("ld"));
	System.out.println("To check null or not"+a.isEmpty());
	System.out.println("To get characters as prefered:"+a.charAt(0));
	System.out.println("To replace :"+a.replace("Aravind","Arun"));
	System.out.println("Substring :"+a.substring(0,5));
	
	}
}

