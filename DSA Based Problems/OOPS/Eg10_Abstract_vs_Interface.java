 // Abstract class 

/* abstract class test{
    abstract void method1();
    abstract void method2();
}
class TestAbstract extends test{
     
     void method1(){
         System.out.println("Method1");
     }
     void method2(){
         System.out.println("Method2");
     }
}
public class Main
{
	public static void main(String[] args) {
        TestAbstract t= new TestAbstract();
         t.method1();
         t.method2();
	}
} */

// Interface 


 interface test{
     void method1();
     void method2();
}
class TestAbstract implements test{
     
    public void method1(){
         System.out.println("Method1");
     }
    public void method2(){
         System.out.println("Method2");
     }
}
public class Main
{
	public static void main(String[] args) {
        TestAbstract t= new TestAbstract();
         t.method1();
         t.method2();
	}
}
