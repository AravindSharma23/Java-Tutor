
/* 
Concept :
      Software entities should be open for extension but closed for modification .
      This allows adding new function without altering existing code. 
*/
/* 
Here if need to need to add new shape like triagle means needs to do modify existing class or function but its violated . 
*/
class AreaCalculator{
    public double calculateArea(String shape,double length,double breath,double height,double radius){
        if(shape.equals("circle")){
            return Math.PI* radius * radius;
        }else if(shape.equals("rectangle")){
            return length * breath;
        }
        return 0;
    }
}
class Main{
    public static void main(String[] args){
        AreaCalculator calulate = new AreaCalculator();
        System.out.println(calulate.calculateArea("circle",0,0,0,3));
    }
}
