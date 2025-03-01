


/*
class -> Collection of objs
we can 
    -> define data and methods inside it. 
*/

class Box{
    int l;
    int b;
    int h;
}

public class Main
{
	public static void main(String[] args) {
		Box blackBox = new Box(); 
		blackBox.l =  1;
		blackBox.b = 2;
		blackBox.h = 3;
		
		System.out.println("blackBox l "+blackBox.l);
		System.out.println("blackBox b "+blackBox.b);
		System.out.println("blackBox h "+blackBox.h);
	}
}

/*
obj creation :

className objName; // It doesn't having memory allocation
objName = new className; // It creates memory allocation for accessing it.
*/
