class Shapes{
    int length,breath;
    
    void getData(int l , int b){
        this.length = l;
        this.breath = b;
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
	    // assigning values into a variable inside a class
	    s1.length = 2;
	    s1.breath = 2;
	    
	    // passing values into a method  and access it 
	    Shapes s2 = new Shapes();
	    s2.getData(3,3);
	    System.out.println(s1.area());
	    System.out.println(s2.area());
	    
	}

	
}
