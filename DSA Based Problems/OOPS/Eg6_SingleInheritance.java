// Single Inheritance 

/* 
 A      B inherits A 
 ↓
 B
*/
class Father{
    public void house(){
        System.out.println("Have a own house");
    }
}
class Son extends Father{
    public void car(){
        System.out.println("Have a own Lamborgini");
    }
}
public class Main
{
	public static void main(String[] args) {
       Son s = new Son();
       s.house();
       s.car();
       
	}
}
