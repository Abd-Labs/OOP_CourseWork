public class cylinder {
   private float radius;
   private float height;
// no argument constructor it will print the line when object is created without parameters
public cylinder(){
    System.out.println("This is a No argument constructor ");
}
// this constructor will initialize instance variables and also call the no parameter constructor
public cylinder(float radius, float height){
    this(); 
    this.radius=radius;
    this.height=height;
}
// setter methods of height and radius
 public void setradius(float radius){
     this.radius=radius;
 }
 public void setheight(float height){
     this.height=height;
 }
// getter methods for radius and height
 public float getradius(){
     return radius;
 }
 public float getheight(){
     return height;
 }

 public void area(){
     System.out.println("The Area of Cylinder is "+ (2*3.14*radius)*(radius+height));
}
 public void volume(){
     System.out.println("The Volume of Cylinder is "+ (3.14*radius*radius*height));
}
}
