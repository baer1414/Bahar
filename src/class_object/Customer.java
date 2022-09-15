package class_object;

public class Customer {
    public static void main(String[] args) throws InterruptedException {
        Vehicle vehicle_1=new Vehicle();

        vehicle_1.type=" kamyon";
        vehicle_1.color="mavi";
        vehicle_1.tires=10;
        vehicle_1.price=2000;

        vehicle_1.getInfo();
        vehicle_1.setWinter();
        vehicle_1.forRent();
       // vehicle_1.forRenOption(3);
        int i=1;
        while (i<11){
            vehicle_1.forRenOption(i);
            i++;
           Thread.sleep(3000);
            if(i==5){
                vehicle_1.price=vehicle_1.price-200;
            }
        }







    }
}
