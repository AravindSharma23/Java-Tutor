
// multilevel Inheritance
class GrandFather{
    public void land(){
        System.out.println("Have a land ");
    }
}
class Father extends GrandFather{
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
       s.land();
       s.house();
       s.car();
       
	}
}
