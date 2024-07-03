import java.util.*;
public class CourseMain
{
   public static void main (String[] args) 
{
    Scanner in = new Scanner(System.in);
    int totalCourses;

    System.out.println("How many Courses do u Have??");
    totalCourses= in.nextInt();


   Course [] Data = new Course[totalCourses];

for (int i=0; i<Data.length; i++) {
   Data[i]= new Course();
}

   int n=1;
   for (Course subject : Data) {
      System.out.printf("Course No : %d \n",n);
      in.nextLine();
      System.out.println("Enter Title of the Course ");
      subject.setTitle(in.nextLine());

      System.out.println("Enter the Course Code ");
      subject.setCode(in.nextLine());

      System.out.println("No of credit hours ");
      subject.setCreditHrs(in.nextInt());

      n++;
   }
   n=1;
   System.out.println("\n\n");
   for (Course subject : Data) {
      System.out.println("Data of Course"+ n);

      System.out.println("Course Title: "+ subject.getTitle());
      System.out.println("Course code: "+ subject.getCode());
      System.out.println("Credit Hours: "+ subject.getCreditHrs());

      System.out.println();
   }
}
}
