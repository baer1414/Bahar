package Day_13;
import java.util.*;
public class DoWhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


       /* int i=6;
        do{
            System.out.println("merhaba dünya");
            i++;
        }while(i<5);
        System.out.println(i);*/


// toplam sıfır ise programdan cıksın

//1 yol
      /*  do{
            System.out.println("toplam sıfır ise programdan cıkış olacak");
            System.out.println("bir sayı giriniz");
            int sayi= scan.nextInt();
            System.out.println("bir sayı giriniz");
            int sayi1= scan.nextInt();

            System.out.println(" toplam="+(sayi+sayi1));
            if(sayi+sayi1==0){
                break;
            }

        }while(true);
//ıkınci yol
    boolean c=true;
        do{
            System.out.println("toplam sıfır ise programdan cıkış olacak");
            System.out.println("bir sayı giriniz");
            int sayi= scan.nextInt();
            System.out.println("bir sayı giriniz");
            int sayi1= scan.nextInt();

            System.out.println(" toplam="+(sayi+sayi1));
            if(sayi+sayi1==0){
              c=false;
            }

        }while(c);*/

//3 yol
      /* int i=0;
        do{
            System.out.println("toplam sıfır ise programdan cıkış olacak");
            System.out.println("bir sayı giriniz");
            int sayi= scan.nextInt();
            System.out.println("bir sayı giriniz");
            int sayi1= scan.nextInt();

            System.out.println(" toplam="+(sayi+sayi1));
            if((sayi+sayi)==0){
                break;
            }
            i++;
        }while(i<10);*/

       /* Random random = new Random();
        int i = random.nextInt(50);

        System.out.println("Tuttuğum sayıyı bul bakalııııım 5 hakkın var");
        int j = 1;
        do {
            System.out.print(j + " Tahmin: ");
            int tahmin = scan.nextInt();
            if (tahmin == i) {
                System.out.println("tebrikler sayıyı buldun");
                break;
            } else if (tahmin > i) {
                System.out.println("aşağı");
            } else {
                System.out.println("yukarı");
            }
            j++;
        } while (j < 6);
        System.out.println(i);
        System.out.println("Tuttuğum sayı"+i);*/
































    }
}
