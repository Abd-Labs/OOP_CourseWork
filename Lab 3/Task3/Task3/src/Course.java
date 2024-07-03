import java.util.*;
public class Course {
    static int noOfStudents;
    static Scanner in = new Scanner(System.in);
    static {
        
        System.out.println("Enter the No of Students");
        noOfStudents = in.nextInt();
    }
    
    String courseTitle;
    int [][] marks = new int[noOfStudents][];
    
    public Course(){
        
    }
    
}
