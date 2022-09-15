package Day_38;

 public class Parent {
    protected int num=100;
  static int x=0;


   {
        System.out.println("instance initalize");
        x++;
    }
    {
        System.out.println("2.instance initalize");

    }
    static{
        System.out.println("static initalize");
    }

     Parent() {
        // System.out.println("Constructor calıştı");

     }
   public static void run(){
         System.out.println("parents run");
     }
}
