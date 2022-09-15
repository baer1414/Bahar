package Day_11_Loops;
import java.util.Scanner;
public class Odev_11 {
    public static void main(String[] args){

Scanner scan=new Scanner(System.in);

     //ödev a den z ye kadar olan harfleri ekrana yazdır
      /*  for(int i=1;i<=29;i++){
         switch(i){
             case 1:
                 System.out.println("a");
                 break;
             case 2:
                 System.out.println("b");
                 break;
             case 3:
                 System.out.println("c");
                 break;
             case 4:
                 System.out.println("ç");
                 break;
             case 5:
                 System.out.println("d");
                 break;
             case 6:
                 System.out.println("e");
                 break;
             case 7:
                 System.out.println("f");
                 break;
             case 8:
                 System.out.println("g");
                 break;
             case 9:
                 System.out.println("ğ");
                 break;
             case 10:
                 System.out.println("h");
                 break;
             case 11:
                 System.out.println("ı");
                 break;
             case 12:
                 System.out.println("i");
                 break;
             case 13:
                 System.out.println("j");
                 break;
             case 14:
                 System.out.println("k");
                 break;
             case 15:
                 System.out.println("l");
                 break;
             case 16:
                 System.out.println("m");
                 break;
             case 17:
                 System.out.println("n");
                 break;
             case 18:
                 System.out.println("o");
                 break;
             case 19:
                 System.out.println("ö");
                 break;
             case 20:
                 System.out.println("p");
                 break;
             case 21:
                 System.out.println("r");
                 break;
             case 22:
                 System.out.println("s");
                 break;
             case 23:
                 System.out.println("ş");
                 break;
             case 24:
                 System.out.println("t");
                 break;
             case 25:
                 System.out.println("u");
                 break;
             case 26:
                 System.out.println("ü");
                 break;
             case 27:
                 System.out.println("v");
                 break;
             case 28:
                 System.out.println("y");
                 break;
             case 29:
                 System.out.println("z");
                 break;
             default:
                 System.out.println("30 tane harf yoktur");
         }
        }


// kısa yol
        for(char i='a';i<='z';i++){
            System.out.println(i+" ");
        }

// ödev 9 sayını carpıp tablosu
        int sayi=9;
        for(int i=1;i<=10;i++ ){
          int  sonuc=sayi*i;
            System.out.println( sayi+"*"+i+"="+sonuc);
        }*/

//ödev 3 şifre sorusu


        int sifre=1919;
        System.out.println(" ----şifreyi bulmak için 3 hakkın var------ ");
        for (int  i=1; i<=3; i++){
            System.out.println("lütfen şifre girin");
            int tahminSifre= scan.nextInt();
            if(tahminSifre==sifre){
                System.out.println("tebrikler şifre doğru");
                break;
            }else{
                System.out.println("şifre hatalı");
            }

            if(i==3){
                System.out.println("şifre bloke oldu");
            }
        }



















































    }
}
