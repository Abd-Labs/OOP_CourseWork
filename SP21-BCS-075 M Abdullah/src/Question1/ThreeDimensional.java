package Question1;

public abstract class ThreeDimensional extends Shape {

    double length;

    public ThreeDimensional() {
    }

    public ThreeDimensional(double length) {
        setLength(length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<0){
            throw new IllegalArgumentException();
        }
        else this.length=length;
    }
    public abstract double getarea();
    public abstract double getVolume();

    @Override
    public String toString() {
        return "ThreeDimensional{" +
                "color='" + color + '\'' +
                ", length=" + length +
                '}';
    }
}
