package Day_34;

public class Student {
    static String name;

    public Student(String name){
        Student.name=name;
    }
    public void printname(){
        System.out.println("name = " + name);
    }
}
