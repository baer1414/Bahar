package Day_35;

public class Human_ {

    public void name(){
        System.out.println("ismi ahmet olabilir");
    }
}
class man_1 extends Human_{
    public void role(){
        System.out.println("baba olurlar");
    }
}
class son_1 extends man_1{
    public void activity(){
        System.out.println("oyun oynar");
    }
}
class Test_{
    public static void main(String[] args) {
        son_1 g=new son_1();
        g.name();
        g.role();
        g.activity();

       man_1 f=new man_1();
       f.name();
       f.role();

     Human_ human_=new Human_();
     human_.name();


    }

}