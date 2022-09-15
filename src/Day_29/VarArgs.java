package Day_29;

public class VarArgs {
    public static void main(String[] args) {
        sum(5,8,8);
        sum(5,10,11,12,15,18);
        sum(5,8,8,4,5,6,6);
        sum1(5,8,8,4,5,5,5);
        sum1(5,8,8,4,7,8,9,6,4,5);

       // concat("ja","va");
      //  concat("ja","va"," ","insanları");
       // System.out.println(concat1("JAVA", "PYTHON", "BHP"));


    }

    public static void sum(int... sayılar){
      //  System.out.println(sayılar[0]);
       // System.out.println(sayılar.length);
        int sum=0;
        for(int i:sayılar){
            sum+=i;
        }
        System.out.println("Girilen"+sayılar.length+" nın toplamı : "+sum);
    }

public static void concat(String... strs){
        String empty="";
        for(String s: strs){
            empty+=s;
        }
    System.out.println(empty);
}

public static String concat1(String... strs){
        String empty= "";
        for(int i=0; i< strs.length;i++){
            empty+=strs[i].charAt(i);
        }
        return empty;
}

public static void sum1(int... sayilar){
        int sonuc=0;
        for(int sayi:sayilar){
            sonuc+=sayi;
        }
    System.out.println(sonuc);
}



}
