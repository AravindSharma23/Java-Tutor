// Using getter and setter functions because need to access private variable inside the class

class Shapes{


    private int length,breath;
    // Getter methods
    int getLength(){
        return length;
    }
    int getBreath(){
        return breath;
    }
    //Setter methods 
    void setLength(int l){
        if(l >0){
            this.length = l;
        }else{
            this.length = 0;
        }
    }
    void setBreath(int b){
        if(b>0){
            this.breath = b;
        }else{
            this.breath = 0;
        }
    }
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
	     s1.setLength(3);
	     s1.setBreath(2);
	     System.out.println("length "+s1.getLength());
	     System.out.println("breath "+s1.getBreath());

	    System.out.println(s1.area());

	}

	
}
