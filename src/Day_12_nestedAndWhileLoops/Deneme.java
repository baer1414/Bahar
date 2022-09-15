package Day_12_nestedAndWhileLoops;
import java.util.*;
public class Deneme {
    public static void main(String[] args){

       /* for(int i=1; i<=6; i++) {
            for (int j=1; j<7-i;j++){
                System.out.print(" ");
            }
            for (int k=1; k <= i; k++) {
                System.out.print("*");

                }
                System.out.println("");
            }*/
  Scanner scan=new Scanner(System.in);

        /*int i=9;

       do{
      System.out.println("Merhaba Çocuklarım");
      i++;
       }while(i<5);


       boolean a=true;
        do{
            System.out.println("sayı giriniz");
            int sayi= scan.nextInt();
            System.out.println("sayı giriniz");
            int sayi1= scan.nextInt();
            System.out.println("toplam="+(sayi+sayi1));

            if(sayi+sayi1==0){
                break;
            }
        }while(a);


    Random random=new Random();
    int i= random.nextInt(50);
        System.out.println("tuttuğum sayıyı bul bakalım 5 hakkın var");
      int j=1;
       do{
           System.out.println(j+" tahmin=");
          int tahmin=scan.nextInt();
          if(tahmin==i){
              System.out.println("tebrikler sayıyı buldun");
              break;
          }
            else if(tahmin>i){
              System.out.println("aşağı");
          }
           else{
              System.out.println("yukarı");
          }

         j++;
      }while(j<6);

        System.out.println("tuttuğum sayı="+i);

        while(true){
            System.out.println("ne yapmak istiyorsunuz");
            System.out.println("1-Toplama\n 2- Çıkarma\n 3- Çarpma\n 4- bölme\n 5-çıkış");

            System.out.print(" seciminiz=");
            int i= scan.nextInt();
            if(i==1){
                while(true) {
                    System.out.println("toplama işlemi çıkış için toplam sıfır olmalı");
                    System.out.println("birinci sayı girin=");
                    int sayi = scan.nextInt();
                    System.out.println("ikinci sayı girin=");
                    int sayi1 = scan.nextInt();
                    System.out.println("sayı toplamı=" + (sayi + sayi1));
                   if((sayi+sayi1)==0){
                      break;
                   }
                }
            }

        if(i==2){
            while(true) {
                System.out.println("cıkarma işlemi çıkış için cıkarma sıfır olmalı");
                System.out.println("birinci sayı girin=");
                int sayi = scan.nextInt();
                System.out.println("ikinci sayı girin=");
                int sayi1 = scan.nextInt();
                System.out.println("sayı cıkarma=" + (sayi - sayi1));
                if((sayi-sayi1)==0){
                    break;
                }
            }
        }

            if(i==3){
                while(true) {
                    System.out.println("çarpma işlemi çıkış için çarpma sıfır olmalı");
                    System.out.println("birinci sayı girin=");
                    int sayi = scan.nextInt();
                    System.out.println("ikinci sayı girin=");
                    int sayi1 = scan.nextInt();
                    System.out.println("sayı carpma=" + (sayi*sayi1));
                    if((sayi+sayi1)==0){
                        break;
                    }
                }
            }

            if(i==4){
                while(true) {
                    System.out.println("bölme işlemi çıkış için bölüm sıfır olmalı");
                    System.out.println("birinci sayı girin=");
                    int sayi = scan.nextInt();
                    System.out.println("ikinci sayı girin=");
                    int sayi1 = scan.nextInt();
                    System.out.println("sayı bölme=" + (sayi / sayi1));
                    if((sayi+sayi1)==0){
                        break;
                    }
                }
            }
            if(i==5){
                break;
            }
    }
        for(int i=0; i<10;i++){
            if (i>5 && i<8){
                continue;
            }
            System.out.println(i);
        }
        bahar: for(int i=0; i<20; i++){
            System.out.println("ilk döngü");
            for(int j=0;j<10;j++){
                System.out.println("merhaba");
                if(j==2){
                    continue bahar;
                }
                System.out.println("dünya");
            }
        }*/



































































































































































    }
}
