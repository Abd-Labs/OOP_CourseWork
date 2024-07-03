package Question1;

public class Sphere extends ThreeDimensional{

    double radius;
public Sphere(){

}
    public Sphere(double radius) {
        setRadius(radius);
        color="White";
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
        return 4* Math.PI*radius*radius;
    }

    @Override
    public double getVolume() {
        return (4/3)*Math.PI*radius*radius*radius;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                ", length=" + length +
                '}';
    }
}
