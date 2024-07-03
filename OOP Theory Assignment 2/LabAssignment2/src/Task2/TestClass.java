
package Task2;

public class TestClass {

    public static SalariedEmployee salariedEmployee;
    public static hourlyEmployee hourlyEmployee;
    public static CommissionEmployee commissionEmployee;
    public static BasePlusCommissionEmployee basePlusCommissionEmployee;

    public static void main(String[] args) {
   
        // create four-element Employee array
        Employee[] employees = new Employee[4];
        
        Date d1 = new Date(1,7,1997);
        Date d2 = new Date(13,1,1987);
        Date d3 = new Date(2,5,1999);
        Date d4 = new Date(7,8,1981);
        
        // initialize array with Employees
        employees[0] =  new SalariedEmployee(680000.00,"Nouman", "Ali", "A001",d1 );
        employees[1] = new hourlyEmployee(17.00, 9000,"Hafeez", "sheikh", "A002",d2 );
        employees[2] =  new CommissionEmployee(9100000, 0.04,"John", "Carter", "A003",d3 );
        employees[3] = new BasePlusCommissionEmployee(41200, 590000,.03,"Faiza", "Saleem", "A004",d4 );

        System.out.println("Employees processed polymorphically:\n");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee); // invokes toString

            System.out.printf( "Total Earnings with 10%% increase is: $%,.2f\n",(currentEmployee.earnings()*1.10));
           
            if(currentEmployee.getDob().getMonth() == 1 ){
                System.out.println("  Congratulations!! You get a bonus of 100$ on your birthday ");
                System.out.println(((currentEmployee.earnings()*1.10)+100));
            }
            if(currentEmployee instanceof BasePlusCommissionEmployee)
            {
                System.out.println(" Base Plus Commissioned Employee You get a bonus of 100$");
                System.out.println((currentEmployee.earnings()+100));
            }
        }

    }

}
