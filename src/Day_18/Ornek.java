package Day_18;

public class Ornek {
    public static void main(String[] args) {

   //  basHarf("bahar","leblebi");
      //  System.out.println(sayisi("javayı seviyor muyum"));
       // System.out.println(sesliharf("seni cok seviyorum"));

       // sevgi();
//name();
  isim();
//uzun();




    }


    public static void basHarf(String ad,String soyAd){
        System.out.println(soyAd.indexOf(ad.charAt(0)));

    }

    public static int sayisi(String a){
       int count=0;
       for(int i=0;i<a.length();i++){
           if(a.charAt(i)=='y' || a.charAt(i)=='Y'){
               count++;
           }
       }
       return count;
    }

        public static String sesliharf(String b){
        String holder="";
        for (int i=0;i<b.length();i++){
            switch (b.charAt(i)){
                case 'a':
                holder+= b.charAt(i);
                break;
                case 'e':
                holder+= b.charAt(i);
                break;
                case 'ı':
                holder+= b.charAt(i);
                break;
                case 'i':
                holder+= b.charAt(i);
                break;
                default:
            }

        }
            return holder;
}

public static void sevgi(){
    String  mesaj=" bayramları seviyorum";
        mesaj.contains("sev");
        while (true){
            System.out.println("ne hoş bir insan");
            break;
        }

}
public static void name(){
        String ad="bahar";
        for (int i=0;i<3;i++){
            System.out.println(ad.substring(ad.length()-3));
        }
}
public static void isim(){
        String ad="bahar";
    System.out.println(ad.substring(ad.length()/2-1,ad.length()/2+2));
}


    public static void uzun(){
        String ad="bahar",soyAd="eren";
        if(ad.length()>soyAd.length()){

            System.out.println(ad.substring(0, soyAd.length()).concat(soyAd));

        }else if(soyAd.length()>ad.length()){

            System.out.println(ad.concat(soyAd.substring(0, ad.length())));
        }else{
            System.out.println(ad.concat(soyAd));
        }
    }













}
