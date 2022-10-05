public class Main
{
	public static void main(String[] args) {
	StringBuffer a =new StringBuffer("Aravind kumar");
	a.insert(13," B.E");  // insert(target,value)
	System.out.println("After insertion:"+a);
	
	a.replace(13,17,"MBBS");        //replace(start,end,value)
	System.out.println("After replacement:"+a);
	
	a.delete(13,17);
	System.out.println("After Deletion:"+a);
	
    System.out.println("Total Length :"+a.length());
    
    System.out.println("To get specific  characters from string :"+a.charAt(3));
   
    System.out.println("Reverse of String "+a.reverse());
    
    System.out.println("Sub string "+a.substring(2,5));
    
    a.setCharAt(0,'@');
    System.out.println(a);
	}
}

