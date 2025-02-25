package jobsheet2;

public class Lecturer21{
    String lecturerID;
    String name;
    boolean status;
    int startYear;
    String expertiseField;

    public Lecturer21(){
        lecturerID = "";
        name = "";
        status = false;
        startYear = 0;
        expertiseField = "";
    }
  
    public Lecturer21(String id, String name, boolean status, int year, String expertiseField){
        lecturerID = id;
        this.name = name;
        this.status = status;
        startYear = year;
        this.expertiseField = expertiseField;
    }

    void print(){
        System.out.println("===================================================================================");
        System.out.println("Lecturer ID: " + lecturerID);
        System.out.println("Name: " + name);
        System.out.println("Status: " + status);
        System.out.println("Start Year: " + startYear);
        System.out.println("Expertise Field: " + expertiseField);
    }

    void setStatus(boolean newStatus){
        status = newStatus;
        System.out.println("Status has been changed to " + newStatus);
    }

    int calculateTenure(int yearNow){
        int ternure = yearNow - startYear;
        System.out.println("Tenure: " + ternure + " years");
        return ternure;
        
    }

    void changeExpertiseField(String newField){
        expertiseField = newField;
        System.out.println("Expertise Field has been changed to " + newField);
       
    }
}
