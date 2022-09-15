package Day_35;

public class Human {

    public void name(){
        System.out.println("ismi Ahmet olabilir");
    }
}
class Man extends Human{
    public void role(){
        System.out.println("baba olurlar");
    }
}
class Son extends Man {
    public void activite(){
        System.out.println("oyun oynar");
    }
}
class Test{
    public static void main(String[] args) {
        Son son=new Son();
        son.name();
        son.role();
        son.activite();

        Man man=new Man();
      man.name();
      man.role();

      Human human=new Human();
      human.name();

    }
}