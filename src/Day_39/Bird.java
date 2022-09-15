package Day_39;

public class Bird extends animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("kuşlar böcekleri yer");
    }

    @Override
    public void move() {
        System.out.println("kuşlar uçarlar");

    }
}
class parrot extends Bird{

    public parrot(String name) {
        super(name);
    }
}