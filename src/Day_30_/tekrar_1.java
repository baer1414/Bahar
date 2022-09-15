package Day_30_;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class tekrar_1 {
    public static void main(String[] args) {

   /* ArrayList<String> name=new ArrayList<String>();
    name.add("bahar");
    name.add("ramiz");
    name.add("ramazan");
    name.add("hulya");

        System.out.println(name);
    name.add(2,"osman");
        System.out.println(name);
        name.set(3,"rıza");
        System.out.println(name);

        name.remove(0);
        System.out.println("name = " + name);
        System.out.println(name.indexOf("ramiz"));
        System.out.println(name.get(0));
        ArrayList<String> name1=new ArrayList<>();
        name1.add("ramiz");
        name.removeAll(name1);
        System.out.println(name);*/


        int[] arr={0,1,2,3,4,5};
        System.out.println(sayiKaydir(arr, 1));


    }
//kayan sayılar interview sorusu: Girilen sayılar kayma miktarına göre sağa kaydırılması
//gerekmektedir. Fakat sağa doğru kayan sayılar soldan tekrar giriş yapabilmeli.
//metod(sayilar,kaymaMiktari)
//
//0,1,2,3,4,5 girildi kayma miktarı 2 ise 4, 5, 0, 1, 2, 3
//0,1,2,3,4,5 girildi kayma miktarı 4 ise 2, 3, 4, 5, 0, 1
    public static ArrayList<Integer> sayiKaydir(int[] array,int kaymaMiktari){
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int sayi:array) {
            arrayList.add(sayi);
        }

        for(int i=0; i<kaymaMiktari; i++){
            arrayList.add(0,arrayList.remove(arrayList.size()-1));
        }
        return arrayList;

    }
    //Girilen sayılar kayma miktarına göre sağa kaydırılması
//gerekmektedir. Fakat sağa doğru kayan sayılar soldan tekrar giriş yapabilmeli.
//metod(sayilar,kaymaMiktari)
//
//0,1,2,3,4,5 girildi kayma miktarı 2 ise 4, 5, 0, 1, 2, 3


    public static ArrayList<Integer> kayma(int [] arr, int kaymamik){
        ArrayList<Integer> ar=new ArrayList<>();
        for (int sayi:arr) {
            ar.add(sayi);
        }
        for (int i = 0; i < kaymamik; i++) {
            ar.add(0,ar.remove(ar.size()-1));

        }
        return ar;
    }


























}