// Accessing methods from a class 



public class Main
{
    
	public static void main(String[] args) {
	//Main main = new Main();
	Student child = new Student();
	  System.out.println(child.name);
    System.out.println(child.id);
    System.out.println(child.percentage);
  child.Display(); // access a method
	
	}
	

}

	class Student{
	    String name;
	    int id;
	    float percentage; 
	   void Display(){
	       System.out.println("Name is "+this.name);
	   }
	
	 Student(){
	    this.name = "Aravind";
	    this.id = 1;
	    this.percentage = 90.2f;
	}
    	}
