
// Find unique val in array using xor
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {2,2,3,5,3,6,5}; // {-3,-2,4,2,3}
	    System.out.print(findUnique(arr));
	}
	static int  findUnique(int[] arr){
	    int unique = 0;
	    for(int a : arr){
	        unique^=a;
	    }
	    return unique;
	}
}
/*
o/p :
6
*/
