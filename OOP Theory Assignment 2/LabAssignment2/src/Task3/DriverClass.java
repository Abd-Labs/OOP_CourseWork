
package Task3;

import java.util.ArrayList;
import java.util.Scanner;

public class DriverClass {
    
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        
        ArrayList<Medicine> MedList = new ArrayList<Medicine>();
        
        Medicine [] meds = new Medicine[5];
        
        // asking name price and quantity of medicines from user
        int id=101;
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter the Name of Medicine No "+ (i+1)); 
            String medName = in.nextLine();
            System.out.println("Enter the price");
            double price = in.nextDouble();
            System.out.println("Enter Quantity");
            int Q = in.nextInt();
            
            meds[i] = new Medicine(id, medName, Q, price);
            
            id++;
        }
        // storing these medicines in arrayLists
        ArrayList<Medicine> med1 = new ArrayList<Medicine>();
        med1.add(meds[0]);
        med1.add(meds[2]);
        
        ArrayList<Medicine> med2 = new ArrayList<Medicine>();
        med2.add(meds[1]);
        med2.add(meds[2]);
        med2.add(meds[3]);
        
        ArrayList<Medicine> med3 = new ArrayList<Medicine>();
        med3.add(meds[0]);
        med3.add(meds[2]);
        med3.add(meds[1]);
        
        // creatig and storing objects of medical tests 
        
        ArrayList<MedicalTest> t1 = new ArrayList<MedicalTest>();
        t1.add(new MedicalTest(11, "CPH", 3400));

        ArrayList<MedicalTest> t2 = new ArrayList<MedicalTest>();
        t2.add(new MedicalTest(22, "Amylase", 9500));
        t2.add(new MedicalTest(33, "Lactase", 10300));

        ArrayList<MedicalTest> t3 = new ArrayList<MedicalTest>();
        t3.add(new MedicalTest(44, "TSH", 3200));
        t3.add(new MedicalTest(55, "CTR", 12500));
        //patient objects
        Patient p1 = new Patient("Akbar", 111, "Bronchitis");
        Patient p2 = new Patient("Aslam", 222, "Angina");
        Patient p3 = new Patient("Naeem", 333, "Kidney Stones");
        //Doctor Objects
        Doctor d1 = new Doctor("Dr Muneer Ahmad", 2, 3500);
        Doctor d2 = new Doctor("Dr Salman Rafiq",3,2500);
        Doctor d3 = new Doctor("Dr Arshad Iqbal", 7, 5500);
        
        // bill objects
        Billing bill1 = new Billing(d1,p1,med1,t1);
        bill1.setBillId(1011);

        Billing bill2 = new Billing(d2,p2,med2,t2);
        bill2.setBillId(1019);

        Billing bill3 = new Billing(d3,p3,med3,t3);
        bill3.setBillId(2108);
        //storing bill objects in Payables Array
        ArrayList<Payable> payables = new ArrayList<Payable>();
        payables.add(bill1);
        payables.add(bill2);
        payables.add(bill3);
        
        double guess;
        
        System.out.println("Guess the total bill");
        guess = in.nextDouble();
        
        int c=1;
        for (Payable payable : payables) {
         
            if (payable.getPaymentAmount()>=guess) {
                
                System.out.println("Total Bill for Bill"+ c + " is "+ payable.getPaymentAmount());
            }
            c++;
        }
        Doctor[] doc = new Doctor[2];
        int a=0;
        for (Payable payable : payables) {
            
            if (2 == payable.getDocInfo().getDocID()) {
                doc[a]= (Doctor) payable.getDocInfo();  
               a++;
        }
        
}
