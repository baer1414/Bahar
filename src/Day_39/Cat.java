package Day_39;

public class Cat extends animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("kediler çok şeyi yer");
    }

    @Override
    public void move() {
        System.out.println("kediler iyi koşucudurlar");
    }
}
