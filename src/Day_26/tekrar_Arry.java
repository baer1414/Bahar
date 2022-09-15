package Day_26;

import java.util.Arrays;
import java.util.Random;

public class tekrar_Arry {

        // System.out.println(toplam(sayi));
        //System.out.println(ciftToplamı(sayi));
        // System.out.println(toplamıÜcSayı(sayi));
        // System.out.println(enBuyukKucuk(sayi));
        //System.out.println(Arrays.toString(tumIndexEnKucukSayi(sayi)));
        // System.out.println(Arrays.toString(indexAtayan(5,12)));
        // System.out.println((arrControl(sayi, sayi1)));
        //  System.out.println(Arrays.toString(tersArry(sayi)));
        // System.out.println(Arrays.toString(rastgele(100)));
        //System.out.println(Arrays.toString(rastgeleElliSeksenArası(100)));
        // System.out.println(rastgele125KacAdet(500));
        // System.out.println(dublice(sayi));
        // String a="Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek \n" +
        //        "dolu karnı horlarken bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp \n" +
        //        "sesin olduğu tarafa gitti, filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının \n" +
        //      "üzerine oturdu, salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu";
        // System.out.println(oKacAdet(a));
        //  System.out.println(dublicekelime("araba ile yola çıktık fakat araba arıza yapt"));

       // System.out.println(Arrays.toString(yalnızsayilar(sayi)));
       // System.out.println(encokSayi(sayi));
      //  System.out.println(Arrays.toString(degeratamacontrol(sayi,5,8,1)));




    public static int toplam(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            count += a[i];
        }
        return count;
    }


    public static int ciftToplamı(int[] b) {
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 == 0) {
                count += b[i];
            }

        }
        return count;
    }


    public static int toplamıÜcSayı(int[] b) {
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] == 3) {
                count += b[i];
            }

        }
        return count;
    }

    public static int enBuyukKucuk(int[] b) {
        int max = b[0], min = b[0];
        for (int i = 0; i < b.length; i++) {
            if (max < b.length) {
                max = b[i];
            } else if (b.length < min) {
                min = b[i];
            }

        }
        return max - min;
    }


    public static int[] tumIndexEnKucukSayi(int[] b) {
        int[] yen = new int[b.length];
        int min = b[0];
        for (int i = 0; i < b.length; i++) {
            if (min > b.length) {
                min = b[i];
            }
            for (int j = 0; j < b.length; j++) {
                yen[j] = min;
            }

        }
        return yen;
    }


    public static int[] indexAtayan(int a, int b) {

        int max = Math.max(a, b);
        if (max == a) {
            int[] yen = new int[(a - b + 1)];
            for (int i = 0; i < yen.length; i++) {
                yen[i] = b + i;
            }
            return yen;

        } else {
            int[] yen = new int[b - a + 1];
            for (int i = 0; i < yen.length; i++) {
                yen[i] = a + i;
            }
            return yen;
        }

    }


    public static int[] arrayBirlestir(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0, j = 0; i < result.length; i++) {
            if (i < a.length) {
                result[i] = a[i];
            }
            if (i > a.length - 1) {
                result[i] = b[j];
                j++;
            }
        }

        return result;
    }

    public static boolean arrControl(int[] a, int[] b) {
        firstLopp:
        for (int i = 0; i < a.length; i++) {
            secondLoop:
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    continue firstLopp;

                }
                continue secondLoop;
            }
            return false;
        }
        return true;
    }


    public static int[] tersArry(int[] arr) {
        int[] yeni = new int[arr.length];
        for (int i = yeni.length - 1, j = 0; j < yeni.length; i--, j++) {
            yeni[j] = arr[i];
        }
        return yeni;
    }


    public static int[] rastgele(int boyut) {
        Random random = new Random();
        int[] yen = new int[boyut];
        for (int i = 0; i < boyut; i++) {
            yen[i] = random.nextInt(100);
        }
        return yen;
    }


    public static int[] rastgeleElliSeksenArası(int boyut) {
        Random random = new Random();
        int[] yen = new int[boyut];
        for (int i = 0; i < boyut; i++) {
            yen[i] = random.nextInt(30) + 50;
        }
        return yen;
    }

    public static int rastgele125KacAdet(int boyut) {
        Random random = new Random();
        int[] yen = new int[boyut];
        int count = 0;
        for (int i = 0; i < boyut; i++) {
            yen[i] = random.nextInt(20) + 120;
            if (yen[i] == 125) {
                count++;

            }
        }
        return count;
    }


    public static boolean dublice(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    return true;
                }
            }
        }
        return false;
    }


    public static int oKacAdet(String a) {
        a.toLowerCase().replace(" ", "");
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'o') {
                count++;

            }
        }
        return count;
    }

    public static boolean dublicekelime(String a) {
        a = a.toLowerCase();
        String[] strArry = a.split("");
        for (int i = 0; i < strArry.length; i++) {
            for (int j = 0; j < strArry.length; j++) {
                if (i != j && strArry[i].equals(strArry[j])) {
                    return true;
                }
            }
        }
        return false;
    }


    public static int enbuyukikincisayi(int[] arr){
        int a=arr[0];
        int b=arr[0];
        for(int sayi :arr){
            if(sayi>a)
                a=sayi;
            }
            for(int sayi :arr){
                if(sayi>b && sayi<a)
                    b=sayi;
                }
        return b;
    }

public static boolean ardardavarsa(int[] a){
        if(a.length<3){return false;}
        for(int i=0;i<a.length-2;i++){
            if(a[i]==a[i+1]-1&&a[i]==a[i+2]-2){
                return true;
            }
        }
        return false;
}


public static String[] yalnızsayilar(int[] b) {
    String yalnızSayilar = "";
    if (b.length == 1) {
        yalnızSayilar += b[0] + " ";
        return yalnızSayilar.split(" ");

    }
    if (b[0] != b[1]) {
        yalnızSayilar += b[0] + " ";

    }
    for (int i = 1; i < b.length - 1; i++) {
        if (b[i] != b[i - 1] && b[i] != b[i + 1])
            yalnızSayilar += b[i] + " ";

    }
    if (b[b.length - 1] != b[b.length - 2]){
        yalnızSayilar += b[b.length - 1] + " ";
}

    return yalnızSayilar.split(" ");

}

public static int encokSayi(int[] a){
        int encok=-1;
        int count=0;
        int adet=0;
        for(int i=0;i<a.length;i++){
            count=0;
            for (int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }

            }
            if(count>adet){
                encok=a[i];
                adet=count;
            }
        }
        return encok;
}



    public static boolean dublicecon(String a) {
        a = a.toLowerCase();
        String[] strArry = a.split("");
        for (int i = 0; i < strArry.length; i++) {
            for (int j = 0; j < strArry.length; j++) {
                if (i != j && strArry[i].equals(strArry[j])) {
                    return true;
                }
            }
        }
        return false;
    }



public static int[] indexAtama(int[] a){

        int min=a[0];
        for(int sayi:a){
            if(sayi<min){
                min=sayi;
            }
        }
    int[] yen=new int[a.length];
       yen[0]=min;
       for(int i=1;i<yen.length;i++){
           yen[i]=0;
       }
       return yen;
}


    public static int[] degeratamacontrol(int[] a,int ilkdeger,int controldeger,int atanacaksayi){
        int[] yen=new int[a.length];
        yen[0]=a[0];
        for(int i=0;i<yen.length-1;i++){
            if(a[i]==ilkdeger&& a[i+1]==controldeger){
                yen[i+1]=atanacaksayi;
            }
            else{
                yen[i+1]=a[i+1];
            }
        }
        return yen;
    }


//Örnek 22:Array’in içerisindeki asal sayıları bularak ekrana yazdıran metodu yazınız.
//[21,7,29,12] ----→ 7 2

public static String asalsayibul(int[] arr){
        String result="";
       firstloop: for(int sayi:arr){
            if(sayi==2){result+=sayi+" ";}
            else if(sayi==0 || sayi==1)
            {continue firstloop;}
            else{
                for(int i=2;i<sayi;i++){
                    if(sayi%i==0){
                        continue firstloop;
                    }
                }
                result+=sayi+" ";
            }
        }
        return result;
}

    //Örnek 24:Array’in içerisindeki ard arda aynı olan sayıları hariç tutarak dublicate olmayan sayıların
    //toplamını veren metodu yazınız.
    //[1,1,2,3] → 5
    //[2,5,5,5,9] →11
    //[5,5,5,5,9] →9
    //[5,5,5,5,5] →0
    //[5,1,5,1,5] →17
    public static void main(String[] args) {

        int[] sayi = {1,1,2,3};
        int[] sayi1 = {5,5,5,5,5};
        System.out.println(dublicaolmayan(sayi1));
    }
public static int dublicaolmayan(int[] a){
        int sonuc=0;
   firtLoop: for (int i=0; i<a.length; i++) {
       int j;
       for (j = 0; j < a.length - 2; j++)
           if (i!=j && a[i] == a[j]){
           continue firtLoop;
       }else{

       }
       sonuc += a[i];
   }
    return sonuc;
}







}