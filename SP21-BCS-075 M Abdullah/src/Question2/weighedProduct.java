package Question2;

public class weighedProduct extends Product{
    private double weight;


    public weighedProduct(double weight, String name, double price ) {
        super(name, price);
        this.weight = weight;
    }

    public weighedProduct(int id, String name, double price, int weight) {
        super(id, name, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice(){
        return getPrice()*weight;
    }
    @Override
    public String toString() {
        return "weighedProduct{" + super.toString()+
                "weight=" + weight +
                '}';
    }
}
