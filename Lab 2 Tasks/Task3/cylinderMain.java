import java.util.*;
public class cylinderMain
{
   public static void main (String[] args) 
{
   Scanner in= new Scanner(System.in);
   float height, radius;

   // taking input for height and radius of the cylinder
   System.out.print("Enter the radius of the Cylinder: ");
   radius=in.nextFloat();
   System.out.print("Enter the Height of the Cylinder: ");
   height=in.nextFloat();

   // creating a new cylinder object
   cylinder c1=new cylinder(radius,height); // both constructors called for a single object bcz this constructor has no parameter constructor inside it

   cylinder c2=new cylinder(); 

   // initializing radius and height of cylinder 2 through setter
   c2.setradius(2);
   c2.setheight(4);

   //calling methods to display info for first cylinder
   System.out.println("Cylinder 1");
   System.out.println("Radius"+ c1.getradius());
   System.out.println("Height"+ c1.getheight());
   c1.area(); //display volume
   c1.volume(); //display volume

   //displaying info of second cylinder
   System.out.println("\n\n Cylinder 2");
   System.out.println("Radius"+ c1.getradius());
   System.out.println("Height"+ c1.getheight());
   c1.area(); //display volume
   c1.volume(); //display volume
}
}