
/* 
constructor : 
     Special method
     same name as class name
     immediately called when the object is created
     used for initializing the values
*/

class Box{
    // Instance variable
    int length;
    int breath;
    int height;
    Box(int l,int b,int h){ // It sets values initially when program executes
        length = l;
        breath = b;
        height = h;
    }
   public  void setDimension(int l,int b,int h){ // changing existing value of above variable
        length = l;
        breath = b;
        height = h;
    }
}
public class Main
{
	public static void main(String[] args) {
		Box blackBox = new Box(2,4,6); // Passing parameters to constructor
		
		System.out.println(blackBox.length);
		System.out.println(blackBox.height);
		System.out.println(blackBox.breath);

       blackBox.setDimension(1,2,3); // set dimention to blackBox obj means use a custom method
     
       System.out.println(blackBox.length);
		System.out.println(blackBox.height);
		System.out.println(blackBox.breath);
	}
}

