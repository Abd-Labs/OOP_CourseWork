
package Task2;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double  commissionRate;

    public CommissionEmployee(double grossSales, double commissionRate, String firstName, String lastName, String socialSecurityNumber, Date dob) {
        super(firstName, lastName, socialSecurityNumber, dob);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double sales) {
        if(sales >= 0.0){
            this.grossSales = sales;
        }else
            throw new IllegalArgumentException("gross sales must be > 0.0");
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double rate) {
        if(rate > 0.0 && rate < 1.0){
            this.commissionRate = rate;
        }
    }

    @Override
    public double earnings() {
        return getGrossSales()*getCommissionRate();
    }

    @Override
    public String toString(){
        return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f","commission employee", super.toString(), "gross sales", getGrossSales(), "commission rate", getCommissionRate() );
    }
}
