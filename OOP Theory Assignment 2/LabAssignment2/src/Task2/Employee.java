
package Task2;
public abstract class Employee {
  private String firstName;
  private String lastName;
   private String socialSecurityNumber;
   private Date dob;

    public Employee(String firstName, String lastName, String socialSecurityNumber, Date dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.dob = dob;
    }

    public Date getDob() {
        return dob;
    }
   
   
    
    // abstract method overridden by concrete subclasses        
    public abstract double earnings(); // no implementation here
    // end abstract class Employee

    @Override
    public String toString() {
        return "Employee{" + "firstName=" + firstName + ", lastName=" + lastName + ", socialSecurityNumber=" + socialSecurityNumber + ", dob=" + dob + '}';
    }
     
}
