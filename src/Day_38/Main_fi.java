package Day_38;

public class Main_fi {
    public static void main(String[] args) {
        Parent h=new Parent();
        System.out.println(h.num);
        Parent.run();
        Child yigit=new Child();
       Child.run();


    }
public int method_a(){
        final int X=5;
        return X;
}

}
