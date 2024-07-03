
package Task2;

public class SalariedEmployee extends Employee{

    private double weeklySalary; 

    public SalariedEmployee(double weeklySalary, String firstName, String lastName, String socialSecurityNumber, Date dob) {
        super(firstName, lastName, socialSecurityNumber, dob);
        this.weeklySalary = weeklySalary;
    }

    
    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double salary) {
        if(salary >= 0.0){
            this.weeklySalary = salary;
        }
    }

    @Override
    public double earnings() {
        return  getWeeklySalary();
    }

    @Override
    public String toString() {
        return 
                "SalariedEmployee{" 
                + super.toString() 
                + "weeklySalary=" + weeklySalary + '}';
    }

   
}
