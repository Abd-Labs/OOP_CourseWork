package Task1;
public class carTest {
    public static void main(String[] args) {
        // creating two Objects of car
        Car c1 = new Car("Hyundai Sonata", "2019", 4350000) ;
        Car c2 = new Car("Kia Sportage","2020",5675000);

        // printing details of both car
        System.out.println("Car 1"); // toString method will be used by JDK
        System.out.println(c1);
        System.out.println("Car 2");
        System.out.println(c2);

        //Applying discount on both cars
        c1.setPrice((c1.getPrice()-(c1.getPrice()*0.05)));
        c2.setPrice((c2.getPrice()-(c2.getPrice()*0.07)));

        // printing discounted Cars
        System.out.println("Car 1 price after 5% Discount");
        System.out.println(c1.getPrice());

        System.out.println("price of Car 2 after 7% Discount");
        System.out.println(c2.getPrice());
    }
}
