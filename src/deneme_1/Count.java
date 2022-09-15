package deneme_1;

public class Count {
    static int count;

    public Count() {
        count++;
        System.out.println(count);
    }
}
class mai{
    public static void main(String[] args){
        Count c=new Count();
        Count c1=new Count();
        Count c2=new Count();
        Count c3=new Count();

    }
}
