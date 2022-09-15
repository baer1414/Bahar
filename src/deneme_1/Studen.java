package deneme_1;

public class Studen {
   static String name;
    int number;
    static String schoolName="3 Adım Koleji";

    public Studen(String name, int number) {
        Studen.name = name;
        this.number = number;
    }
    public void printName(){
        System.out.println("number= "+number+ " name= "+name+" schoolName="+schoolName);
    }
}
