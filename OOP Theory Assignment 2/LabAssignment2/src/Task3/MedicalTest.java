
package Task3;

public class MedicalTest {
    private int TestID;
    private String TestName;
    private double TestPrice;

    public MedicalTest(int TestID, String TestName, double TestPrice) {
        this.TestID = TestID;
        this.TestName = TestName;
        this.TestPrice = TestPrice;
    }

   
    public int getTestID() {
        return TestID;
    }

    public void setTestID(int TestID) {
        this.TestID = TestID;
    }
    

    public String getTestName() {
        return TestName;
    }

    public void setTestName(String TestName) {
        this.TestName = TestName;
    }

    public double getTestPrice() {
        return TestPrice;
    }

    public void setTestPrice(double TestPrice) {
        this.TestPrice = TestPrice;
    }

    @Override
    public String toString() {
        return "MedicalTest{" + "TestID=" + TestID + ", TestName=" + TestName + ", TestPrice=" + TestPrice + '}';
    }
    
    
}
