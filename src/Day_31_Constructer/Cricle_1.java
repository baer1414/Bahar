package Day_31_Constructer;

public class Cricle_1 {
    private double radius;
    private final double PI=3.14;


    public Cricle_1(){}
    public Cricle_1(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double circlArea(){
        return this.PI*this.radius*this.radius;
    }
    public static double cirArea(double radius){
        return Math.PI*radius*radius;
    }
}
