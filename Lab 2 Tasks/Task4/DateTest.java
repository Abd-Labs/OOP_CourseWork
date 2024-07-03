import java.time.DayOfWeek;
import java.util.*;
public class DateTest
{
   public static void main (String[] args) 
{
   Scanner in= new Scanner(System.in);

   Date d1=new Date(12,11,2021);
   Date d2=new Date(23,05,2020);

   System.out.println("Date d1");
   d1.printDate();

   System.out.println();
   System.out.println("Date d2");
   d2.printDate();

 // creating d4 using values in d3
   Date d3;
   Date d4;
   d4=d3;
   d3=d2; // copying d2 into d3

   d3.setmonth(10); // changing month in d3 using setter

   d1.printDate();
   d2.printDate();
   d3.printDate();
   d4.printDate();
}
}