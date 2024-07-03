
package Task2;

public class hourlyEmployee extends Employee{
  private double wage; //wage per hour
  private double hours;// hours worked for week

    public hourlyEmployee(double wage, double hours, String firstName, String lastName, String socialSecurityNumber, Date dob) {
        super(firstName, lastName, socialSecurityNumber, dob);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double hourlyWage) {
        if(hourlyWage >= 0.0){
            this.wage = hourlyWage;
        }else
            throw  new IllegalArgumentException("HourLY Wage must be >=0.0");
    }
   

    public double getHours() {
        return hours;
    }

    public void setHours(double hourWorked) {
        if(hourWorked >= 0.0){
           this.hours = hourWorked;
        }
    }

    @Override
    public double earnings() {
        if(getHours() <= 40){
            return getWage()*getHours();
        }else{
            return getWage()*getHours()+(getHours()-40)*getWage()*1.5;
        }
    }

    @Override                                                            
    public String toString()                                             
    {                                                                    
         return String.format( "hourly employee: %s\n%s: $%,.2f; %s: %,.2f", super.toString(), "hourly wage" , getWage(), "hours worked", getHours() );
    }
}
