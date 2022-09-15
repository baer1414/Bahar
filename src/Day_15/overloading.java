package Day_15;

public class overloading {
    public static void main(String[] args) {

   // CalculaterArea(3);
   // CalculateArea(5,9);
       // sayı(5,"sennur",true);
       // sayı(5,"bahar",false);



    }

    public static void CalculateArea(int a, int b) {
        int alan = a * b;
        System.out.println("alan=" + alan);
    }
    public static void CalculaterArea(int b){
        int r=b;
        double PI=3.14;
        double daireAlan=PI*r*r;
        System.out.println("dairenin aianı="+daireAlan);
    }

     public static void sayı(int a,String b,boolean c){
        if(c){
            System.out.println(b+a);
        }else{
       concat(b,a);
        }
     }
     public static void concat(String kelime,int d){
        for(int t=0; t<d;t++){
            System.out.println(kelime);
        }
     }


















}
