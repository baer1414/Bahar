package Day_24;

import java.util.Arrays;

public class MultiDimensinal {
    public static void main(String[] args) {

 int[] arr=new int[7];
 arr[0]=0;
 arr[1]=2;
 arr[2]=3;
 arr[3]=4;
 arr[4]=5;
 arr[5]=6;
 arr[6]=7;
        int[] a={1,2,3,4,5};

      //  System.out.println(buyukse(arr));
      //  System.out.println(konrol(arr));
      //  System.out.println(esit(arr,a));
       // System.out.println(Arrays.toString(yeniArr(arr,a)));
       // System.out.println(Arrays.toString(birlestir(arr,a)));
       // System.out.println(enBuyuk(arr));
        System.out.println(Arrays.toString(yerdegistirme(arr)));


    }

    public static boolean buyukse(int[] arr){
       if(arr.length>5) {
           return true;
       }else{
        return false;
       }

    }



    public static boolean konrol(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 5) {
                return true;
            }
        return false;
    }

    public static boolean esit(int[] arr,int[] a) {
           return arr[0] == a[0];


    }



    public static int[] yeniArr(int[] arr,int[] a) {
       int[] yen=new int[2];
      yen[0]=arr[0];
       yen[1]=a[0];
       return yen;



    }


    public static int toplm(int[] arr) {
        int toplam=0;
        for(int i=0;i<arr.length;i++){
            toplam+=arr[i];
        }

        return toplam;



    }




    public static int[] birlestir(int[] arr,int[] a) {
        int[] yen=new int[arr.length+a.length];
        for(int i=0;i<arr.length+a.length;i++){
            if(i<arr.length){
                yen[i]=arr[i];
            }else {
                yen[i] = a[i-arr.length];
            }
        }

        return yen;

    }







    public static int enBuyuk(int[] arr) {
         int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
               max=arr[i];
            }
        }
        return max;
    }


    public static int[] yerdegistirme(int[] arr) {
       int temp=arr[0];
       arr[0]=arr[arr.length-1];
       arr[arr.length-1]=temp;

        return arr;
    }









}
