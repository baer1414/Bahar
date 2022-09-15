package Day_34;

public class outer {
    static class nested{
        public static void message(){
            System.out.println("selam static class dan");
        }
    }
    class inner{
        public void messag(){
            System.out.println("selam inner class dan");
        }

    }



}
class main6{
    public static void main(String[] args){
       outer.nested.message();
       outer ot=new outer();
       
    outer.inner selam=ot.new inner();

      // outer.inner selam=new outer().new inner();
       selam.messag();



    }
}