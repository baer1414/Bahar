package Day_39;

public abstract class Geometri {
    String nameOfShape;



    public Geometri(String nameOfShape) {
        this.nameOfShape = nameOfShape;
    }

    abstract double area();
     abstract String info();
    String getNameOfShape(){
        return nameOfShape;
    }

}
class Circle extends  Geometri{
    double radius;

    public Circle(String nameOfShape,double radius) {
        super(nameOfShape);
        this.radius=radius;
    }

    @Override
    double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    String info() {
        return "name of shape "+nameOfShape+" Area is "+area();
    }
}
class sguare extends Geometri{
    double length;



    public sguare(String nameOfShape,int length ) {
        super(nameOfShape);
        this.length =length;
    }

    @Override
    double area() {
        return length * length;
    }

    @Override
    String info() {
        return "name of shape "+nameOfShape+" Area is "+area();
    }
}
