package jobsheet2;

public class Course21 {
    String courseID;
    String name;
    int credit;
    int hour;

    public Course21(){
        courseID = "";
        name = "";
        credit = 0;
        hour = 0;
    }

  
    public Course21(String id, String name, int cr, int hour){
        courseID = id;
        this.name = name;
        credit = cr;
        this.hour = hour;
    }

    void print(){
        System.out.println("===================================================================================");
        System.out.println("Course ID: " + courseID);
        System.out.println("Full Name: "+ name);
        System.out.println("Semester Credit System: "+ credit);
        System.out.println("Total Weekly Meeting Hour: "+ hour);
    }

    void changeCredit(int newCredit){
        this.credit = newCredit;
        if (newCredit < 0){
            System.out.println("Invalid Credit");
        } else {
            System.out.println("Credit has been changed to " + newCredit);
        }
    }

    void addHour(int newHour){
        if(newHour < 0){
            System.out.println("Invalid Hour");
        } else {
            hour += newHour;
            System.out.println("Total Weekly Meeting Hour has been added by " + newHour + " to " + hour);
        }
    }

    void reducetHour(int newHour){
        if (newHour > hour || newHour < 0){
            System.out.println("Invalid Hour");
        } else {
            hour -= newHour;
            System.out.println("Total Weekly Meeting Hour has been reduced by " + newHour+ " to " + hour); 
        }

    }
}
