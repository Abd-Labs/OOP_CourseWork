
package q4;
import java.util.Scanner;
public class Q4 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a Number");
            double number = in.nextDouble();
        
        try {
            
            
            M1(number);
            
        } 
        catch (NegativeNumberException exp) {
            
            System.err.println(exp.getMessage());
        }
        
    }
    
    public static double M1(double num) throws NegativeNumberException {
        
        if (num>=0) {
            
            return Math.sqrt(num);
        }
        else
            throw new NegativeArraySizeException();
    }
}
