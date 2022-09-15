package Day_34._Stata;

public class Candite {
    String name;
    int schoolID;
    static String branch;
    static int counter;


    public Candite(String name) {
        this.name = name;
        schoolID = setNumber();
    }

     public static int setNumber(){
        counter++;
        return counter;
     }

     public static void setBranch(String str){
        branch=str;
     }

     public void getInfo(){
         System.out.println(name);
         System.out.println(schoolID);
         System.out.println(branch);
     }

}
class main4{
    public static void main(String[] args){
     Candite cd1=new Candite("Beytullah");
     Candite cd2=new Candite("Alparslan");
     Candite cd3=new Candite("Yaşar");
     Candite.setBranch("SELENİUM");

     cd1.getInfo();
     cd2.getInfo();
     cd3.getInfo();


    }

}
