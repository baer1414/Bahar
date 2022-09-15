package Day_18;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
      // karakterSayisi();
        // karakterSayisi("bahar","KÜÇÜK");

        //  buyukHarf();

        // message();
     //   karakter();
        //  message1();
        //System.out.println(trimmed("        kalem" ));

//degistir("","");

        //siralama();
        //  kacinciSira();

       //System.out.println(yHarfi("javayı seviyor muyum"));

           // tekrar();

       // System.out.println(ortaThree("bahar"));

      //  System.out.println(birlestir("bahar", "eren"));

        adBasHarf("bahar","balaban");

      //  System.out.println(nickNameGen("bahar", "eren"));


    }

    public static void karakterSayisi() {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime girin");
        String cumle = scan.nextLine();
        System.out.println(cumle.length());


    }

    public static void karakterSayisi(String adi, String soyAdi) {
        System.out.println(adi.length() + soyAdi.length());
    }


    public static void buyukHarf() {
        Scanner scan = new Scanner(System.in);
        String adi = scan.nextLine();
        String soyAdi = scan.nextLine();
        System.out.println(" büyük harfle=" + adi.toUpperCase() + " " + soyAdi.toUpperCase());
    }

    public static void message() {
        Scanner scan = new Scanner(System.in);
        String mesaj = scan.nextLine();
        System.out.println("son harf = " + mesaj.charAt(mesaj.length() - 1));
    }

    public static void karakter() {
        Scanner scan = new Scanner(System.in);
        String mesaj = scan.nextLine();
        int a = mesaj.length();
        for (int i = 0; i < a; i++) {
            System.out.print(mesaj.charAt(i));

        }
    }


    public static void message1() {
        String a = "    merhaba dünya    ";
        System.out.println(a.trim());
    }

    public static String trimmed(String str) {
        return str.trim();
    }

    public static void degistir(String a, String b) {
        a = "18/10/2022";
        b = "20:50:55";

        a.replace("18/10/2022", "181020222 ");
        b.replace("20:50:55", "205055 ");

        System.out.println(a.replace("18/10/2022", "181020222") + b.replace("20:50:55", "205055 "));

    }

    public static void siralama() {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        String c = scan.nextLine();
        int x = a.length();
        int y = b.length();
        int j = c.length();
        if (x > y && y > j) {
            System.out.println(a.concat(b).concat(c));
        } else if (x > j && j > y) {
            System.out.println(a.concat(c).concat(b));
        } else if (y > x && x > j) {
            System.out.println(b.concat(a).concat(c));
        } else if (y > j && j > x) {
            System.out.println(b.concat(c).concat(a));
        } else if (j > x && x > y) {
            System.out.println(c.concat(a).concat(b));
        } else if (j > y && y > x) {
            System.out.println(c.concat(b).concat(a));
        } else {
            System.out.println("kelimeler eşit");
        }
    }


    public static void kacinciSira() {
        String ad = "Bahar";
        String soyadi = "leBlebi";
        System.out.println(soyadi.indexOf(ad.charAt(0)));

    }

    public static int yHarfi(String a) {
        int conct = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'y' || a.charAt(i) == 'Y') {
                conct++;
            }

        }

        return conct;
    }


   public static String sesliHarf(String str ) {
       String holder = "";
       for (int i = 0; i < str.length(); i++) {
           switch (str.charAt(i)) {
               case 'a':
                   holder += str.charAt(i);
                   break;
               case 'e':
                   holder += str.charAt(i);
                   break;
               case 'ı':
                   holder += str.charAt(i);
                   break;
               case 'i':
                   holder += str.charAt(i);
                   break;
               default:
           }
       }
       return holder;
   }

    public static void tekrar(){
        Scanner scan = new Scanner(System.in);
        String mesaj = scan.nextLine();
           mesaj.contains("sev");
           if(mesaj.contains("sev")){
        System.out.println("ne hoş bir insan");
           }
    }

  public static void lastThree(String str){
        String holder="";
        for(int i=0;i<3;i++){
            holder+=str.substring(str.length()-3);
        }
      System.out.println(holder);
  }

    public static String ortaThree(String str) {
       return str.substring(str.length()/2-1,str.length()/2+2);
        }

     public static String birlestir(String a,String b){
        if(a.length()>b.length()){
           return a.substring((0),b.length()).concat(b);

        }else if(b.length()>a.length()){
            return a.concat(b.substring(0,a.length()));
         }else{
         return a.concat(b);
        }
     }

        public static void adBasHarf(String ad,String soyAd){
        String empty="";
        char birinciIlkHarfi=ad.charAt(0);
        for(int i=0; i<soyAd.length();i++){
            if(soyAd.charAt(i)!=birinciIlkHarfi){
                empty+=soyAd.charAt(i);
            }
        }
        System.out.println(empty);
         }

          public static String nickNameGen(String name,String surname){
      String  nickname= name.substring(0,3).concat(surname.substring(surname.length()-3));
        return nickname;
}
















































































































}




















