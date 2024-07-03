public class Rectangle{
private String color;
private float width;
private float height;

// getter and setter methods
public void setcolor(String color) {
    this.color=color;
}
public String getcolor(){
    return color;
}
public void setwidth(float width) {
    this.width=width;
}
public float getwidth(){
    return width;
}
public void setheight(float height) {
    this.height=height;
}
public float getheight(){
    return height;
}

//method to calculate area
public float calculateArea(){
    float area=height*width;
    return area;
}
//method for perimeter
public float calculatePerimeter(){
    float perimeter=2*(height+width);
    return perimeter;
}

}