package Day_19;

import java.util.Scanner;

public class ödev_bahar {
    public static void main(String[] args) {
        // yazma();
        // bosluk();
        //  yarisi();
        // harfDegistir();
        // tekrar();
        //adet();
        //  degistir();
        //  ikiKelime();
        // System.out.println(kelime("keskin ilçesinden geciyorum", "kin"));
        //System.out.println(kacAdet("banu", "bahar"));
        // System.out.println(soz("kal"));
        // System.out.println("Ankara="+sozcuk("Ankara"));
        //  System.out.println(soyAdYazdır());
        // System.out.println(karekterSilerekYazma("akalar"));
        // System.out.println(yineleme("javva"));
        //System.out.println(unluUNsuz());
        //System.out.println(ilkucKelime("merhaba"));
        // System.out.println(karekterSilerekYazma("merhaba"));
        //if(ilkBenzersizHarf("mmerrhheabba").length()==0){
        //   System.out.println("benzersiz harf yoktur");
         //System.out.println(ikiKelimeBenzer("iftar", "tarif"));
        //System.out.println(ardiArdinaHarf("aabccccseeeeeefff"));
        //System.out.println(terstenKelimeBenzer("kabak"));
        //System.out.println(kacAdetsev("sev seni seveni"));
        // System.out.println(kelimeKacAdetVar("ankara bursa ve bursa"));
        //System.out.println(sonu("kulanacak"));
        //System.out.println(harfSayilari("merhaba"));
        //System.out.println(enCokDEgeriDonduren("aabbbbbssssssbbbbbb"));
        // System.out.println(sadeceHarf("erty66777"));


    }
    //1-Kullanıcıdan bir input alın ve girilen inputun ilk 3 harfini yazan , 3 kelimeden az
//ise inputu döndüren bir metot yazınız.
    public static void yazma(){
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        if( input.length()>3 ){
            System.out.println(input.substring(0, 3));
        } else if (input.length()<3){
            System.out.println(input);

        }

    }

//2-Kullanıcıdan bir dize sözcük alın ve her boşluğa % ibaresi ekleyin.

    public static void bosluk(){
        Scanner scan=new Scanner(System.in);
        String kelime=scan.nextLine();
        System.out.println(kelime.replace(" ", "%"));
    }
    //3-Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını döndüren bir program
//yazdırın.
    public static void yarisi(){
        Scanner scan=new Scanner(System.in);
        String kelime=scan.nextLine();
        if(kelime.length()==(kelime.length()/2+kelime.length()/2)){
            System.out.println(kelime.substring(kelime.length() / 2 ));
        }else{
            System.out.println(" kelime eşit uzunlukta değil ");
        }
    }

//4-Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve yeni harfi/harfleri
//alan ve buna göre kelimede/dizede sadece ilk bulduğu yeri değiştiren metodu
//yazınız.

    public static void harfDegistir() {
        Scanner scan = new Scanner(System.in);
        String kelime = scan.nextLine();
        System.out.println(kelime.replaceFirst("a", "i"));

    }

//5-Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.


    public static void tekrar() {
        Scanner scan = new Scanner(System.in);
        String kelime = scan.nextLine();
        for(int i=0;i<kelime.length();i++){
            for(int j=0;j<3;j++){
                System.out.print(kelime.charAt(i));
            }

        }
    }

    //6- Kullanıcıdan bir kelime ve bir karakter alın ve bu kelimenin istenen karakterin
    // kaç adet olduğunu döndüren metodu yazınız. (büyük küçük harf göz ardı
    //edilecek)


    public static void adet() {
        Scanner scan = new Scanner(System.in);
        String kelime = scan.nextLine();
        String karakter = scan.nextLine();
        int count=0;
        for (int i = 0; i < kelime.length(); i++) {
            if(kelime.substring(i,i+1).equalsIgnoreCase(karakter)) {
                count++;

            }
        }
        System.out.print(count);

    }


//7-Kullanıcıdan bir kelime ve bir harf alın kelimenizin içinde bu harfin hepsi
//kaldırılmış şekilde string döndüren programı yazınız.


    public static void degistir() {
        Scanner scan = new Scanner(System.in);
        String kelime = scan.nextLine();
        String karakter = scan.nextLine();
        System.out.println(kelime.toLowerCase().replace(karakter.toLowerCase(), ""));
    }



    //örnek-Kullanıcıdan iki kelime ve bir karakter alın ve bu kelimenin istenen karakterin
    // kaç adet olduğunu döndüren metodu yazınız. (büyük küçük harf göz ardı
    //edilecek)


    public static void ikiKelime() {
        Scanner scan = new Scanner(System.in);
        String kelime = scan.nextLine();
        String kelime1 = scan.nextLine();
        int count=0;
        for (int i = 0; i < kelime.length()-kelime1.length()-1; i++) {

            if(kelime.substring(i,i+kelime1.length()).equals(kelime1)) {
                count++;


            }
        }
        System.out.println(count);

    }

//8-Kullanıcıdan bir kelime alın ve kin kelimesi başından veya ilk karakterden sonra
//gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün;
//Kinlenmek true
//Kin tutmak true
//Ekin ektim true
//Keskin ilçesinden geçiyorum false
//Neden kin tutuyorsun false


    public static boolean kelime(String str, String control){
        if(str.substring(0,control.length()).equalsIgnoreCase(control)
                ||str.substring(1,1+control.length()).equalsIgnoreCase(control) ){
            return true;
        }
        return false;
    }
//9-Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa uzun kelimeyi ortada 30
//defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.

    public static String kacAdet(String a, String b) {
        String resut = "";
        if (a.length() > b.length()) {
            for (int i = 0; i < 2; i++) {
                resut += b;
            }
            for (int i = 0; i < 30; i++) {
                resut += a;
            }
            for (int i = 0; i < 2; i++) {
                resut += b;
            }
        }
        else if (b.length() > a.length()) {
            for (int i = 0; i < 2; i++) {
                resut += a;
            }
            for (int i = 0; i < 30; i++) {
                resut += b;
            }
            for (int i = 0; i < 2; i++) {
                resut += a;
            }
        }
        return resut;
    }




//10-Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın. 5 karakterin
//altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.

    public static String soz(String c) {
        String a="";
        if(c.length()<5){
            for(int i=0;i<5-c.length();i++){
                a+=".";
            }
        } else if(c.length()>=5){
            return c.substring(0,5);
        }
        return  c.concat(a);
    }

//11-Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2 harfi sonunda yer alıyorsa true
//almıyorsa false yazdırın.
//Ankara false
//Kafka true
//Salsa true
//Saksı false

    public static boolean sozcuk(String str) {
        String str1=str.toLowerCase();
        boolean sonuc=str1.substring(0,2).contains(str1.substring(str1.length()-2));
        return sonuc;
    }

//12-Kullanıcının konsoldan ad ve soyad bilgilerini konsoldan alın
//Ekrana "Soy isminiz ..(soyad).. dır." Yazan metodu yazınız.
//İnput: "Harun Özsoy "
//Output: "Soy isminiz Özsoy dır."
//İnput:" Harun Kenan Özsoy "
//Output: "Soy isminiz Özsoy dır."
//İnput: "Harun Kenan Can Özsoy "
//Output: "Soy isminiz Özsoy dır."
//İnput:" Harun Kenan Can Sami Özsoy"
//Output: "Soy isminiz Özsoy dır."

    public static String soyAdYazdır() {
        Scanner scan = new Scanner(System.in);
        String ad = scan.nextLine();
        String soyAd = scan.nextLine();
        String a=ad.trim();
        String b=soyAd.trim();
        String sonuc="\""+a.concat(" "+b)+"\"";
        String sonuc1="\"Soy isminiz "+b+" dır.\"";
        return sonuc+"\n"+sonuc1;
    }



//13-Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden
//çıkartarak sonuç döndüren metodu yazınız. (Büyük küçük duyarlı)
//Merhaba Merhab
//Ananas Anas


    public static String karekterSilerekYazma(String sozcuk) {
        String conct = "";
        while (!sozcuk.isEmpty()){
            conct+=sozcuk.charAt(0);
            sozcuk=sozcuk.replace(sozcuk.substring(0,1),"");

        }
        return conct;
    }

//14-Kullanıcıdan bir kelime alan ve sonucunda yinelenen kelimeleri string
//olarak return eden methot yazınız.
//" Java " output:a
//" Javva " output:av
//" Derslerime cok calisiyorum" output:erslimco

    public static String yineleme(String kelime) {
        kelime = kelime.replace(" ", "");
        String conct = "";
        while (!kelime.isEmpty()) {
            if (kelime.substring(1).contains(kelime.substring(0, 1) ) ) {
                conct += kelime.substring(0, 1);
            }
            kelime = kelime.replace(kelime.substring(0, 1), "");
        }
        return conct;
    }




//15-Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki ünlü ve ünsüz harfleri
//ayrı ayrı ekrana yazan programı yazınız.
//Ankara ünlü harfler=Aa
//Ünsüz harfler=nkr

    public static String unluUNsuz(){
        Scanner scan = new Scanner(System.in);
        String kelime = scan.nextLine();
        String unlu = "";
        unlu=unlu.toLowerCase();
        String unsuz="";
        for (int i=0;i<kelime.length();i++){
            switch (kelime.charAt(i)){
                case 'a':
                    unlu += kelime.charAt(i);
                    break;
                case 'e':
                    unlu += kelime.charAt(i);
                    break;
                case 'ı':
                    unlu += kelime.charAt(i);
                    break;
                case 'i':
                    unlu += kelime.charAt(i);
                    break;
                case 'o':
                    unlu += kelime.charAt(i);
                    break;
                case 'ö':
                    unlu += kelime.charAt(i);
                    break;
                case 'u':
                    unlu += kelime.charAt(i);
                    break;
                case 'ü':
                    unlu += kelime.charAt(i);
                    break;
                default:
                    unsuz+=kelime.charAt(i);
            }
        }
        return " ünlü harfler="+unlu+"\n unsüz harfler="+unsuz;
    }


  /* public static String unluUNsuz() {
        Scanner scan = new Scanner(System.in);
        String kelime = scan.nextLine();
        String unlu = "";
        unlu = unlu.toLowerCase();
        String unsuz = "";
        int i = 0;
        for (i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == 'a' || kelime.charAt(i) == 'e' || kelime.charAt(i) == 'ı' || kelime.charAt(i) == 'i' ||
                    kelime.charAt(i) == 'o' || kelime.charAt(i) == 'ö' || kelime.charAt(i) == 'u' || kelime.charAt(i) == 'ü') {
                unlu = kelime.charAt(i) + "";
            }else{
                 unsuz+=kelime.charAt(i);
            }
        }
        return " ünlü harfler=" + unlu + "\n unsüz harfler=" + unsuz;
    }*/






//16-Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin ilk 3
//harfini kelimeden keserek sonuna ekleyin.
//Merhaba habaMer
//Ali Ali


    public static String ilkucKelime(String a){
        String result="";
        a=a.replace(" ","");
        result= a.replace(a.substring(0,3),"");
        return result+a.substring(0,3);




    }

//17-Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin son 3
//harfini kelimeden keserek kelimenin başına ekleyin.
//Merhaba abaMerh
//Ali Ali

    public static String sonucKelime(String b) {
        String result = "";
        b = b.replace(" ", "");
        result = b.replace(b.substring(b.length()-3), "");
        return b.substring(b.length()-3)+result ;

    }



//18-Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun. (Büyük
//küçük harf gözardı edilecek.) Hiçbir harf benzersiz değil ise benzersiz harf yoktur
//ikazı versin.
//Merhaba M
//Araba r
//Karkas rotası o

    public static String ilkBenzersizHarf(String kelime) {
        kelime=kelime.replace(" ","").toLowerCase();
        String benzersizHarfler="";
        for(int i=0;i<kelime.length();){
            if(!kelime.substring(1).contains(kelime.substring(0,1))){
                benzersizHarfler+=kelime.substring(0,1);
                return benzersizHarfler;
            }
            kelime= kelime.replace(kelime.substring(0,1),"");

        }
        return benzersizHarfler;


    }

    //19-Kullanıcıdan iki kelime alın ve bu kelimeler aynı harflerden oluşuyorsa(her harf
    //eşit sayıda içerecek,büyük küçük harf göz ardı edilecek) true oluşmuyorsa false
    //yazdırın. (anagram kelime ise)
    //İftar – Tarif true
    //Zehra – Ezhar true
    //Nefes – Enfes true
    //Selcuk-Elyase false

    public static boolean ikiKelimeBenzer(String kelime, String kelime1) {
        kelime = kelime.toLowerCase();
        kelime1 = kelime1.toLowerCase();
        int count = 0;
        if (kelime.length() == kelime1.length()) {
            for (int i = 0; i < kelime.length(); i++) {
                if(kelime.contains(kelime1.substring(i,i+1))){
                    count++;
                }
            }
        }
        return count == kelime.length();
    }




    //20-Kullanıcıdan bir kelime alın ve ardı ardına tekrar eden harfleri döndüren metodu
    //yazın.
    //aabccccseeeeeefff acef
    //abaccb c
    //Arsız ardı ardına tekrar eden harf yoktur
    //amannsız n



    public static String ardiArdinaHarf(String kelime) {
        kelime = kelime.replace(" ", "").toLowerCase();
        String ardiArdinaHarf = "";
        while (!kelime.isEmpty()) {
            if (kelime.substring(0,1).equals(kelime.substring(1, 2))) {
                ardiArdinaHarf += kelime.substring(0,1);
            }
            kelime = kelime.replace(kelime.substring(0, 1), "");
        }
        return ardiArdinaHarf;
    }



    //21-Kullanıcıdan 1 ila 4 harf olacak şekilde 2 kelime alın, 1. veya 2. kelimeyi
//girdiğinde hatalı giriş yaparsa uyarı verin ve kullanıcıya düzeltme imkanı verin.
//Her kelime için 3 kere hatalı giriş yaparsa programı sonlandırın. Kullanıcı doğru
//giriş yaparsa 2 kelimeyi arada boşluk olacak şekilde sadece concat() metodu ile
//birleştirerek yazdırın.
//Slm
//Ali
//Slm Ali
    public static String hataliGiris(){
        Scanner scan=new Scanner(System.in);
        String a="";
        int b=3;
        String kelime=scan.nextLine();
        String kelime1=scan.nextLine();
        if(kelime.length()>4 || kelime1.length()>4) {
            System.out.println("yanlış girdiniz tekrar deneyin");
            for(int i=0;i<3;) {
                continue;
            }
        }else{
            a=kelime.concat(" "+kelime1);
        }

        return a;
    }

//tam çözüm yok




    //24 -Kullanıcıdan bir kelime alın ve bu kelimenin tersten okunuşu kelime ile aynı ise
    //true değil ise false döndüren metot yazınız.
    //Kabak true
    //Nalan true
    //Ara true
    //talat true
    //Kasaba false
    //ahmet false

    public static boolean terstenKelimeBenzer(String kelime ) {
        String holder="";
        for(int i=kelime.length()-1;i>=0;i--){
            holder+=kelime.charAt(i);
        }if(holder.equals(kelime)){
            return true;
        }else{
            return false;
        }

    }





    //25-Kullanıcıdan bir input alın ve bu inputun içerisinde kaç adet sev bulunduğunu
    //ekrana yazdırın.
    //Seni seviyorum 1
    //Sevmek veya sevmemek 2
    //Sev seni seveni , sevmek güzeldir. 3


    public static int kacAdetsev(String s){
        int count = 0;
        String kelime="sev";

        for (int i = 0; i < s.length()-kelime.length(); i++) {
            if(s.substring(i,i+kelime.length()).equalsIgnoreCase(kelime))
                count++;


        }
        return count;
    }



//tam ulaşamadım sonuca



    //26-Bursa ile Ankara kelimeli cümlenin içerinde aynı sayıda dönüyorsa true farklı
    //sayılarda dönüyorsa false yazdıran metodu yazınız.
    //Ankara ile Bursa arası 500 km. True
    //Ankara Bursa kadar yeşil değil. Bursa bir başka. False
    //İstanbul çok uzak false



    public static boolean kelimeKacAdetVar(String str){
        int length = str.length();
        int lengthANK = "Ankara".length();
        int lengthBUR = "Bursa".length();

        int totalAnkara = str.toLowerCase().replace("ankara".toLowerCase(), "").length();
        int totalBursa = str.toLowerCase().replace("bursa".toLowerCase(), "").length();
        int countAnkara = (length-totalAnkara)/lengthANK;
        int countBursa = (length-totalBursa)/lengthBUR;

        return countAnkara==countBursa;


    }





    //27-Kullanıcıdan bir kelime alın ve sonu acak ile bitiyorsa true bitmiyorsa false
    //döndüren metodu yazdırın.
    //Kullanacak true
    //Zamlanacak true
    //Farkındalık false
    //Farkında false

    public static boolean sonu(String kelime) {

        kelime = kelime.replace(" ","").toLowerCase();
        String son="acak";
        boolean sonuc = son.substring(0,4).contains(kelime.substring(kelime.length() - 4));
        return sonuc;

    }





//28-Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki harf sayılarını başına
//yazarak ekrana döndürün.(büyük küçük harfler göz ardı edilecek)
//Merhaba 1m1e1r1h2a1b
//Seni seviyorum 2s2e1n2i1v1y1o1r1u1m,


    public static String harfSayilari(String word){
        word.toLowerCase().replace(" ","");
        String sonuc=" ";

        for (int i = 0; i < word.length(); i++) {
            int count=0;
            for(int j=0;j<word.length();j++){
                if(word.charAt(i)==word.charAt(j)){
                    count++;
                }
            }
            if(word.contains(sonuc)) {
                continue;
            }
            if(sonuc.contains(""+count+word.charAt(i))){
                continue;
            }
            sonuc+=""+count+word.charAt(i);
        }
        return sonuc;
    }



    //29-Kullanıcıdan bir dize sözcük alın ve en çok harfi döndüren metodu yazınız.
    //Merhaba a
    //aaaaaaabbcccc a
    //eeemmmsssssssssshhhhhhhhhsss s
    public static String enCokDEgeriDonduren(String str){
        String sonuc="";
        int count;
        int adet=1;
        for(int i=0; i<str.length(); i++){
            count=0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count>adet){
                sonuc= str.charAt(i)+"";
                adet=count;
            }
        }
        return sonuc;

    }



    //30-sadece harfleri yazan program

    public static String sadeceHarf(String b) {
        String result = "";
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)>64 && b.charAt(i)<91||b.charAt(i)>96 && b.charAt(i)<123){
                result+=b.charAt(i);
            }
        }
        return result ;

    }





}
