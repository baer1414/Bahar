package Day_36;

public class Motorcyc extends Vehicle_ {
    int cc;
    public int changeCcHp(){
        return cc/15;
    }
    public void start(){
        System.out.println("motosiklet anahtar ile çalıştı");
    }
    public void stop(){
        System.out.println("motosiklet durdu");
    }

}
