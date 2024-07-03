package Task5;
public class Course {
    private String courseCode;
    private String courseTitle;

    public Course() {
    }

    public Course(String courseCode, String courseTitle) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String toString() {
        return
                "{courseCode='" + getCourseCode() + '\'' +
                ", courseTitle='" + getCourseTitle() + "\' } ";
    }
}
