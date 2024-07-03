
package Task1;

public class IntegerSet {
    boolean[] integers = new boolean[101];
    
    /* no need to set values to false in No argument constructor because boolean type array already has "false"
       as default value on each index */
    
    
     public void SetIntegers(int ... num){ //using variable length argument for set of Integer inputs
        for (int i : num) {
            if (i>=0 && i<=100) {
                integers[i]=true;
            }
        }
    }
}
