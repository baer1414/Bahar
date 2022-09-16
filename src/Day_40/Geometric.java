package Day_40;

public interface Geometric {
    int exponential=2;
    double PI=3.14;
    double getArea(double expo);

    default double getPrimeter(double... sides){

        double primetr=0;

        for(double side:sides){
            primetr+=side;
        }
        return primetr;
    }
   // static double getExponential(double d){
    //    return exponential+d;
   // }
}
class Square implements Geometric{

    double a;

    public Square(double a) {
        this.a = a;
    //  System.out.println(getArea(Geometric.exponential));
       // System.out.println(getPrimeter(this.a, this.a, this.a, this.a));
    }

    @Override
    public double getArea(double expo) {
        return Math.pow(a,expo);
    }
}
class run{
    public static void main(String[] args) {
        Square square1=new Square(4);
     //   System.out.println(square1.getArea(3));
       // System.out.println(square1.getPrimeter(5,5,5,5));
Circle circle=new Circle(3);
        System.out.println(circle.getArea(Geometric.exponential));
    }
}
