


// Hierarical Inheritance
class Shape{
    int length,breath,radius;
}
class Rect extends Shape{
   public  Rect(int l, int b){
        length = l;
        breath = b;
    }
    public void RectArea(){
        System.out.println("Area of Rectangle "+length*breath);
    }
}
class Circle extends Shape{
    public  Circle(int r){
        radius = r;
    }
    public void CircleArea(){
        System.out.println("Area of circle "+ 2*3.14f*radius*radius);
    }
}
class Square extends Shape{
    public  Square(int b){
        breath = b;
    }
    public void SquareArea(){
        System.out.println("Square Area "+ 4*breath);
    }
}
public class Main
{
	public static void main(String[] args) {
    Rect obj1 = new Rect(2,3);
    obj1.RectArea();
    
    Circle obj2 = new Circle(3);
    obj2.CircleArea();
    
    Square obj3 = new Square(1);
    obj3.SquareArea();
       
	}
}
