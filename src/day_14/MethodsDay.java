package day_14;
import java.util.*;
public class MethodsDay {
    public static void main(String[] args) {
        // aritmatik();
        //sayılar();
        // kilo();
        //  short s=5;
        // message4(5);
       // message5("perşembe", 11);

         //kuvvet(5,2);
       // toplama(5,4);

       // işlem(3,2,"*");

              //   sum(5,4);
      //  System.out.println(sum(5,4));
       // int sonuc=sum(5,4);
       // System.out.println("sonuc="+sonuc);

         //calcuLateArea(5,4);

       // concat(5,"bahar",false);
         concat("bahar",5);

    }
  public static void aritmatik(){
        Scanner scan=new Scanner(System.in);
        System.out.println("3 sayı aritmatik ortalama");
        System.out.println("bir sayı giriniz");
        int a= scan.nextInt();
        System.out.println("ikinci sayı giriniz");
        int b= scan.nextInt();
        System.out.println("üçüncü sayı giriniz");
        int c= scan.nextInt();
        System.out.println("ortalama="+(a+b+c)/3);
    }
    public static void sayilar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("2 sayı yazın buyuk olan ");
        System.out.println("bir sayı giriniz");
        int a = scan.nextInt();
        System.out.println("ikinci sayı giriniz");
        int b = scan.nextInt();
        if (a > b) {
            System.out.println(a + "büyüktür");

        } else {
            System.out.println(b + "büyüktür");
        }
    }
       public static void kilo(){
       Scanner scan=new Scanner(System.in);

       System.out.println("bir kilo giriniz");
       int k= scan.nextInt();

           double okka=k/1.282;
               System.out.println(okka);
      }

    public static void message4(int num){
        System.out.println(num+"burada");
        System.out.println(num+3);
    }

    public static void message5(String str, int i){
        System.out.println("ayın" +str+ " i" +i+ " dir");
    }


    public static void kuvvet( int i,int j){
      double pow= Math.pow(j,i);
        System.out.println((int)pow);
    }

    public static void toplama( int i,int j){

        System.out.println(i+"+"+j+"="+(i+j));
    }

    public static void işlem( int i,int j,String str){
        System.out.println(i+"*"+j+"="+(i*j));

    }

       public static int sum (int a, int b){

        return a+b;
    }

        public static int islem(int a,int b){
        return a+b;
        }

        public static void calcuLateArea(int a, int b){
        System.out.println(a*b);
    }
        public static void calcuLateArea(int r){
           double PI=3.14;

            System.out.println(PI*r*r);
}

        public static void concat (int i,String s,boolean bl) {
       if(bl){
           System.out.println(s + i);
       }else{
           concat(s,i);
       }

    }

    public static void concat(String kelime,int c){
        for(int t=0;t<c;t++){
            System.out.println(kelime);
        }
    }

















































   }
