package Fisrt_Project;

import Day_17_And.Math2;

import java.util.Scanner;

public class Housuwife_Daily_Tasks {
    String isim;
    String soyAdi;
    int yas;
    String gozRengi;
    int boy;


    public void sabah(){
        System.out.println("kalkış saat 8:00 da");
        System.out.println("☺☺yeni güne merhaba☺☺");
    }
    public void kahvalti(){
        System.out.println("Cocuklar ve eşim için güzel bir kahvaltı hazırlığı");
        System.out.println("*******♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥***********");
    }
    public void temizlik(){
        System.out.println("kahvaltı bitti başlasın temizlik");
        System.out.println("saat 12:00 a kadar temizlik bitti");
    }

    public void ogleYemegi(){
        System.out.println("bu gün köfte ve makarna yapacam");
        System.out.println("♥☺ saat 01:00 de öğle yemeği zamanı ☺♥");;
    }
    public void ikindiCayi(){
        System.out.println("güzel bi çay yap ve muhabbet☺");
    }
    public void aksamYmegi(){
        System.out.println("ailecek toplanın akşam yemeği");
        System.out.println("ailecek mutlu bir yemek");
    }
    public void oturma(){
        System.out.println("akşam yemeği bitti herkes koltuklara hadi☺");
        System.out.println("♥ailecek cay tatlı♥ ");
    }
    public void gunBitti(){
        System.out.println("uyku zamanı geldi herkes yatak");
        System.out.println("cocukları uyut");
        System.out.println("cocuklar uyudu ortalığı son bir kez topla");
        System.out.println("sıcak bir cay koy ve evin sesliği ile bir bardak çay iç");
        System.out.println("☺☺☺☺ uyku zamanı*****************************");
    }


    public static void message(){
        System.out.println("ailemi çok seviyorum \n iyiki varsınız \n Allaha şükürler olsun");

    }
     public void evİhtiyac(){
         Scanner scan = new Scanner(System.in);
         System.out.println("ihtiyac");
         String  mutfakIhtiyaclari= scan.nextLine();
        switch (mutfakIhtiyaclari){
            case "pazar":
                System.out.println("sebze ve meyve");
                break;
            case "kahvaltılık":
                System.out.println("peynir zeytin yumurta sucuk salam ");
                break;
            case "market":
                System.out.println("yiyecek ve temizlik ürünleri alındı");
                break;
            case "kıyafet":
                System.out.println(" cocucklara kıyafet");
                break;
            default:
                System.out.println("alişverişe ihtiyac yok");
        }

}




}
