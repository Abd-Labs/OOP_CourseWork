package Question2;

public class CountedProduct extends Product{
    private int quantity;

    public CountedProduct(int id, String name, double price, int quantity) {
        super(id, name, price);
        this.quantity = quantity;
    }

    public CountedProduct(int quantity,String name, double price) {
        super(name, price);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getBill(){
        return getPrice()*quantity;
    }
    @Override
    public String toString() {
        return "CountedProduct{" + super.toString()+
                "quantity=" + quantity +
                '}';
    }
}

