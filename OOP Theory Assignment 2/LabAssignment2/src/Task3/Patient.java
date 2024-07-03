
package Task3;

public class Patient {
    private String pName;
    private int pID;
    private String pDisease;

    public Patient(String pName, int pID, String pDisease) {
        this.pName = pName;
        this.pID = pID;
        this.pDisease = pDisease;
    }
    
    
    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }

   

    public String getpDisease() {
        return pDisease;
    }

    public void setpDisease(String pDisease) {
        this.pDisease = pDisease;
    }

    @Override
    public String toString() {
        return "Patient{" + "pName=" + pName + ", pID=" + pID + ", pDisease=" + pDisease + '}';
    }
    
    
}
