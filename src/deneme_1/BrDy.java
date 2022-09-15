package deneme_1;

public class BrDy {
    int cakeSlice=28;
    public void takeSlice(){
        cakeSlice--;
    }
}
class mai_1{
    public static void main(String[] args){

        BrDy a=new BrDy();
        BrDy a1=new BrDy();
        BrDy a2=new BrDy();
        BrDy a3=new BrDy();
        BrDy a4=new BrDy();

        a.takeSlice();
        a1.takeSlice();
        a1.takeSlice();
        a1.takeSlice();
        a1.takeSlice();

        System.out.println(a1.cakeSlice);
    }
}
