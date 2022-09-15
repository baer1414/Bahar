package Day_23;
import java.util.*;
public class ArraysExample {
    public static void main(String[] args) {

     // String[] str=new String[5];
      //  str[0]="mehmet";

     //   str[4]="ahmet";



  /* int[] sayı=new int[4];
    sayı[0]=1;
    sayı[1]=52;
    sayı[2]=100;
    sayı[3]=200;
    for(int i=0;i<4;i++){
        System.out.println(sayı[i]);}



        int[] sayı=new int[4];
        sayı[0]=1;
        sayı[1]=52;
        sayı[2]=100;
        sayı[3]=200;
        for(int i=0;i<4;i++){
            System.out.println(sayı[i]*sayı[i]);
        }*/

   /* String[] gun=new String[7];
    gun[0]="Pazartesi";
    gun[1]="Salı";
    gun[2]="Çarşamba";
    gun[3]="Perşembe";
    gun[4]="cuma";
    gun[5]="Cumartesi";
    gun[6]="Pazar";
        //System.out.println("Bu gün günlerden "+gun[2]);
       String sonuc="";

           if(gun[2].equals("Çarşamba")){
               sonuc=gun[i];
               System.out.println("Haftanın üçüncü günü çarşambadır");
           }else{
               System.out.println("çarşamba değildir");
           }
        }*/


     /*   for(int i=0;i<7;i++){
            if(gun[i].equalsIgnoreCase("cuma")){
                System.out.println(true);
                break;
            }else{
                if(i==6){
                    System.out.println("false");
                }
            }
        }
//ikinci yol
        int count = 0;
        for (int i = 0; i < 7; i++) {
            if (gun[i].equalsIgnoreCase("cuma")) {
                count++;
            }

            if (count > 0) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }

  //  String[] str={"pazartesi","salı","çarsamba","perşembe","cuma","cumartesi","pazar"};

        String[] ad={"bahar","banu","betül","bekir","berna"};


        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (ad[i].equalsIgnoreCase("bahar")) {
                count++;
            }
            }

            if (count > 0) {
                System.out.println("isminiz grup içinde vardır");

            } else {
                System.out.println("isminiz grubta yoktur yoktur");

            }


        Random random=new Random();
        int[] sayi=new int[20];
        for (int i = 0; i <20; i++){
            sayi[i]=random.nextInt(100);
            System.out.println((i)+ "sayi="+sayi[i]);
        }
        System.out.println("17. indeksdeki sayı="+sayi[17]);*/


        Random random=new Random();
        int[] sayi=new int[20];
        int tek=0;
        int çift=0;
        for (int i = 0; i <20; i++){
            sayi[i]=random.nextInt(100);
            System.out.println((i)+ "sayi="+sayi[i]);
          if(sayi[i]%2==0){
              çift++;


          }else{
              tek++;

          }
        }
        System.out.println("çift sayı adet="+çift);

        System.out.println("tek sayı adet="+tek);
































    }

}
