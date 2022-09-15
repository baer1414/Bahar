package Day_15;

public class Methods {
    public static void main(String[] args) {

       // System.out.println(sonNumara(20,10));
        //System.out.println(asalSayi(37));

       // System.out.println(negatifPozitif(-5));

       // System.out.println(gecmeNotu(90,80, 50));



    }
    public static boolean sonNumara(int a,int b){
    if(a%10==b%10){
        return true;
    }

        return false;
    }


    public static boolean asalSayi(int a) {
        if (a ==0|| a==1) {
            return false;
        }else{
            for(int i=2; i<a; i++){
               if (a%i==0){
                   return false;
               }
            }
        }
        return true;
       }


    public static int negatifPozitif(int a) {
     return a>0 ? a : -a;
           // return Math.abs(a);
        }


        public static char gecmeNotu(double note1,double note2,double note3){
        double ortalama=(note1+note2+note3)/3;

        if(ortalama>=76 && ortalama<100 ){

           return 'A';
    }else if(51<=ortalama && ortalama<=75){

        return 'B';
    }else if(50>=ortalama && ortalama>=0){
        return 'C';
    }
        return 'x';
    }























}
