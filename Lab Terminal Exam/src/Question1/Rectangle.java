package Question1;

public class Rectangle extends TwoDimensional{
    double width;

    public Rectangle(double length, double width) {
        super(length);
        this.width = width;
        setColor("White");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<0){
            throw new IllegalArgumentException();
        }
        else
        this.width = width;
    }

    @Override
    public double getarea() {
        return length * width ;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", color='" + getColor() + '\'' +
                ", length=" + length +
                '}';
    }
}
