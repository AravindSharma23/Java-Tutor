import java.util.*;     
class Main{
    public static void main(String args[]){
        HashMap <String,String> book = new HashMap<>();
        book.put("Aravind","22");
        book.put("Kumar","33");
        book.put("Harshaa","22");
        book.put("Jack","44");
        book.put("Mack","55");
        
        Set<Map.Entry<String,String>> values = book.entrySet();
        for(Map.Entry<String,String> v : values){
            System.out.println(v.getKey() + " :"+v.getValue());
        }
    }
}

