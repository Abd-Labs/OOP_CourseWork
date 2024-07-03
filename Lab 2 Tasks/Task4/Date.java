public class Date{
   private int day,month,year;

    //Non parametrized constructor
    public Date(){
        day=7;
        month=10;
        year=2020;
    }
    // parametrized constructor
    public Date(int day, int month, int year){
        this.day= (day>30) ? 1 : day;
        this.month= (month>12) ? 1:month;
        this.year=year;
    }

    //constructors to create a object using values of another object
    public Date(Date d){
        //copying values using constructor
        day=d.day;
        month=d.month;
        year=d.year;
    }

    // method to copy values of one object to other
    public void copy(Date d){
        day=d.day;
        month=d.month;
        year=d.year;
    }

    //set methods for day and month
    public void setday(int day){
        this.day=day;
    }
    public void setmonth(int month){
        this.month=month;
    }
    //get methods for day and month
    public int getday(){
        return day;
    }

    public int getmonth(){
        return month;
    }

    public void printDate(){
        System.out.printf("%d-%d-%d\n\n",day,month,year);
    }

}