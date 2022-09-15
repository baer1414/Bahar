package deneme_1;

public class Candt {
    String name;
    int scholId;

    static String branc;
    static int count;

    public Candt(String name) {
        this.name = name;
        scholId = setNumber();
    }
    public static int setNumber(){
        count++;
        return count;
    }
    public static void setBrach(String st){
        branc=st;
    }

    public void getInfo() {
        System.out.print(name+" ");
        System.out.print(scholId+" ");
        System.out.println(branc+" ");
    }

}class mai4{
    public static void main(String[] args) {
        Candt cd=new Candt("Fehmi");
        Candt cd1=new Candt("Kazım");
        Candt cd2=new Candt("Yavuz");
        Candt cd3=new Candt("Ramiz");
        Candt cd4=new Candt("Bahar");

       Candt.setBrach("Java");
       cd.getInfo();
       cd1.getInfo();
       cd2.getInfo();
       cd3.getInfo();
       cd4.getInfo();
    }
}
