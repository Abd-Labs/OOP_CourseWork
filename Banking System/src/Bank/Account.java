
package Bank;

import java.io.Serializable;
import java.time.Year;

public class Account implements Serializable{
    private long cnic;
    private String name;
    private String type;
    private String Occupation;
    private String Investmentperiod;
    private int age;
    private double Balance;
    private int Pin;
   
    Account(Long cnic, String name, int Age, String Occupation, String Type, String Period, double balance , int pin) {
        setCnic(cnic);
        setName(name);
        setAge(Age);
        setOccupation(Occupation);
        setType(Type);
        setInvestmentPeriod(Period);
        setBalance(balance);
        setPin(pin);
    }

    public int getPin() {
        return Pin;
    }

    public void setPin(int Pin) {
        this.Pin = Pin;
    }
    
    
    
    public long getCnic() {
        return cnic;
    }

    public void setCnic(long cnic) {
        this.cnic = cnic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInvestmentPeriod() {
        return Investmentperiod;
    }

    public void setInvestmentPeriod(String period) {
        this.Investmentperiod = period;
    }

    

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String Occupation) {
        this.Occupation = Occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }
    
    
    
    
    
    
}
