package Day_12_nestedAndWhileLoops;
import java.util.Scanner;
public class Odev_ {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
      /* int i=22;
       while(i<50){
           int fah=(int)(i*1.8)+32;
           i++;
           System.out.println(i+"C "+fah+" Fahrenattır.");
       }

        System.out.println("Lütfen 0 ile 1000 arasında bir sayı giriniz: ");
        int sayi=scan.nextInt();
        int i=0;
        int sonuc=0;
        while(i<=sayi){
          sonuc+=i;
            System.out.println(i+" toplam= "+sonuc);
            i++;
        }

        int i=0;
        int sonuc=0;
      while(true) {
          System.out.println("bir sayı giriniz: ");
          int sayi = scan.nextInt();
          System.out.println("bir sayı daha giriniz: ");
          int sayi1 = scan.nextInt();
          i++;
          if(sonuc<=25) {
              sonuc = sayi + sayi1;
              System.out.println(sonuc);

          }
          System.out.println("toplam 25 buyuktür");
          break;
      }*/


       /* System.out.println("Lütfen 0 ile 1000 arasında bir sayı giriniz: ");
        int sayi = scan.nextInt();
        int tekSayi = 0;
        int ciftSayi = 0;
        int i=0;
        while(i<1000) {
            i++;
            if (i % 2 == 0) {
                ciftSayi += i;
            } else {
                tekSayi += i;
            }
            System.out.println(" tek sayı toplamı:" + tekSayi);
            System.out.println(" cift sayı toplamı:" + ciftSayi);

        }*/
// ödev 1 for 1 22 333 4444 55555 666666
      for(int i=1; i<7;i++){
            for(int j=1; j<=i; j++ ){
                System.out.print(i);
            }
            System.out.println();
        }

     //ödev 2 for 123456789101112131415

       for(int i=1; i<6;i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

       for(int i=1;i<=6;i++){
          for(int k=0;k<=6-i;k++){
               System.out.print(" ");
         }
           for(int j=1;j<=i;j++){
              System.out.print("* ");
           }
           System.out.println();
        }

       int k=0;
        for(int i=0;i<5;i++){
            for(int j=0; j<=i;j++){
                k++;
                System.out.print(k);
            }
            System.out.println();
        }






















    }
}
