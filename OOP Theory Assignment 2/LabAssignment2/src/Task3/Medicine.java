
package Task3;

public class Medicine {
  private int medID;
  private String medName;
  private int medQty;
  private double medPrice;  

    public Medicine(int medID, String medName, int medQty, double medPrice) {
        this.medID = medID;
        this.medName = medName;
        this.medQty = medQty;
        this.medPrice = medPrice;
    }

    public int getMedID() {
        return medID;
    }

    public void setMedID(int medID) {
        this.medID = medID;
    }
    

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public int getMedQty() {
        return medQty;
    }

    public void setMedQty(int medQty) {
        this.medQty = medQty;
    }

    public double getMedPrice() {
        return medPrice;
    }

    public void setMedPrice(double medPrice) {
        this.medPrice = medPrice;
    }

    @Override
    public String toString() {
        return "Medicine{" + "medID=" + medID + ", medName=" + medName + ", medQty=" + medQty + ", medPrice=" + medPrice + '}';
    }
  
  
}
