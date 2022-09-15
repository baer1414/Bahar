package Day_34;

public class BirtDay {
  static int cakeSlice=28;

    public void takesASlice(){
        cakeSlice--;

    }
    public void takeAslice(int count){
        cakeSlice-=count;
    }
}
class main2{
    public static void main(String[] args){

        BirtDay zafer=new BirtDay();
        BirtDay enes=new BirtDay();
        BirtDay ilyas=new BirtDay();
        BirtDay rıdvan=new BirtDay();
        BirtDay talip=new BirtDay();
        BirtDay ramazan=new BirtDay();
        BirtDay talha=new BirtDay();


         zafer.takesASlice();
         enes.takesASlice();
         ilyas.takesASlice();
         rıdvan.takesASlice();
         talip.takesASlice();
         ramazan.takesASlice();
         talha.takesASlice();
         zafer.takeAslice(3);
          System.out.println(zafer.cakeSlice);

        // System.out.println(BirtDay.cakeSlice);
    }
}
