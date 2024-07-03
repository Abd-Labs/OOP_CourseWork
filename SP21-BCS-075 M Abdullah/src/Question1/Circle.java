package Question1;

public class Circle extends TwoDimensional{
    double radius;
    public Circle(){

    }
    public Circle(double radius) {

        this.radius = radius;
        setColor("white");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<0){
            throw new IllegalArgumentException();
        }
        else
        this.radius = radius;
    }

    @Override
    public double getarea() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", length=" + length +
                '}';
    }
}
