
// To find no of even digits in an array.
public class Main
{
	public static void main(String[] args) {
		int[] arr= {12,345,2,6,7896};
		System.out.println("No of even digits numbers "+checkNumbers(arr));
	}
		static int digits(int num){ // optimised way to find no of digits
	           return  (int) Math.log10(num)+1;  
	}
	// static int digits(int num){
	//     if(num < 0){
	// 	    return num = num * -1;
	//     }
	//     if(num == 0){
	// 	    return -1;
	//     }
	//     int count = 0;
	//     while(num >0){
	//         count++;
	//          num/=10;
	//     }
	//     return count;
	// }
	static boolean isEven(int num){
	    int digitsCount = digits(num);
	    return  digitsCount%2 == 0;
	}
	static int checkNumbers(int[] arr){
	    int count = 0;
	    for(int a : arr){
	        if(isEven(a)){
	            count++;
	        }
	    }
	    return count;
	}
}
