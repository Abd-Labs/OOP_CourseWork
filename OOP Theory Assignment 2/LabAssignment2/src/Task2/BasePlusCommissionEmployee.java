
package Task2;

public class BasePlusCommissionEmployee extends CommissionEmployee{

    private double baseSalary;

    public BasePlusCommissionEmployee(double baseSalary, double grossSales, double commissionRate, String firstName, String lastName, String socialSecurityNumber, Date dob) {
        super(grossSales, commissionRate, firstName, lastName, socialSecurityNumber, dob);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double salary) {
        if(salary >= 0.0){
            this.baseSalary = salary;
        }
    }

    // calculate earnings; override method earnings in CommissionEmployee
    @Override                                                           
    public double earnings()                                                   {                                                                   
        return getBaseSalary() + super.earnings();                       
    }
                                          
    @Override                                                          
    public String toString()                                           
    {                                                                  
        return String.format( "%s %s; %s: $%,.2f",
             "base-salaried", super.toString(),                           
            "base salary", getBaseSalary() );                            
    }
   
}