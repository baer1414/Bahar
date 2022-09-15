package Day_12_nestedAndWhileLoops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

      /*  int i=0;
       while(i<5){
           System.out.println("bahar");
           i++;
       }

        int i=0;
         while(i<=20){
             System.out.println("merhaba dünya");
             i++;
         }

        int i=0;
        while(i<100){
            System.out.println(i);
            i++;
        }
        int i=100;
        while(0<=i){
            System.out.println(i);
            i--;
        }

        int i=0;
        while(i<=100){

            System.out.println(i);
            i+=2;
        }

        int i=1;
        while(i<=100){

            System.out.println(i);
            i+=2;
        }

        int i=10;
        while(i<1000){

            System.out.println(i);
            i+=10;
        }


      int sonuc=1;
      int i=3;
        while(i<20){
            sonuc=i*i*i;
            System.out.println(i+" ³= "+sonuc);
           i+=3;
        }*/

        Scanner scan=new Scanner(System.in);
        String exit="x";
        while (true){
            System.out.println("lütfen kelime giriniz: ");
            String kelime= scan.next();
            if(kelime.equals("x")){
                break;
            }
            System.out.print("kaç defa yazdırmak istersiniz: ");
            int repeat=scan.nextInt();
            for(int i=0;i<repeat;i++){
                System.out.println(kelime);
            }
        }












    }
}
