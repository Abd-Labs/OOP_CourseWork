package Question1;

public class Cube extends ThreeDimensional {

    public Cube(double length) {
        super(length);
        setColor("White");
    }

    @Override
    public double getarea() {
        return 6*getLength()*getLength();
    }

    @Override
    public double getVolume() {
        return getLength()*getLength()*getLength();
    }

    @Override
    public String toString() {
        return "Cube{" + "Length= "+ getLength() + "Color= " + getColor()+
                "}";
    }
}
