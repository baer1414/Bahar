package Day_41;

public class main_Polymorp {
    public static void main(String[] args) {
      /* ISporCar kirmizimelek=new ISporCar();
       kirmizimelek.start();
       kirmizimelek.speed();
       kirmizimelek.stop();
        System.out.println("*********");
       ICar beyazmelek=new ISporCar();
        System.out.println(beyazmelek.durmaMesafesi());
        beyazmelek.start();
       beyazmelek.stop();
        System.out.println("*****");
        IVehicle sarimelek=new ISporCar();
        sarimelek.start();
        sarimelek.stop();
        System.out.println(sarimelek.tekerSayisi());*/
      //  ICar beyazmelek=new ICar();
        //IVehicle sarimelek=new ISporCar();
        //System.out.println(sarimelek.getClass().getSimpleName());
      //  Kus limon=new Kanarya();
      //  Kus mavis=new Muhabbet();

      //  System.out.println(limon instanceof Muhabbet);

      //  Animal animal=new Animal();hatalı tanımlama
     //   Dog dog=(Dog)animal; hatalı

        Animal animal1=new Dog();
        Dog dog2=(Dog) animal1;
        System.out.println(dog2.ayakSayisi);
        dog2.sleep();


    }

}
