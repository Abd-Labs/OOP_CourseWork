
package Task2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        Scanner input = new Scanner(System.in);
        
        //writing some data to file first
        
        //creating objects of FIle and Object OutputStream for serialization
        FileOutputStream fout =new FileOutputStream("pets.dat");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        
        // initializing Array List for Pets  Data
        
        ArrayList<Pet> pets = new ArrayList<Pet>();
        pets.add(new Pet("Husky", 7, 34));
        pets.add(new Pet("Macaw", 2, 3));
        pets.add(new Pet("Rabbit", 1, 5));
        pets.add(new Pet("german Shepherd", 7, 43));
        pets.add(new Pet("Persian Cat", 3, 8));
        
        out.writeObject(pets); // writing ArrayLists of Pet to file through serialization
        out.close();
        fout.close();
        
        //showing the Option menu to user
        System.out.println("Select one Option :");

        System.out.println("1. Select 1 to read all pet records & display them");
        System.out.println("2. Select 2 to write all pet records (unsorted)");
        System.out.println("3. Select 3 to write all pet records (sorted by age)");
        System.out.println("4. Select 4 to write all pet records (sorted by name)");
        System.out.println("5. Select 5 to exit");
        
        int Option = input.nextInt();
        
        if (Option==1) {
            ArrayList<Pet> P = new ArrayList<>();//arrayList for deserialization

            FileInputStream fin = new FileInputStream("pets.dat");
            ObjectInputStream in = new ObjectInputStream(fin);
            P =(ArrayList) in.readObject();
            in.close(); fin.close();
            
            System.out.println(P); // printing deserialized data of pets
        }
        else if (Option==2) {
            // serializing pets data to another file
             FileOutputStream fout2 =new FileOutputStream("pets2.dat");
             ObjectOutputStream out2 = new ObjectOutputStream(fout2);
             out2.writeObject(pets);
             fout2.close();out2.close();
             
             System.out.println("Serialized again Successfully");
        }
        else if (Option==3) {
            FileOutputStream fout3 =new FileOutputStream("ageSorted.dat");
             ObjectOutputStream out3 = new ObjectOutputStream(fout3);
             Collections.sort(pets,Comparator.comparing(Pet::getAge)); //sorting the List by Age
             out3.writeObject(pets); //serializing sorted List to File
             fout3.close(); out3.close();
             
             System.out.println("age Sorted data written to file");
        }
        else if (Option==4) {
            FileOutputStream fout4 =new FileOutputStream("ageSorted.dat");
             ObjectOutputStream out4 = new ObjectOutputStream(fout4);
             Collections.sort(pets,Comparator.comparing(Pet::getName)); //sorting the List by Names of Pets
             out4.writeObject(pets); //serializing sorted by Name ArrayList to File
             fout4.close(); out4.close();
        }
        else if (Option==5) {
            System.out.println("Program Terminated");
            return;
        }
        
    }
}
