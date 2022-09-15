package Day_15;
import java.util.*;
public class deneme1 {
    public static void main(String[] args) {

       // bahar(5,63);
        //System.out.println(bahar(5,63));

        // ramiz(255,236);
        //System.out.println( ramiz(255,236));
         //boolean bl= ramiz(255,236);
        //System.out.println("bl =" + !bl);

       // System.out.println(asal(8));
        System.out.println(ortalama(70, 70, 70));

    }
    public static int bahar(int a,int b){
        return a+b;
    }
    public static boolean ramiz(int sayi,int sayi1){
             if(sayi%10==sayi1%10){
                 return true;
             }
                 return false;
    }

       public static boolean asal(int a){
        if(a==0 || a==1){
            return false;
        }else{
            for(int i=2; i<a;i++){
               if (a%i==0){
                   return false;
                }
            }
        }
        return true;
    }

       public static char ortalama(int a,int b, int c) {
         char not='x';
          int  ortlama=(a+b+c)/3;
            if(76<=ortlama && 100>=ortlama) {
            return 'A';
            } else if(51<=ortlama && 75>=ortlama){
            return 'B';
            }else if(50>=ortlama && 0<=ortlama){
                return 'C';
            }
            return not;

      }























}
