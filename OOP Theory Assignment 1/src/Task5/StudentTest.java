package Task5;
import java.util.*;
public class StudentTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Address details of user 1
        System.out.println("Enter your Street Address ");
        String stAdd = in.nextLine();
        System.out.println("Town name");
        String town = in.nextLine();
        System.out.println("City name");

        Address postalAddress = new Address(stAdd, town, in.nextLine(), "Pakistan");

        System.out.println("Enter your name");
        String name = in.nextLine();
        System.out.println("Your CNIC No");

        Student s1 = new Student(name, in.nextLine() , postalAddress);
        // student 1 email
        s1.setEmail("abdullah1525@gmail.com");

        Course c1 = new Course();
        // taking input for course 1 from user and setting them using setters
        System.out.println("Enter Course title of your first Course");
        in.next();
        c1.setCourseTitle(in.nextLine());
        System.out.println("Course Code?");
        c1.setCourseCode(in.nextLine());
        //passing course 1 to setter
        s1.setCourse1(c1);

        System.out.println("Enter Course title of your Second Course");
        String title = in.nextLine();
        System.out.println("Course Code?");
        Course c2 =new Course(in.nextLine(),title); //creating course 2 using construcor

        s1.setCourse2(c2);
        // phone number of student 1
        PhoneNumber p1 = new PhoneNumber(92,307,2027474);
        s1.setContact(p1);
        // printing student 1 details using toString Method
        System.out.println("Student 1");
        System.out.println(s1);

        Student s2 = new Student("Tayyab","338734728",postalAddress);
        s2.setEmail("abdulla1355@gmail.com");
        // creating and setting Course objects for student 2
        Course c3 = new Course("PHY322","Modern Physics");
        Course c4 = new Course("PHY122","DLD");

                s2.setCourse1(c3);
                s2.setCourse2(c4);
                // setting phone number for student 2
        PhoneNumber p2 = new PhoneNumber(92,342,7828742);
        s2.setContact(p2);

        // printing details of student 2 using composition concept
        System.out.println("Student 2");
        System.out.println("Name: "+ s2.getName()+"\n CNIC: "+s2.getCnic()+ "\nEmail: " +s2.getEmail()
                + "\n Course 1 => " + "Title:" + s2.getCourse1().getCourseTitle()+"\t Course Code:" +s2.getCourse1().getCourseCode()
                +"\n Course 2 => " + "Title:" + s2.getCourse2().getCourseTitle()+"\t Course Code:" +s2.getCourse2().getCourseCode()
                +"\nContact Info=> "+ s2.getContact().getCountryCode()+s1.getContact().getCityCode()+s2.getContact().getLineNo()
                +"\nPostal Address=>"+ s2.getPostalAddress().getStreetAddress()+"  "+s2.getPostalAddress().getTown()
                +"  "+s2.getPostalAddress().getCountry()+"  "
                +s2.getPostalAddress().getCity());

    }
}
