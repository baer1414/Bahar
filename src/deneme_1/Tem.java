package deneme_1;

public class Tem {
    String name;
    static int tem;

    public Tem(String name) {
        this.name = name;
    }
    public static void temChanGo(int i){
        tem=i;

    }
    public void getInfo() {
        System.out.println("Tem{" +
                "tem= "+tem+
                " name= " + name +
                '}');
    }
}class mai2{
    public static void main(String[] args) {
      Tem t=new Tem("Bahar");
      Tem t1=new Tem("Hatice");
      Tem t2=new Tem("Bilge");
      Tem t3=new Tem("Çiğdem");
      Tem.temChanGo(1);
      t.getInfo();
      t1.getInfo();
      t2.getInfo();
      t3.getInfo();




    }
}
