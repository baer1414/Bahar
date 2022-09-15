package Day_16;

import java.util.*;

public class examp_1 {
    public static void main(String[] args) {
        //Scanner scan=new Scanner(System.in);
       // System.out.println("lütfen bir sayi giriniz:");
       // int sayi=scan.nextInt();
      //  System.out.println("basamak sayisi="+basamakSayisi(sayi));

      // üstlüSayi(5,2);

       //  fibonacci(18);

       // ücgen(3);

        System.out.println("5 ile 15 nin ebobu="+ebob1(15,5));
       // System.out.println("ebob="+ebob1(2,4));
       // ücgen(7);
    }
    public static int basamakSayisi(int sayi){
        int basamak=0;
        while(sayi>0){
            sayi/=10;
            basamak++;
        }
        return basamak;
    }
    public static void üstlüSayi(int a,int b){
        double sonuc= Math.pow(a,b);
        System.out.println((int)sonuc);
    }
    public static void armstronTreeDigits(int star,int end){
        for(int i=star;i<=end;i++){
            int x,y,z,sonuc;
            x=i/100;
            y=i%100/10;
            z=i%10;
            sonuc=x*x*x+y*y*y+z*z*z;
            if(i==sonuc){
                System.out.print(sonuc);
            }
        }
    }
    public static void fibonacci(int adet){
        int x=0,y=1;
        System.out.print(x+" "+y);
        for(int i=2,z; i<adet;i++){
            z=y+x;
            System.out.print(" "+z);
            x=y;
            y=z;
        }
    }
    public static void ücgen(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j <= a-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static int ebob1(int a,int b) {
        int sonuc = 1;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                sonuc = i;
            }


        }
     return sonuc;
        }














}
