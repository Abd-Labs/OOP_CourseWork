package Question2;

import java.io.*;
import java.util.ArrayList;

public class ProductTest {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ArrayList<Product> bill = new ArrayList<>();
        bill.add(new weighedProduct(1.37,"Rice",3.00));
        bill.add(new CountedProduct(10,"Pens",40));
        bill.add(new CountedProduct(10,"Pencils", 10));
        System.out.println("Total Bill "+ billTotal(bill));

        ArrayList<CountedProduct> cp = new ArrayList<CountedProduct>();

        cp.add(new CountedProduct(10,"Pens", 4.5));
        cp.add(new CountedProduct(10,"Pencils",20));
        System.out.println("Bill of Counted product  "+ billTotal(cp));

        ArrayList<weighedProduct> wp = new ArrayList<>();
        wp.add(new weighedProduct(1.37,"Rice",3.00));
        System.out.println("Bill of counted Products  "+ billTotal(wp));

        writeProduct(bill, "products.dat");
        readProduct(bill,"products.dat");

    }

    // generic TotalBill method which accepts only ArrayLists of Type Product or its subclass
    public static <T extends Product> double billTotal(ArrayList<T> list ){
        double bill=0;
        for (Product p: list) {
            bill+= p.getPrice();
        }
        return bill; //returning bill
    }

    public static <T extends Product> void  writeProduct(ArrayList<T> list, String filename) throws IOException {

        FileOutputStream fout = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(fout);

        out.writeObject(list);

        fout.close();
        out.close();
    }

    public static <T extends Product> void  readProduct(ArrayList<T> list, String filename) throws IOException, ClassNotFoundException {

        if (new File(filename).exists()) {

            FileInputStream fin = new FileInputStream(filename);

            ObjectInputStream in = new ObjectInputStream(fin);
            
            list = (ArrayList) in.readObject();

            for (Product p: list) {
                System.out.println(p +" .......");
            }

            fin.close();
            in.close();
        }
        else System.out.println("File Not Found");
    }

}
