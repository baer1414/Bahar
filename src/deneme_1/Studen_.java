package deneme_1;

public class Studen_ {
    int number;
   String name;
     String schoolName="3 Adim Koleji";



    public Studen_(int number, String name) {
        this.number = number;
        this.name = name;
    }


    public String getInfo() {
        return "Studen_{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
