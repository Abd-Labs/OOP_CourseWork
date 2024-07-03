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
        System.out.println("Bill of Counted product"+ billTotal(cp));

        ArrayList<weighedProduct> wp = new ArrayList<>();
        wp.add(new weighedProduct(1.37,"Rice",3.00));
        System.out.println("Bill of counted Products"+ billTotal(wp));

        writeProduct(bill, "products.dat");
        readProduct(bill,"products.dat");

    }

    // generic TotalBill method which accepts only ArrayLists of Type Product or its subclass
    public static double billTotal(ArrayList<Product> T ){
        double bill=0;
        for (Product p: T) {
            bill+= p.getId();
        }
        return bill; //returning bill
    }

    public static void  writeProduct(ArrayList<Product> T, String filename) throws IOException {

        FileOutputStream fout = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(fout);

        out.writeObject(T);

        fout.close();
        out.close();
    }

    public static void  readProduct(ArrayList<Product> T, String filename) throws IOException, ClassNotFoundException {

        if (new File(filename+".dat").exists()) {

            FileInputStream fin = new FileInputStream(filename);

            ObjectInputStream in = new ObjectInputStream(fin);

            ArrayList<Product> list = new ArrayList<>();

            list = (ArrayList) in.readObject();

            for (Product p: list) {
                System.out.println(p);
            }

            fin.close();
            in.close();
        }
        else System.out.println("File Not Found");
    }

}
