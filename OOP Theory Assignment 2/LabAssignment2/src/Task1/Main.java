
package Task1;

public class Main {
    public static void main(String[] args) {
        // creating object of integer set
        
        IntegerSet obj = new IntegerSet();
        
        //passing a set of integers to function which change the particular index from false to positive
        obj.SetIntegers(1,3,5,7,9);
        
        //printing the array to see the change
        for (boolean val : obj.integers) {
            System.out.print(" " + val );
        }
    }
    
}
