package Day_15;
import java.util.*;
public class deneme {
    public static void main(String[] args) {

           //startProce();

      //dugunKarti();
        String message="Düğün kartınız için gelin ve damadın ismini girin lütfen";
        startProcess(message);

    }

    public static void startProce() {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi = scan.nextInt();
        System.out.println("ikinci sayı giriniz");
        int sayi1 = scan.nextInt();
        if (sayi1 % 3 != 0) {
            sum(sayi,ücKatiSayi(sayi1));

        } else {
            sum(sayi,sayi1);
        }
    }
        public static int ücKatiSayi(int a){
      int sonuc;
      if(a%3>1){
          sonuc=a+1;
      }else{
          sonuc=a-a%3;
      }
      return sonuc;
          }

        public static void sum(int a,int b){
            System.out.println(a+b);


        }


      public static void startProcess(String message){
          Scanner scan = new Scanner(System.in);
          System.out.println(message);
          String  isim= scan.nextLine();
          String  isim2= scan.nextLine();
          if(isim.equals(isim2)){
         goingProces();
          }else{
           goingProces(isim,isim2);
          }
      }

      public static void goingProces(){
         String message="girmiş olduğunuz isimler aynı lütfen farklı isim girin";
        startProcess(message);
     }

       public static void goingProces(String str1,String str2){
           System.out.println("--------------------");
           System.out.println("***"+str1+"&"+str2+"***");
           System.out.println("Eylülde güzel bir günde ");
           System.out.println("Mutluluğumuza davetlisiniz ");
           System.out.println("        ********            ");
           System.out.println("------♥♥♥♥♥♥♥♥♥♥♥---------");







  }

















































}
