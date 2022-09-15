package Day_34;

public class Student_ {
    int number;
    String name;

   static String schoolname="Kraft";
   // static int counter;


    public Student_(int number, String name) {
        this.number = number;
        this.name = name;
    }


    public String getInfo() {
        return "Student_{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", schoolname='" + schoolname + '\'' +
                '}';
    }
}
