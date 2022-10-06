//HashMap
       //It contains value based on key.
       //Contains unique elements.
       //Maintain no order.
       //One null key many null value.
 import java.util.*;     
class Main{
    public static void main(String args[]){
        HashMap <String,String> book = new HashMap<>();
        book.put("Aravind","22");
        book.put("Kumar","33");
        book.put("Harshaa","22");
        book.put("Jack","44");
        book.put("Mack","55");
        
        Set<String> keys = book.keySet();
        for(String k : keys){
            System.out.println(k+" : "+book.get(k));
        }
    }
}








































       
//TreeMap
    //It contains value based on key.
    //Contains unique elements.
    //Maintain Ascending order.
    //No null key many null value.
    
    
//Linked HashMap
      //It contains value based on key.
       //Contains unique elements.
       //Maintain order.
       //One null key many null value.
       
