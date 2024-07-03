import java.util.*;

public class rect1
{
   public static void main (String[] args) 
{
   Scanner in= new Scanner(System.in);

   float height,width;
   String color;

   // asking the color of rectangle from user  
   System.out.println("Enter the color of Rectangle");
   color=in.nextLine();
   // taking input for height and width of rectangle
   System.out.println("Enter the height of Rectangle");
   height=in.nextFloat();

   System.out.println("Enter the Width of Rectangle");
   width=in.nextFloat();

   // creating new rectangle
   Rectangle r1=new Rectangle();

   // initializing values using setter methods
   r1.setcolor(color);
   r1.setheight(height);
   r1.setwidth(width);

   // printing area and perimeter of the rectangle
   System.out.println("Area of Rectangle is: "+ r1.calculateArea() );
   System.out.println("Perimeter of the Rectangle is "+ r1.calculatePerimeter());

}
}
