package deneme_1;

import java.util.Random;

public class geom {
    static int primter;
    static int count;
    public static void setPrimter(int... sides){
        for (int i:sides) {
            primter+=i;
            count++;
        }
        System.out.println(primter);
        System.out.println(count);
    }


}class mai3{
    public static void main(String[] args) {
        geom.setPrimter(genertSide(),genertSide(),genertSide(),genertSide());

    }
    public static int genertSide(){
        Random rd=new Random();
        return rd.nextInt(10);
    }
}
