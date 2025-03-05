public class Main {
    private String name;   
    private int rollno;

    // Setter method (Encapsulation)
    public void setValues(String naam, int rno) {
        this.name = naam;
        this.rollno = rno;
    }

    // Getter method (Encapsulation)
    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollno);
    }

    public static void main(String[] args) {
        Main record = new Main();
        record.setValues("Aravv", 1);
        record.display();
    }
}
