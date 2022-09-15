package Day_35;

public class Truck extends Vehicle {

    int carryingCapasite;
    public void carring(){
        System.out.println(color+" "+type+" "+carryingCapasite+" yük taşır");
    }


    public String toString() {
        return "Truck{" +
                "carryingCapasite=" + carryingCapasite +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
