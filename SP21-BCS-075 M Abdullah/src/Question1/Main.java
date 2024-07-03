package Question1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in) ;

        ArrayList<Shape> shapes = new ArrayList<>();
          shapes.add(new Sphere(13.2));
          shapes.add(new Circle(4.5));
          shapes.add(new Rectangle(4.65,7.9));

        for (Shape s:shapes) {
            // checking whether object is instance of 2-D or 3_D class
            if (s instanceof  TwoDimensional){ //if 2-D
                System.out.println(s);
                // print area
                System.out.println("Area of 2-D Shape is " + ((TwoDimensional) s).getarea());
            }
            if (s instanceof ThreeDimensional){ //if 3-D
                System.out.println(s);
                //printing both area and volume
                System.out.println("Area of 3-D Shape is "+ ((ThreeDimensional) s).getarea());
                System.out.println("Volume of 3-D Shape is "+ ((ThreeDimensional) s).getVolume());
            }
        }

        Circle circle2 = new Circle();
        System.out.println("Enter the Color of Sphere ");
        circle2.setColor(in.nextLine());
        System.out.println("Enter the Radius of Sphere");
        // try block for possible  IllegalArgumentException
        try {
            circle2.setRadius(in.nextDouble());
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }


        shapes.add(circle2);

        for (Shape s:shapes ) {
            // changing the color of 2-D shapes Only
            if (s instanceof TwoDimensional && s.color.equalsIgnoreCase("Purple")){
                s.setColor("Blue");
                System.out.println("Color of 2-D shape has been changed from Purple to blue");
            }

        }
    }
}
