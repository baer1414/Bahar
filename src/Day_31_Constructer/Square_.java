package Day_31_Constructer;

public class Square_ {
   public int kenarUzunlugu;

   public Square_(){
      System.out.println("karedir");
   }
   public Square_(int kenarUzunlugu) {
      this.kenarUzunlugu = kenarUzunlugu;
   }
   public int SquareAlan(){
     return this.kenarUzunlugu*this.kenarUzunlugu;

      }

   public int SquareCevresi(){
      return this.kenarUzunlugu*4;


   }




}
