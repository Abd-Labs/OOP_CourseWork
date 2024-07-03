
package practice;

import java.io.*;
import java.lang.invoke.MethodHandles;
import java.util.StringTokenizer;

public class FileHandling {
    public static void main(String[] args) throws IOException{
        
//        File file = new File("data.txt");
//       BufferedReader reader = new BufferedReader(new FileReader(file));
//       
//       String line;
//       
//        while ((line = reader.readLine()) != null) {
//            
//            StringTokenizer token = new StringTokenizer(line);
//            
//            int id=0; String name=""; Double price =0.0;
//            
//            int i=1;
//            
//            int noOfTokens = token.countTokens();
//            
//           while(token.hasMoreTokens()){
//               if (i==1) {
//                   id = Integer.parseInt(token.nextToken());
//               }
//               if (i>1 && i<noOfTokens) {
//                   
//                   name = name + token.nextToken();
//               }
//               if (i==noOfTokens) {
//                   
//                   price = Double.parseDouble(token.nextToken());
//               }
//               i++;
//           }
//           
//            System.out.println("Product ID   "+ id + "Name " + name + "Price" + price);
//           
//        }
//       
//        reader.close();
        
          BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
          
          String line ="444 Product 4 555.55 ";
          
          writer.write(line+ "\n");
    }
  
}
