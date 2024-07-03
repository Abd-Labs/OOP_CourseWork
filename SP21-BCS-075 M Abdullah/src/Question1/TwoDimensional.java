package Question1;

public abstract class TwoDimensional extends Shape{
    public TwoDimensional(double length) {
        this.length = length;
    }

    public TwoDimensional() {
    }

    double length;

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

    @Override
    public String toString() {
        return "TwoDimensional{" +
                "length=" + length + "Color =" + getColor()+
                '}';
    }
}
