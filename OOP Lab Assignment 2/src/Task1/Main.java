
package Task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        Shape [] shapes = new Shape[4];
        shapes[0]= new Circle(3.4, "Purple", true);
        shapes[1]= new Rectangle(4.57,3.55, "red", false);
        shapes[2]= new Rectangle(9.57,7.35," Orange", true);
        shapes[3]= new Circle(4.44, "Grey", false);
        
        System.out.println("(1) Circle        (2)  Rectangle");
        System.out.println("Enter your Choice (1 Or 2):\n ");
        int choice = in.nextInt();
        while (choice != 1 && choice!= 2) {            
            System.out.println("Choose from available Option");
            choice = in.nextInt();
        }
        
        if (choice==1) {
           
            System.out.println("\n\n Enter the Radius of the Circle");
            double radius = in.nextDouble();
            for (int i = 0; i < 4; i++) {
            if (shapes[i] instanceof Circle) {
                Circle c = (Circle) shapes[i];
                
                c.setRadius(radius);
            } }
            }
        if (choice == 2) {
            System.out.println("Enter the Length of recctangle");
            double length = in.nextDouble();
            System.out.println("Enter the Width of Rectangle");
            double width = in.nextDouble();
            
            for (int i = 0; i < 4; i++) {
            if (shapes[i] instanceof Rectangle) {
                Rectangle r = (Rectangle) shapes[i];
                
               r.setLength(length);
               r.setWidth(width); 
            }
        } }
        shapesSummary(shapes);
    }
     public static void shapesSummary(Shape[] shapes){
         for (Shape shape : shapes) {
             System.out.println("Area of Shape is "+ shape.getArea());
             System.out.println("Perimeter of the Shape is "+ shape.getPerimeter());
             
             System.out.println("Other details\n"+ shape);
             
         }
     }
}

