
package Task3;

public class Doctor {
    private String docName;
    private int docID;
    private double docFee;

    public Doctor(String docName, int docID, double docFee) {
        this.docName = docName;
        this.docID = docID;
        this.docFee = docFee;
    }

    public void setDocID(int docID) {
        this.docID = docID;
    }

    public int getDocID() {
        return docID;
    }
   

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public double getDocFee() {
        return docFee;
    }

    public void setDocFee(double docFee) {
        this.docFee = docFee;
    }
    
    
    @Override
    public String toString() {
        return "Doctor{" + "docName=" + docName + ", docID=" + docID + ", docFee=" + docFee + '}';
    }
    
}
