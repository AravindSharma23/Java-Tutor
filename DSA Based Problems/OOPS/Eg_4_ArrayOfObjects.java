// Creating array of objects :



class Students{
      String name;
      int id;
      
      Students(String name, int id){
          this.name = name;
          this.id = id;
      }
      void print(){
          System.out.println("Name "+name);
          System.out.println("Id "+id);
        
      }

}
public class Main
{
	public static void main(String[] args) {
          Students[] student = new Students[5];
          student[0] = new Students("Aravind",1);
          student[1] = new Students("Kumar",2);
          student[2] = new Students("Surya",3);
          student[3] = new Students("Prakash",4);
          student[4] = new Students("Ravi",5);
          for(int i = 0;i<student.length;i++){
                student[i].print();

          }


       
	}

	
}
