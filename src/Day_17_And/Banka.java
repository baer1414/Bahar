package Day_17_And;

import java.util.*;

public class Banka {
    int hesapNo;
    String musteriAdSoyad;
    double paraMiktari;
    boolean mobilBankacilik;


    public void hesapAc(){
        Scanner scan=new Scanner(System.in);
        System.out.println("isim: ");
        musteriAdSoyad=scan.nextLine();

        Random random=new Random();
        hesapNo= random.nextInt(100000);
        System.out.println(musteriAdSoyad+" "+hesapNo+" Nolu Hesabınız başarı ile oluşturuldu");

    }
    public void mobilBankacilikOnay(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Mobil Bankacılık kullanmak için lütfen evet yazınız: ");
       String onay=scan.next();
       if(onay.equals("evet")|| onay.equals("Evet")|| onay.equals("EVET")){
           mobilBankacilik=true;
           System.out.println("sayın "+musteriAdSoyad+" mobil bankacılığı kullanabilirsiniz");
       }else{
        System.out.println("sayın "+musteriAdSoyad+" mobil bankacılığa giriş yapamazsınız");
       }
    }
        public void paraYatir(double para){
        paraMiktari+=para;
        }
        public void hesapOzeti(){
            System.out.println( musteriAdSoyad+" "+ hesapNo+" nolu hesabınıza "+ paraMiktari+" $ vardır");

        }
        public void paraCek(int para){
            Scanner scan=new Scanner(System.in);
            System.out.println("lütfen cekmek istedğiniz tutarı yazınız ");
            int paracek=scan.nextInt();
            if(paraMiktari>=paracek){
                System.out.println("paranızı cekebilirniz");
                paraMiktari-=paracek;
            }
            else if(paracek>paraMiktari){
                System.out.println("yetersiz bakiye");
            }


        }

         public void hesapOzeti_1() {
             System.out.println(musteriAdSoyad + " " + hesapNo + " nolu hesabınıza " + paraMiktari + " $ vardır");
         }







}
