package day_14;
import java.util.*;
public class Deneme {
    public static void main(String[] args) {
       // message2();
         //aritmatik();
       // buyukSayi();
      //  okkaHesap();
        //messages(5);
       // message5("perşembe",11);
       //yasHesaplama(1988);
        //kuvvet(2,3);
        //toplam(5,6);
       // sayi(2,2,"+");
        //calclater(4,5,"*");


    }

    public static void message() {

    }

    public static void message1() {

    }
    public static void message2(){
        message3();
    }
    public static void message3(){
        System.out.println("meesage3= HELLO WORD");
    }
    public static void aritmatik(){
        Scanner scan=new Scanner(System.in);
        System.out.println("birinci sayıyı girin");
        int a= scan.nextInt();
        System.out.println("ikinci sayıyı girin");
        int b= scan.nextInt();
        System.out.println("üçüncü sayı girin");
        int c= scan.nextInt();
        System.out.println("ortalama="+(a+b+c)/3);
    }
       public static void buyukSayi() {
           Scanner scan = new Scanner(System.in);
           System.out.println("birinci sayıyı girin");
           int a = scan.nextInt();
           System.out.println("ikinci sayıyı girin");
           int b = scan.nextInt();
           if(a>b){
               System.out.println("büyük sayı="+a);
           }else{
               System.out.println("büyük sayı="+b);
           }
       }
        public static void okkaHesap(){
            Scanner scan = new Scanner(System.in);
            System.out.println("kilo giriniz");
            int kilo= scan.nextInt();
            System.out.println("kilo="+(int)(kilo/1.282));
        }
        public static void messages(int i){
            System.out.println(i+" burada");

        }
        public static void message5(String str,int i){
            System.out.println(" Ayın "+i+ " i "+str+"dir.");

        }

        public static void yasHesaplama(int born){
            System.out.println(2022-born);
        }
        public static void kuvvet(int a,int b){
           double pow=Math.pow(b,a);
            System.out.println(pow);
            //System.out.println(Math.pow(b,a));
        }
        public static void toplam(int i,int y){
            System.out.println(i+"+"+y+"="+(i+y));
        }
        public static void sayi(int a,int b,String c){
            System.out.println(a+"+"+b+"="+(a+b));
        }
        public static void calclater(int a,int b,String s){
            if (s.equals("+")){
                System.out.println(a+b);
            }else if(s.equals("-")){
                System.out.println(a-b);
            }else if(s.equals("*")){
                System.out.println(a*b);
            }else if(s.equals("/")){
                System.out.println(a/b);
            }else{
                System.out.println("matematiksel işlem geçerli değil ");
            }
        }

















}
