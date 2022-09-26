/*
Widening casting :
      byte->short->char->int->long->float->Double
      
Narrowinf casting :
     double->float->long->int->char->short->byte
*/




public class Main{
    public static void main(String args[]){
        int a=23;
        float b = 99.9f;
        int mark = 431;
        float tot=(float)mark; // when type casting-----> (Converting data type)existing variable_name
        System.out.println("Marks in float "+tot);
        System.out.println("Double val is "+(double)b);
        System.out.println("float val of a "+(float)a);
        
        
    }
}
