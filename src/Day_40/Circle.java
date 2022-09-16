package Day_40;

public class Circle extends Square implements Geometric  {

    public Circle(double a) {
        super(a);
      }

    @Override
    public double getArea(double expo) {
        return PI*Math.pow(a,expo);
    }
}
