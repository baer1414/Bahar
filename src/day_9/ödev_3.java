package day_9;

import java.util.Scanner;

public class ödev_3 {
    public static void main(String[] args) {






        /* Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen notunuzu girin");
        double note= scan.nextDouble();

        if (note > 85 && note <= 100) {
            System.out.println(" A ");
        }
        else if (note > 70 && note <= 85) {
            System.out.println(" B ");
        }
        else if (note> 55 && note <= 70) {
            System.out.println(" C ");
        }
        else if (note> 40 && note <= 55) {
            System.out.println(" D ");
        }
        else{
            System.out.println(" F ");
        }

        int a=5,b=10,c=1;

        if(a>b && a>c){
            System.out.println(" Büyük olan sayı="+a);

        }else if(b>a && b>c){
            System.out.println(" Büyük olan sayı="+b);

        }else if(c>a && c>b){
            System.out.println(" Büyük olan sayı="+c);
        }else{
            System.out.println(" sayılar  ");
        }


        int sayi=14;
        if(sayi>5){
            System.out.println("sayı 5 den buyuktur");
            if (sayi>25){
                System.out.println("sayı 25 den buyuktur");
                if (sayi>50){
                    System.out.println("sayı 50 den buyuktur");

                }else{
                    System.out.println("sayı 50 küçüktür");
                }

            }else{
                System.out.println("sayı 25 den ve 50 den küçük");
            }

        }else{
            System.out.println("sayı 5 den 25 den ve 50 den kücük");
        }*/



       /* Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif sayi tahmin et");
        int tahmin= scan.nextInt();
          int sayi=20;

     if(sayi>tahmin && sayi/2<tahmin){
         System.out.println("sayi tahmine eşit veya yakındır");
         if(sayi==tahmin){
             System.out.println("tebrikler");
         }else{
             System.out.println("sayı çok uzak");
         }

     }else{
         System.out.println(" sayı cok küçük");
     }*/


       /* Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif sayi tahmin et");
        int tahmin= scan.nextInt();
        int sayi=20;

        if(tahmin<sayi){

            if(sayi/2<tahmin){
                System.out.println("yaklaştın biraz daha büyük bir sayı söyle");
            }else if(tahmin<sayi/2){
                System.out.println("yakın değilsin daha büyük bir sayı soyle");
            }else{
                System.out.println("pek yakın sayılmazsın");
            }


        }else if(tahmin>sayi){
            if(tahmin<sayi+sayi/2){

                System.out.println("tahmininz yakın ancak daha küçük bir sayı soylemelisiniz");
            }else if(tahmin>sayi+sayi/2){
                System.out.println("cok buyuk bir sayı soyledin daha kücük bir tahmin et");
            }else{
                System.out.println("pek yakın değilsin biraz daha kucuk bir sayı soyle6");
            }


        }else{
            System.out.println("tahmini dogrudur tebrikler");
        }

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen motelimizitanımak için 123 bir kat numarası girin ve oda adı secin");
        System.out.println("1.kat :resepsin güvenlik oda hizmetleri \n2.kat yemekhane dinlenme salonu room1 room2 \n3. kat room3 room4 room5 room6");
        int kat= scan.nextInt();
        scan.nextLine();
        String secim= scan.nextLine();

        switch (kat) {
            case 1:
                switch (secim) {
                    case "resepsion":
                        System.out.println("tüm işlemleriniz için bekleriz");
                        break;
                    case "güvenlik":
                        System.out.println("prosfeyenel destek");
                        break;
                    case "oda hizmetleri":
                        System.out.println("temizlik ve dahilini hizmet için 101 dahili ara");
                        break;
                    default:
                        System.out.println("boyle bir oda yok");


                }
                break;
            case 2:
                switch (secim) {
                    case "yemekhane":
                        System.out.println("kahvaltı 08-11 öğle yemeği 12-15 akşam yemeği18-21 ");
                        break;
                    case "dinlenme salonu":
                        System.out.println("cay ikramımız var");
                        break;
                    case "room1":
                        System.out.println("ekonomik oda");
                        break;
                    case "room2":
                        System.out.println("ekonomik oda");
                        break;

                    default:
                        System.out.println("boyle bir oda yok");
                }

                break;
            case 3:
                switch (secim) {
                    case "room3":
                        System.out.println("standart oda");
                        break;
                    case "room4" +
                            "":
                        System.out.println("standart oda");
                        break;
                    case "room5":
                        System.out.println("özel oda");
                        break;
                    case "room6":
                        System.out.println("özel oda");
                    default:
                        System.out.println("boyle bir oda yok");
                }


                break;
            default:
                System.out.println(" otelimiz 3 katlıdır");

        }*/







































































































    }


}








