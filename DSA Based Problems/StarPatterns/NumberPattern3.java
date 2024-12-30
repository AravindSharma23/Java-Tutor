
public class Main
{
	public static void main(String[] args) {
	    int n = 5; // 2*n
	    for(int i=1;i<=2*n;i++){
	        if(i<=n){
	        for(int space = 0;space<n-i;space++){
	            System.out.print(" ");
	        }
	        for(int rev=i;rev>0;rev--){
	            System.out.print(rev);
	            
	        }
	        for(int j=2;j<=i;j++){
	            System.out.print(j);
	        } 
	        }else{
	             for(int space = i-n;space>0;space--){
	            System.out.print(" ");
	        }
	        for(int rev=2*n-i;rev>0;rev--){
	            System.out.print(rev);
	            
	        }
	        for(int j=2;j<=2*n-i;j++){
	            System.out.print(j);
	        }
	        }
	        System.out.println();
	    }
	}
}

/*
o/p:

    1
   212
  32123
 4321234
543212345
 4321234
  32123
   212
    1
*/
