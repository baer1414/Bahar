package Day_34;

import java.util.Random;

public class geometrik {
   static int primeter;
   static int counterSides;

    public static void setPrimeter(int... sides){
        for (int i:sides) {
           primeter+=i;
           counterSides++;

        }
        System.out.println("geometrik şeklin cevresi= "+primeter);
        System.out.println("geometrik kenar sayısı= "+counterSides);

    }
}class main3{
    public static void main(String[] args){
        geometrik.setPrimeter(generateSide(),generateSide(),generateSide());


    }
    public static int generateSide(){
        Random rm=new Random();
        return rm.nextInt(10);
    }
}
