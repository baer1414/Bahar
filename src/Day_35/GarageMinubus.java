package Day_35;

public class GarageMinubus {
    public static void main(String[] args) {
        Minibus minibus=new Minibus();
        minibus.type= "Minibus";
        minibus.color="Mavi";
        minibus.seat=14;
        minibus.sellPriceWithTaxt(50000);

        minibus.using();
        minibus.toString();

    }
}class GarajTruck{
    public static void main(String[] args) {
        Truck truck=new Truck();
        truck.carryingCapasite=16000;
        truck.type="truck";
        truck.color="sarı";
        truck.sellPriceWithTaxt(120000);
        truck.carring();
        truck.toString();
    }
}
