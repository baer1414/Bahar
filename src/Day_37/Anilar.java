package Day_37;

public class Anilar {
    String str;
    boolean isActive;
    int num;

    public void firstMet(){
        System.out.println("firs method");
    }
   public Anilar(){

   }
   public Anilar(String str){
        this.str=str;
   }
   public Anilar(String str, boolean isActive){
        this(str);
        this.isActive=isActive;
   }



}
