package Day_18;

public class StringMethods {
    public static void main(String[] args) {

        // length karakter boşluğu


        String str= "perşembe";
       // System.out.println("str.length() = " + str.length());
       // int i=str.length();
      //  System.out.println(i);

        //toUpperCase()   toLowerCase  buyuk küçük cevirir

             /*  String str3=" Perşembe ve Cuma GünLeri";
                       str3.toUpperCase();
                System.out.println(str3.toUpperCase());
                str3.toLowerCase();
              System.out.println(str3.toLowerCase());*/

        //charAt()  son harfini yazdıyor


       // String str4="kkskd dldkkfk jjgkgkhgl jjdkdlld kkdjdhhd";

       // System.out.println("str4.charAt(str4.length()-1) = " + str4.charAt(str4.length() - 1));


        //String str5="annemi çok şseviyorum";
       // System.out.println("str5.charAt(str5.length()-1) = " + str5.charAt(str5.length() - 1));
        //    char ch=str.charAt(0);
// concat() iki string birbirne bağlar


       // String str5="selam arkadaşlar ";
      //  String str6="nasılsınız";
       // String concat=str5.concat(str6);
       // System.out.println("concat= " +concat);
//contains true veya false döndürür boşluk ve karakterleri bulur
      // String str8="Selam Arkadaşlar ";
      //  System.out.println(str8.contains("das" ));
// Trim() boşluğu kaldırır

      String str8="Selam Arkadaşlar       ";
       // System.out.println(str8.trim());
//replace() değiştiyor

      //  System.out.println(str8.trim().replace("Selam", "Merhaba" ));
// indexOf() ilk kelimenin index verir
        System.out.println(str8.indexOf("Ark" ));

     //equals iki string değerinin aynı oldugunu gösteriyor
        //equalsslgnorecase








    }
}
