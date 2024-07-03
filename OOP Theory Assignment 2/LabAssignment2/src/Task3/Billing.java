
package Task3;
import java.util.ArrayList;
public class Billing implements Payable{
    
    private int billId;
    private Doctor docInfo;
    private Patient pInfo;
    private ArrayList<Medicine> medicines;
    private ArrayList<MedicalTest> tests;
    private  int totalBill;

    public Billing(Doctor docInfo, Patient pInfo, ArrayList<Medicine> medicines, ArrayList<MedicalTest> tests) {
        setDocInfo(docInfo);
        setpInfo(pInfo);
        setMedicines(medicines);
        setTests(tests);
    }

 
    public double getPaymentAmount(){
        double medsBill=0;
        double TestsBill=0;
        
        for( Medicine med : medicines){
         medsBill = medsBill + (med.getMedPrice() * med.getMedQty());
        }
        for( MedicalTest test : tests){
            TestsBill = TestsBill + test.getTestPrice();
        }
        
        return getTotalBill(setTotalBill(medsBill+TestsBill+ docInfo.getDocFee()));
    }
    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public Doctor getDocInfo() {
        return docInfo;
    }

    public void setDocInfo(Doctor docInfo) {
        this.docInfo = docInfo;
    }

    public Patient getpInfo() {
        return pInfo;
    }

    public void setpInfo(Patient pInfo) {
        this.pInfo = pInfo;
    }

    public ArrayList<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(ArrayList<Medicine> medicines) {
        this.medicines = medicines;
    }

    public ArrayList<MedicalTest> getTests() {
        return tests;
    }

    public void setTests(ArrayList<MedicalTest> tests) {
        this.tests = tests;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }
   
}
