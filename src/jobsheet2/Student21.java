package jobsheet2;

public class Student21 {
    String studentID;
    String name;
    String className;
    double gpa;

    public Student21(){ 
    }

  
    public Student21(String id, String name, String cls, double gpa){
        this.studentID = id;
        this.name = name;
        this.className = cls;
        this.gpa = gpa;
    }

    void print(){
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: "+ name);
        System.out.println("Class: "+ className);
        System.out.println("GPA: "+ gpa);
    }
    void changeClass(String newClass){
        this.className = newClass;
    }
    void updateGPA(double newGPA){
        gpa = newGPA;
        if (gpa < 0.0 || gpa > 4.0){
            System.out.println("Invalid GPA");
        }
    }
    String evaluate(){
        if (gpa >= 3.5){
            return "Excellent";
        } else if (gpa >= 3.0){
            return "Good";
        } else if (gpa >= 2.0){
            return "Fair";
        }else{
            return "Poor";
        }
    }
}
