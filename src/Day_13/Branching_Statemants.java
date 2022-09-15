package Day_13;
import java.util.*;

public class Branching_Statemants {
    public static void main(String[] args) {

        // break denen yerde çıkıyor
      /*  for(int i=0; i<5;i++){
            System.out.println("ikl döngü");
            for(int j=0; j<5; j++){
                if(j==2){
                    break;
                }
                System.out.println("ikinci döngü");
            }

            }*/
        Scanner scan=new Scanner(System.in);


       /* while(true){
            System.out.println("toplam 50 ise programdan cıkış olacak");
            System.out.println("bir sayı giriniz");
            int sayi= scan.nextInt();
            System.out.println("bir sayı giriniz");
            int sayi1= scan.nextInt();

            System.out.println(" toplam="+(sayi+sayi1));
            if((sayi+sayi)==50){
                break;
            }

        }
        System.out.println();

       while(true){
           System.out.println("ne yapmal istiyorsunuz");
           System.out.println("1-toplama\n 2-çıkarma\n 3-çarpma\n 4-bölme\n 5- çıkış");
           System.out.println("Seciminiz: ");
           int i=scan.nextInt();
           if(i==1){
               while (true) {
                   System.out.println("toplama işlemi çıkış için toplam sıfır olmalı");
                   System.out.println("1. sayı: ");
                   int a = scan.nextInt();
                   System.out.println("2. sayı: ");
                   int b = scan.nextInt();
                   System.out.println("toplam=");
                   if ((a + b) == 0) {
                       break;
                   }
                       }


                   }


           }*/

        for(int i=0; i<10;i++){
            if(i>5&&i<8){
                continue;
            }
            System.out.println(i);
        }































































    }
}
