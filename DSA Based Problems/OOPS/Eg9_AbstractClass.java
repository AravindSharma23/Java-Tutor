// Abstraction :

/*
-> showing only essential things and hiding certain details 
-> Abstract class must have atleast one abstract method
-> Can't create obj using abstract method
-> Abstract class have abstract methods and non abstract methods
*/
abstract class Shape
{
    abstract void display();
    void show(){
        System.out.println(" message from Shape class...");
    }
}
class Rectangle extends Shape
{
    void display(){
        System.out.println("Orverriding done by Rectangle class");
    }
}
public class Main
{
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.display();
		r.show();
	}
}
