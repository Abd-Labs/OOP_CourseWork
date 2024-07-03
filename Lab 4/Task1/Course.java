public class Course{
    private String courseCode;
    private String courseTitle=" ";
    private int creditHrs;

    //getters setters for all private variables
    public void setCode(String courseCode){
        this.courseCode=courseCode;
    }
    public String getCode(){
        return courseCode;
    }
    public void setTitle(String courseTitle){
        this.courseTitle=courseTitle;
    }
    public String getTitle(){
        return courseTitle;
    }
    public void setCreditHrs(int creditHrs){
        this.creditHrs=creditHrs;
    }
    public int getCreditHrs(){
        return creditHrs;
    }
    
}