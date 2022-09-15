package Day_11_Loops;
import java.util.Scanner;
public class ForLoops {
    public static void main(String[] args) {
// 0 dan 20 kadar merhaba dünya  yaz
       /* System.out.println("giriş");

     for(int i=0; i<20; i++){
         System.out.println(i+"merhaba dünya");
     }
        System.out.println("cıkış");*/
//0 dan 100 e kadar yazdır

       // for(int i=0; i<100; i++){
         //   System.out.println(+i);
      //  }


       // for(int i=15; i<100; i++) {
        //    System.out.println(+i);
       // }

       // for(int i=100; i>=0; i--)
        //    System.out.println(+i);

       // for(int i=0; i<100; i+=2)
         //   System.out.println(+i);

       // for(int i=0; i<100; i++) {
        //    if(i%2==0){
        //        System.out.println(i+" ");

        //    }
     //   }

        //  for(int i=10; i<1000; i+=10){
          //    System.out.println(i+" ");}


//1. yol
      //  int sonuc=1;
     //  for(int i=6; i>0; i--){
       //   sonuc*=i;
     //   }
      //  System.out.println("6!="+sonuc);

//2 yol

       // int sonuc=1;
      //  for(int i=1; i<=6;i++){
       //  sonuc=sonuc*i;
      //  }
      //  System.out.println("6!="+sonuc);





        /*for(int i=0; i<20; i++){
           sonuc=i*i*i;
           System.out.println(i+"nin küpü"+sonuc);}


        for(int i=24; i<50; i++){
            int fah=(int)(i*1.8)+32;
            System.out.println(i+" C " +fah+" F ");
        }

        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen bir kelime yazınız ");
        String kelime=scan.nextLine();
        System.out.print("lütfen kelimeyi kac defa yazdırmak istiyorsunuz ");
        int sayi= scan.nextInt();


        for(int i=0; i<sayi; i++){
            System.out.println(kelime
            );
        }


        Scanner scan=new Scanner(System.in);
        System.out.print("0 ile 1000 arasında sayı girin");
        int sayi= scan.nextInt();
        int sonuc=0;
        for(int i=0; i<=sayi; i++){
            sonuc+=i;}
            System.out.println(sayi+" kadar olan toplam"+sonuc);


        Scanner scan=new Scanner(System.in);
        System.out.print("0 ile 1000 arasında sayı girin");
        int sayi= scan.nextInt();
        int tekSayi=0;
          int ciftSayi=0;

        for(int i=0; i<=sayi; i++){
            if(i%2==0){
                ciftSayi+=i;
            }else{
                tekSayi+=i;
            }
        }
        System.out.println(" tek sayı toplamı:"+tekSayi);
        System.out.println(" cift sayı toplamı:"+ciftSayi);*/


        Scanner scan=new Scanner(System.in);
        System.out.print("taban sayısını giriniz");
        int taban= scan.nextInt();
        System.out.print("kuvvet sayısını");
        int kuvvet= scan.nextInt();
         int sonuc=1;
         for (int i=0; i<kuvvet; i++){
             sonuc*=taban;
         }

        System.out.print(sonuc);



















    }
}
