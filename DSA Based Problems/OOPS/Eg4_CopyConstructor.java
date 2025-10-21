

// Copy constructor - passing one constructor as a argument to another constructor
class Complex{


     int real,imaginary;
    
    public Complex(){ // default constructor 
        this.real = 2;
        this.imaginary = 5;
    }
    // parameterized constructor 
    public Complex(int l,int b){
        this.real = l;
        this.imaginary = b;
    }
    // Copy constructor - passing one constructor as a argument to another constructor
    public Complex(Complex o2){
        this.real = o2.real;
        this.imaginary = o2.imaginary;
    }
    
    public String toString(){
        return "("+this.real+"+" + this.imaginary + "i)";
    }
}
public class Main
{
	public static void main(String[] args) {
	    Complex o1 = new Complex();
	    
	    Complex o2 = new Complex(3,3);
	    Complex o3 = new Complex(o2);

	    System.out.println(o1);
	    System.out.println(o2);
	    System.out.println(o3);

	}

	
}
