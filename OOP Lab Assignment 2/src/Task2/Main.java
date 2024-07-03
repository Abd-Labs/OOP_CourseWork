
package Task2;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int  age;
        float gpa;
        //Nested Try catch
        
         
        try {
            //level one try
             System.out.println("Enter your Age");
                age = in.nextInt();
                if (age>25) 
                    throw new AgeOutOfRangeException(); // if exception occurs control go to outer catch block
                
           
            try {
                //level two try 
               
                System.out.println("Enter your CGPA");
                gpa = in.nextFloat();
                if (gpa<2.5) {
                    throw new LowGpaException(); // control goes to inner catch incase of exception
                }
                //statement will be predicted if there is no exception
                System.out.println("Your application is Accepted and Under Study");
                
            }
            catch (LowGpaException exp) {
                //inner catch
                System.err.println(exp.getMessage());
                
            }
            //incase of Wrong GPA the control will again go to inner while and then try block 
            //for user input after printing message  
          
            
        } 
        catch (AgeOutOfRangeException exp) {
            //outer catch
            System.err.println( exp.getMessage());
               
        }
        // incase of wrong Age control will go to first while loop from here
        }
        }
    }

