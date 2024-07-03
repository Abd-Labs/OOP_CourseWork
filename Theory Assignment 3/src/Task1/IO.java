// This program also works for Unsorted data in file
package Task1;
import java.util.*;
import java.io.*;

public class IO {
    public static void main (String[] args) throws IOException {
        
        Scanner in = new Scanner(System.in);
      // asking name of file containing numbers from User which 
        System.out.println("Enter the name of Data file");
        String fileName = in.nextLine();
        fileName = fileName+".txt";
        
        File inputFile = new File(fileName); //creating object of File
        
        ArrayList<Integer> nums = new ArrayList<Integer>();
         //if file exist in default directory it will be read
        if (inputFile.exists()) {
            
            String line;
            //bufferedReader object
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            // reading till end of file
            while ((line =reader.readLine()) != null) {
                // Tokenizing data in file for an integer after spaces
                StringTokenizer st = new StringTokenizer(line);
                while (st.hasMoreTokens()) {
                    nums.add(Integer.parseInt(st.nextToken())); // copying integer into Array List
                }
            }
            System.out.println("Data Read Succesfully");
            reader.close();
        }
        else {
            System.out.println("No Such file exist");
            return;
        }
        
        Collections.sort(nums); //sorting array List
      //removing duplicate entries from arrayList      
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i).equals(nums.get(i-1))) {
                nums.remove(i);
            }
        }     
        Collections.reverse(nums); // Reversing the ArrayList
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt",true)); // creating writer object
        //writing array List to file
        for (Integer num : nums) {
            writer.write(num + "\n");
        }
        System.out.println("Sorted and Reversed data written to Output.txt");
        writer.close();
    }
}
