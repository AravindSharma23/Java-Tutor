// Nested methods 



class Maximum{
      int m;
      int n;
      
      Maximum(int m, int n){
          this.m = m;
          this.n = n;
      }
      int large(){
          if(m>n){
              return m;
          }else{
              return n;
          }
      }
      void display(){
          int large = large();
          System.out.println("large is "+large);
        
      }

}
public class Main
{
	public static void main(String[] args) {
         
      Maximum max = new Maximum(4,7);
        max.display();

       
	}

	
}
