// Create a class and how to print it.


public class Main
{
    
	public static void main(String[] args) {
	//Main main = new Main();
	Student child = new Student();
	  System.out.println(child.name);
    System.out.println(child.id);
    System.out.println(child.percentage);

	
	}
	

}

	class Student{
	    String name;
	    int id;
	    float percentage; 
	
	 Student(){
	    this.name = "Aravind";
	    this.id = 1;
	    this.percentage = 90.2f;
	}
    	}
