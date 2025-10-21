

/*
Constructor :
     Constructor is called when instance of obj is created.
     -> doen't have return Type
     -> Constructor name is same as class name
     
     
    Types of constructor :
       --> Default constructor
      --> parameterized constructor
      --> copy constructor
*/

class Shapes{
        // Accessing private variable 

     int length,breath;
    
    public Shapes(){ // default constructor 
        this.length = 2;
        this.breath = 5;
    }
    // parameterized constructor 
    public Shapes(int l,int b){
        this.length = l;
        this.breath = b;
    }
    public Shapes(int l){
        this.length = l;
    }
    
    int area(){
        int a = length * breath;
        return a;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Shapes s1 = new Shapes();
	    
	    Shapes s2 = new Shapes(3,3);
	    Shapes s3 = new Shapes(1);

	    System.out.println(s1.area());
	    System.out.println(s2.area());
	    System.out.println(s3.area());

	}

	
}
